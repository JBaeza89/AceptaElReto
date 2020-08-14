/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer241;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER241 {

    Scanner in;

    public void caso() {
        int hojas = in.nextInt();
        int contador = 0;
        boolean posible = true;
        while (hojas % 3 != 0 && posible) {
            hojas -= 4;
            contador++;
            contador %= 4;
            if (hojas < 0) {
                posible = false;
            }
        }
        System.out.println(posible? contador : "IMPOSIBLE");
        
    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER241().run();
    }
    
}
