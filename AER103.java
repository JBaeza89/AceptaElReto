/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer103;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER103 {

    Scanner in;
    
    public boolean caso() {
        int grado = in.nextInt();
        if (grado == 20) {
            return false;
        }
        int[] polinomio = new int[grado + 1];
        for (int i = grado; i >= 0; i--) {
            polinomio[i] = in.nextInt();
        }
        int rectangulos = in.nextInt();
        double base = (double)1 / rectangulos;
        double cain = 0;
        for (int i = 0; i < rectangulos ; i++) {
            double posX = i * base;
            double valorFuncion = 0;
            for (int j = grado; j >= 0; j--) {
                valorFuncion += polinomio[j] * Math.pow(posX, j);
            }
            if (valorFuncion > 1) {
                valorFuncion = 1;
            }
            if (valorFuncion < 0) {
                valorFuncion = 0;
            }
            cain += base * valorFuncion;
        }
        double abel = 1 - cain;
        if (Math.abs(cain - abel) < 0.001) {
            System.out.println("JUSTO");
        } else {
            System.out.println(cain > abel ? "CAIN" : "ABEL"); 
        }
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER103().run();
    }
    
}
