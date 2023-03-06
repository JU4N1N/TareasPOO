package Clases;

import java.awt.*;

public class Perrodriver {
    public static void main(String[] args) {

        Perro perrito = new Perro("Husky", "Max");

        perrito.setEdad(5);
        perrito.setColor(Color.gray);
        perrito.setPeso(22);

        System.out.println(perrito.ladrar());
        System.out.println("---------------");
        System.out.println(perrito.jugar());
        System.out.println("---------------");
        perrito.llamar();{
        }
        System.out.println("---------------");
        System.out.println(perrito);
    }
}
