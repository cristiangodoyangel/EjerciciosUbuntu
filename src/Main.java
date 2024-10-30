import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase Auto
        Auto auto1 = new Auto("Hyundai", "Accent", "Blanco");
        Auto auto2 = new Auto("Fiat", "Uno Way", "Blanco");

        // Imprimir los atributos de cada auto usando getters
        System.out.println("Auto 1: " + auto1.getMarca() + " " + auto1.getModelo() + " " + auto1.getColor());
        System.out.println("Auto 2: " + auto2.getMarca() + " " + auto2.getModelo() + " " + auto2.getColor());

        // Cambiar los atributos de auto1 usando setters
        auto1.setMarca("Ferrari");
        auto1.setModelo("Lambo");
        auto1.setColor("Amarillo Bumblebee");

        // Imprimir los atributos de auto1 después de cambiarlos
        System.out.println("Auto 1: " + auto1.getMarca() + " " + auto1.getModelo() + " " + auto1.getColor());
    }
}

