/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer195;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER195 {

    Scanner in;
    
     public void caso() {
        double[] puntuaciones = new double[7];        
        for(int i = 0; i < 7; i++) {
            puntuaciones[i]= in.nextDouble();
        }
        Arrays.sort(puntuaciones);
        
        double resultado = 0;
        for (int i = 2; i <= 4; i++) {
            resultado += puntuaciones[i];
        }
        resultado *= 2;
        System.out.println((int)resultado);
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER195().run();
    }
    
}
