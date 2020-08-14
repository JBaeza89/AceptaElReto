/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer194;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER194 {

    Scanner in;

    public void caso() {
        String carretera = in.next();
        int contador = 0;
        boolean izquierda = false;
        boolean tunel = false;
        for (int i = 0; i < carretera.length(); i++) {
            char x = carretera.charAt(i);
            if (izquierda) {
                contador++;
                tunel = true;
                izquierda = false;
            } else if (tunel) {
                tunel = false;
            } else if (x == '.') {
                izquierda = true;
            }
        }
        if (izquierda) {
            contador++;
        }
        System.out.println(contador);
    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER194().run();
    }

}
