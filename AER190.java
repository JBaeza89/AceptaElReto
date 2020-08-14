/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer190;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER190 {

    Scanner in;
    
    public boolean caso() {
        long numerador = in.nextLong();
        long denominador = in.nextLong();
        if (denominador > numerador) {
            return false;
        }
        long total = 1;

        while (numerador > denominador) {

            total *= numerador;
            numerador--;
        }

        System.out.println(total);

        return true;

    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER190().run();
    }
    
}
