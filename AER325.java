/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer325;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER325 {

    Scanner in;
    boolean primero;
    
    public void annadirBolas(String helado, int c, int v) {
        if (c > 0) {
            annadirBolas(helado + "C", c - 1, v); 
        }
        if (v > 0) {
            annadirBolas(helado + "V", c, v - 1);
        }
        if (c == 0 && v == 0) {
            if (primero) {
                System.out.print(helado);
                primero = false;
            } else {
                System.out.print(" " + helado);
            }
        }
    }
    
    public void caso() {
        int chocolate = in.nextInt();
        int vainilla = in.nextInt();
        primero = true;
        annadirBolas("", chocolate, vainilla);
        System.out.println();
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER325().run();
    }
    
}
