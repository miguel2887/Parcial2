public class Robot {
    private Bateria bateria;
    private boolean dormido;


    public Robot() {
        bateria = new Bateria(1000);
        dormido = false;
    }

    public void avanzar(int pasos) {
        if (dormido) {
            System.out.println("El robot está dormido y no puede avanzar.");
            return;
        }
        if (bateriaVacia()) {
            System.out.println("La batería está vacía. No puede avanzar.");
            return;
        }

        int consumo = calcularConsumo(pasos);

        if (bateria.getCarga() < consumo) {
            System.out.println("Cantidad de energía insuficiente para avanzar " + pasos + " pasos.");
            return;
        }

        bateria.setCarga(bateria.getCarga() - consumo);
        System.out.println("El robot avanza " + pasos + " pasos. Carga restante: " + bateria.getCarga());
    }

    public void retroceder(int pasos) {
        if (dormido) {
            System.out.println("El robot está dormido y no puede retroceder.");
            return;
        }
        if (bateriaVacia()) {
            System.out.println("La batería está vacía. No puede retroceder.");
            return;
        }

        int consumo = calcularConsumo(pasos);

        if (bateria.getCarga() < consumo) {
            System.out.println("Cantidad de energía insuficiente para retroceder " + pasos + " pasos.");
            return;
        }

        bateria.setCarga(bateria.getCarga() - consumo);
        System.out.println("El robot retrocede " + pasos + " pasos. Carga restante: " + bateria.getCarga());
    }

    private int calcularConsumo(int pasos) {
        if (pasos >= 100) {
            return (pasos / 100) * 10;
        } else if (pasos >= 50) {
            return 5;
        } else if (pasos >= 40) {
            return 4;
        } else if (pasos >= 30) {
            return 3;
        } else if (pasos >= 20) {
            return 2;
        } else if (pasos >= 10) {
            return 1;
        }
        return 0;
    }

    public void dormir() {
        dormido = true;
        System.out.println("El robot ahora está dormido.");
    }

    public void despertar() {
        dormido = false;
        System.out.println("El robot ahora está despierto.");
    }

    public void recargar() {
        bateria.setCarga(1000);
        System.out.println("El robot se ha recargado a 1000 unidades.");
    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return bateria.getCarga();
    }

    public boolean estaDormido() {
        return dormido;
    }
}
