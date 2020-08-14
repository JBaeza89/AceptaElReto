/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer192;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER192 {

    Scanner in;
    
    public boolean caso() {
        int numero = in.nextInt();
        if (numero == 0) {
            return false;
        }
        boolean esPosible = true;
        while (numero > 1) {
            if (numero % 5 == 1) {
                break;
            }
            if (numero % 3 == 0) {
                numero /= 3;
            } else {
                numero -= 5;
            }
            if (numero < 1) {
                esPosible = false;
            }
        }
        System.out.println(esPosible? "SI" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER192().run();
    }
    
}
