package Clases;

import java.awt.*;

public class Pericodriver {
    public static void main(String[] args) {
        Perico paquito = new Perico("Australiano", "Paco", Color.green);

        paquito.setPeso(45);
        paquito.setEdad(6);

        System.out.println(paquito.comer());
        System.out.println("---------------");
        paquito.picotazo();{
        }
        System.out.println("---------------");
        System.out.println(paquito.hablar());
        System.out.println("---------------");
        System.out.println(paquito);

    }
}
