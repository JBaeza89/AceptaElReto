/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer199;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER199 {

    Scanner in;
    
    public boolean caso() {
        int numeroDigitos = in.nextInt();
        if (numeroDigitos == 0) {
            return false;
        }
        long posiblesNumeros;
        if (numeroDigitos % 4 == 1) {
            posiblesNumeros = 0;
        }else if (numeroDigitos % 2 == 1) {
            posiblesNumeros = 20 * 5;
            int parejasInteriores = (numeroDigitos - 3) / 2;
            for (int i = 0; i < parejasInteriores; i++){
                posiblesNumeros *= (i%2 == 0? 25 : 20);
            }            
        } else {
            int parejasInteriores = (numeroDigitos - 2) / 2;
            posiblesNumeros = 20;
            for (int i = 0; i < parejasInteriores; i++) {
                posiblesNumeros *= 30;
            }
        }
        System.out.println(posiblesNumeros);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER199().run();
    }
    
}
