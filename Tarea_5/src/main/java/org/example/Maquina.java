package org.example;

import java.util.Scanner;

public class Maquina {
    public static void main(String[] args) {
        tarea maquina = new tarea(5000, 1000, 1500, 50);
        maquina.setAgua(5000);
        maquina.setCafe(1000);
        maquina.setCrema(1500);
        maquina.setVaso(50);
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Buen día, ingrese que tipo de café le gustaria (contamos con Americano, Expreso y Capuchino): ");
        String input = teclado.nextLine();
        if (input.equals("Americano")) {
            maquina.Americano();
        }
        if (input.equals("Expreso")) {
            maquina.Expreso();
        }
        if (input.equals("Capuchino")) {
            maquina.Capuchino();
        }
    }
}
