import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase Auto
        Auto auto1 = new Auto("Hyundai", "Accent", "Blanco");
        Auto auto2 = new Auto("Fiaat", "Uno Way", "Blanco");

        // Imprimir los atributos de cada auto
        System.out.println("Auto 1: " + auto1.marca + " " + auto1.modelo + " " + auto1.color);
        System.out.println("Auto 2: " + auto2.marca + " " + auto2.modelo + " " + auto2.color);
    }
}
