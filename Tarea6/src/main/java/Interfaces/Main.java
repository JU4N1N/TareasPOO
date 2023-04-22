package Interfaces;

import Interfaces.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println(" El área es = " + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println(" El área del círculo es = " + circulo.calcularArea());
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Música");
        ada.setDeporte("Basketball");
        System.out.println(ada);
        ada.enseyar("Guitarra");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");
    }
}
