package String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre, profesión y país de origen en ese orden");
        String entrada = teclado.nextLine();
        String[] sep = entrada.trim().split(" ");
        System.out.println("Nombre: " + sep[0].toUpperCase() + "\nProfesión: " + sep[1].toUpperCase() + "\nPaís de origen: " + sep[2].toUpperCase());
    }
}