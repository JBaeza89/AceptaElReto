/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer106;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER106 {

    Scanner in;

    public boolean caso() {
        String codigo = in.next();
        if (codigo.equals("0")) {
            return false;
        }
        if (codigo.length() > 13) {
            System.out.println("NO");
            return true;
        }
        int suma = 0;
        boolean control = true;
        for (int i = codigo.length() - 1; i >= 0; i--) {
            if (control) {
                suma += codigo.charAt(i) - '0';
            } else {
                suma += 3 * (codigo.charAt(i) - '0');
            }
            control = !control;
        }
        if (suma % 10 != 0) {
            System.out.println("NO");
        } else {
            System.out.print("SI");
            if (codigo.length() > 8) {
                if (codigo.length() < 13 || codigo.startsWith("0")) {
                    System.out.println(" EEUU");
                } else if (codigo.startsWith("380")) {
                    System.out.println(" Bulgaria");
                } else if (codigo.startsWith("50")) {
                    System.out.println(" Inglaterra");
                } else if (codigo.startsWith("539")) {
                    System.out.println(" Irlanda");
                } else if (codigo.startsWith("560")) {
                    System.out.println(" Portugal");
                } else if (codigo.startsWith("70")) {
                    System.out.println(" Noruega");
                } else if (codigo.startsWith("759")) {
                    System.out.println(" Venezuela");
                } else if (codigo.startsWith("850")) {
                    System.out.println(" Cuba");
                } else if (codigo.startsWith("890")) {
                    System.out.println(" India");
                } else {
                    System.out.println(" Desconocido");
                }
            } else {
                System.out.println();
            }
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER106().run();
    }

}
