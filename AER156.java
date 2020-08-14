/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer156;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER156 {

    Scanner in;
    
    public boolean caso() {
        int pisoSalida = in.nextInt();
        if (pisoSalida < 0) {
            return false;
        }
        int longitudRecorrido = 0;
        do {
            int pisoLlegada = in.nextInt();
            if (pisoLlegada != -1) {
                longitudRecorrido += Math.abs(pisoLlegada - pisoSalida);                
            }
            pisoSalida = pisoLlegada;
        } while (pisoSalida != -1);
        System.out.println(longitudRecorrido);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER156().run();
    }
    
}
