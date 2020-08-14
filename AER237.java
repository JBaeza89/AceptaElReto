/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer237;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER237 {

    Scanner in;
    
    public void caso() {
        String numeroInicial = in.next();
        int longitudInicial = numeroInicial.length();
        boolean polidivisible = true;
        for (int i = 0; i < longitudInicial; i++) {
            String numero = numeroInicial.substring(0, numeroInicial.length() - i);
            long valor = Long.parseLong(numero);
            if (valor % numero.length() != 0) {
                polidivisible = false;
                break;
            }
        }
        System.out.println(polidivisible? "POLIDIVISIBLE" : "NO POLIDIVISIBLE");
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(in.hasNext()) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER237().run();
    }
    
}
