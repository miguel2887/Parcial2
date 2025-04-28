public class TestJuego {
    public static void main(String[] args){
        Robot robot = new Robot();
    Hombre hombre1 = new Hombre("Carlos");
    System.out.println("Primer jugador: " + hombre1.obtenerNombre());
    hombre1.jugarConRobot(robot);

    Hombre hombre2 = new Hombre("Luis");
        System.out.println("\n Segundo jugador: " + hombre2.obtenerNombre());
        hombre1.jugarConRobot(robot);
    if (robot.estaDormido()){
        System.out.println("El robot esta dormido. " + hombre2.obtenerNombre() + "lo despertara.");
    }
    hombre2.jugarConRobot(robot);
    System.out.println("\nEstado final del robot: ");
        System.out.println("Energia: " + robot.energiaActual());
        System.out.println("¿Esta dormido?:  " + (robot.estaDormido() ? "Si" : "No" ));
    }
}

