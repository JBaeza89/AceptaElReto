/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer224;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER224 {

    Scanner in;
    
    public boolean caso() {
        int numeroCortezas = in.nextInt();
        if (numeroCortezas == 0) {
            return false;
        }
        int[] cortezas = new int[numeroCortezas];
        for (int i = 0; i < numeroCortezas; i++) {
            cortezas[i] = in.nextInt();
        }
        int acumulado = 0;
        int posicion = -1;
        for (int i = numeroCortezas - 1; i >= 0; i--) {
            
            if (cortezas[i] == acumulado) {
                posicion = i + 1;
            }
            acumulado += cortezas[i];
        }
        if (posicion == -1) {
            System.out.println("NO");
        } else {
            System.out.println("SI " + posicion);
        }
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER224().run();
    }
    
}
