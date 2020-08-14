/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer140;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER140 {

    Scanner in;
    
    public boolean caso() {
        String numero = in.next();
        if (numero.charAt(0) == '-') {
            return false;
        }
        int suma = numero.charAt(0) - '0';
        System.out.print(numero.charAt(0));
        for (int i = 1; i < numero.length(); i++) {            
            int digito = numero.charAt(i) - '0';
            suma += digito;
            System.out.print(" + " + digito);
        }
        System.out.println(" = " + suma);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER140().run();
    }
    
}
