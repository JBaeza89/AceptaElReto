/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer229;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER229 {

    Scanner in;
    
    public boolean caso() {
        int numeroEntradas = in.nextInt();
        if (numeroEntradas == 0) {
            return false;
        }
        int[] saldos = new int[numeroEntradas + 1];
        int suma = 0;
        for (int i = 1; i <= numeroEntradas; i++) {
            suma += in.nextInt();
            saldos[i] = suma;
        }
        int contador = 0;
        for (int i = 0; i < saldos.length; i++) {
            if (saldos[i] == saldos[numeroEntradas] - saldos[i]) {
                contador++;
            }
        }
        System.out.println(contador);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER229().run();
    }
    
}
