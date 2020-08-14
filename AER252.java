/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer252;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER252 {

    Scanner in;
    
    public boolean caso() {
        String entrada = in.nextLine();
        if (entrada.equals("XXX")) {
            return false;
        }
        char[] caracteres = entrada.replaceAll(" ", "").toLowerCase().toCharArray();
        boolean palindromo = true;
        for (int i = 0; i < caracteres.length / 2; i++) {
            if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }
        System.out.println(palindromo? "SI" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER252().run();
    }
    
}
