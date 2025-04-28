public class Bateria {
    private int carga;

    public Bateria(int cargaInicial) {
        carga = cargaInicial;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int nuevaCarga) {
        if (nuevaCarga >=0) {
            carga = nuevaCarga;
        }else {
            System.out.println("la carga no puede ser negativa");
        }
    }
}
