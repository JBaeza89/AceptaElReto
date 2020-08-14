/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer115;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER115 {

    Scanner in;

    public boolean caso() {
        long numero = in.nextLong();
        if (numero == 0) {
            return false;
        }
        String cuadrado = Long.toString(numero * numero);
        boolean krapekar = false;
        for (int i = 1; i < cuadrado.length(); i++) {
            int a = Integer.parseInt(cuadrado.substring(0, i));
            int b = Integer.parseInt(cuadrado.substring(i));
            if (b > 0) {
                krapekar = a + b == numero;
            }
            if (krapekar) {
                break;
            }
        }
        if (krapekar || numero == 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER115().run();
    }

}
