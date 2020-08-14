/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer147;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER147 {
    
    Scanner in;
    
    public void caso() {
        int cerillas = in.nextInt();
        int retiradaMaxima = in.nextInt();
        int modulo = cerillas % (retiradaMaxima + 1);
        if (modulo == 1) {
            System.out.println("PIERDO");
        } else {
            System.out.println(modulo == 0? retiradaMaxima : modulo - 1);
        }
    }

    public void run () {
        in = new Scanner(System.in);
        while(in.hasNext()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER147().run();
    }
    
}
