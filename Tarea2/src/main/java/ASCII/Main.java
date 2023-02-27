package ASCII;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduce 3 caracteres: ");
        String input = teclado.nextLine();
        System.out.println("Tecleaste:" + input);
        char u = input.charAt(0);
        int prim = (int) u;
        char d = input.charAt(1);
        int seg = (int) d;
        char t = input.charAt(2);
        int ter = (int) t;
        boolean r = comparar(prim, seg, ter);
        System.out.println(r);

    }
    public static boolean comparar(int n, int m, int p) {
        boolean respuesta;

        if(n > m && m > p) {
            respuesta = false;
        }else {
            respuesta = true;
        }
        return respuesta;
    }
}
