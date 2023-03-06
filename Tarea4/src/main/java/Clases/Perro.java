package Clases;

import java.awt.*;

public class Perro {
    private String raza;
    private String nombre;
    private int edad;
    private Color color;
    private float peso;

    public Perro() {
    }

    public Perro(String raza, String nombre, int edad, Color color, float peso) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }



    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0 && edad <= 15) {
            this.edad = edad;
        }else{
            System.out.println("Mi husky no puede ser más grande que eso");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float peso) {
        if(peso > 0 && peso < 28.0) {
            this.peso = peso;
        }else{
            System.out.println("Mi husky no es tan gordo :/");
        }
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color=" + color +
                ", peso=" + peso +
                '}';
    }

    public boolean ladrar() {
        System.out.println(nombre + " está ladrando fuertemente?");
        boolean res = Math.random() > 0.41;
        return res;
    }

    void llamar() {
        if (nombre == "Max") {
            System.out.println(nombre + " viene corriendo hacia ti");
        } else {
            System.out.println(nombre + " te ignorará");
        }
    }

    public boolean jugar() {
        System.out.println("¿" + nombre + "quiere jugar?");
        boolean juego = Math.random() > 0.41;
        return juego;
    }
}