/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer124;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER124 {

    Scanner in;

    public boolean caso() {
        String n1 = in.next();
        String n2 = in.next();
        if (n1.equals("0") && n2.equals("0")) {
            return false;
        }
        char[] numeroA;
        char[] numeroB;
        if (n1.length() >= n2.length()) {
            numeroA = n1.toCharArray();
            numeroB = n2.toCharArray();
        } else {
            numeroA = n2.toCharArray();
            numeroB = n1.toCharArray();
        }
        int contador = 0;
        boolean acarrea = false;
        int a = numeroA.length - 1;
        int b = numeroB.length - 1;
        for (int i = 0; i <= b; i++) {
            if (acarrea) {
                acarrea = numeroA[a - i] - '0' + numeroB[b - i] - '0' + 1 > 9;
            } else {
                acarrea = numeroA[a - i] - '0' + numeroB[b - i] - '0'> 9;
            }
            if (acarrea) {
                contador++;
            }
        }
        
        if (a > b && acarrea) {
            int i = numeroB.length;
            while( a - i >= 0 && numeroA[a - i] == '9') {
                contador++;
                i++;
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
        new AER124().run();
    }

}
