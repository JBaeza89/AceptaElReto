/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer138;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER138 {

    Scanner in;
    
    public void caso() {
        int factorial = in.nextInt();
        int acumuladorCeros = 0;
        int exponente = 1;
        while (true) {
            long ceros = factorial / (long)Math.pow(5, exponente);
            if (ceros == 0) {
                break;
            }
            acumuladorCeros += ceros;
            exponente++;
            
        } 
        System.out.println(acumuladorCeros);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER138().run();
    }
    
}
