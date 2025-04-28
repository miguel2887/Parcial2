import java.util.Scanner;

public class Hombre {
    private String nombre;


    public Hombre(String nombre) {
        nombre = nombre;
    }
    public String obtenerNombre() {
        return nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Control del Robot ---");
            System.out.println("1. Avanzar");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver energía actual");
            System.out.println("4. Dormir al robot");
            System.out.println("5. Despertar al robot");
            System.out.println("6. Recargar batería");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de pasos a avanzar: ");
                    int pasosAvanzar = scanner.nextInt();
                    if (robot.estaDormido()) {
                        System.out.println("El robot está dormido. No puede avanzar.");
                    } else if (robot.bateriaVacia()) {
                        System.out.println("La batería está vacía. No puede avanzar.");
                    } else {
                        robot.avanzar(pasosAvanzar);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de pasos a retroceder: ");
                    int pasosRetroceder = scanner.nextInt();
                    if (robot.estaDormido()) {
                        System.out.println("El robot está dormido. No puede retroceder.");
                    } else if (robot.bateriaVacia()) {
                        System.out.println("La batería está vacía. No puede retroceder.");
                    } else {
                        robot.retroceder(pasosRetroceder);
                    }
                    break;
                case 3:
                    System.out.println("Energía actual del robot: " + robot.energiaActual());
                    break;
                case 4:
                    robot.dormir();
                    break;
                case 5:
                    robot.despertar();
                    break;
                case 6:
                    robot.recargar();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (!robot.estaDormido());

        System.out.println("\nEl robot está dormido. Fin del control.");
    }
}
