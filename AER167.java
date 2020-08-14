/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer167;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER167 {

    Scanner in;
    
    public void caso() {
        int lado = in.nextInt();
        int tinta = lado * 4;
        int contador = 1;
        while (lado > 1) {
            lado /= 2;
            contador++;
            tinta += lado * Math.pow(4, contador);
        }
        System.out.println(tinta);
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER167().run();
    }
    
}
