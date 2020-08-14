/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer179;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER179 {

    Scanner in;
    public boolean caso() {
        int molinos = in.nextInt();
        if (molinos == 0) {
            return false;
        }
        int[] energiasAcumuladas = new int[molinos + 1];
        int suma = 0;
        for (int i = 1; i <= molinos; i++) {
            suma += in.nextInt();
            energiasAcumuladas[i] = suma;
        }
        int consultas = in.nextInt();
        for (int i = 0; i < consultas; i++) {
            int inicio = in.nextInt();
            int fin = in.nextInt();
            System.out.println(energiasAcumuladas[fin] - energiasAcumuladas[inicio - 1]);
        }
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER179().run();
    }
    
}
