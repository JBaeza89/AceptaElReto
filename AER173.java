/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer173;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER173 {

    Scanner in;
    
    public int procesarSet(int indice, boolean[] saque, String tantos) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < tantos.length(); i++) {
            if (tantos.charAt(i) == 'F') {
                indice += i;
                break;
            }
            if (saque[0]) {
                if (tantos.charAt(i) == 'A') {
                    a++;
                } else {
                    saque[0] = !saque[0];
                }
            } else {
                if (tantos.charAt(i) == 'B') {
                    b++;
                } else {
                    saque[0] = !saque[0];
                }
            }
            if ((a >= 9 && a - b > 1) || (b >= 9 && b - a > 1)) {
                indice +=  i + 1;
                break;
            }
        }
        System.out.print(a + "-" + b);
        return indice;
    }
    
    public boolean caso() {
        String tantos = in.next();
        if (tantos.charAt(0) == 'F') {
            return false;
        }
        boolean[] saque = new boolean[] {true};
        int indice = 0;
        while (true) {
            indice = procesarSet(indice, saque, tantos.substring(indice));
            if (tantos.charAt(indice) == 'F') {
                break;
            }
            System.out.print(" ");
        }
        System.out.println();
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER173().run();
    }
    
}
