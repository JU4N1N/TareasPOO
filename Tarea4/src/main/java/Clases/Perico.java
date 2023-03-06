package Clases;

import java.awt.*;

public class Perico {
    private String raza;
    private String nombre;
    private int edad;
    private double peso;
    private Color color;


    public Perico() {
    }

    public Perico(String raza, String nombre, int edad, double peso, Color color) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
    }

    public Perico(String raza, String nombre, Color color) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
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
        if(edad > 0 && edad <= 8) {
            this.edad = edad;
        }else{
            System.out.println("Paquito no es tan mayor :/");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0 && peso < 41) {
            this.peso = peso;
        }else{
            System.out.println("Paquito es gordito pero no tanto :/");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perico{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", color=" + color +
                '}';
    }

    public boolean comer(){
        System.out.println("¿" + nombre + " está comiendo?");
        boolean resul = Math.random() > 0.52;
        return resul;
    }

    public boolean hablar(){
        System.out.println("¿" + nombre + " te está imitando?");
        boolean charla = Math.random() > 0.52;
        return charla;
    }

    void picotazo(){
        if(nombre != "Paco"){
            System.out.println(nombre + " Te está atacando");
        }else{
            System.out.println("Le caiste bien a el gran paquito (:");
        }

    }
}
