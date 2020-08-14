/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer193;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER193 {

    Scanner in;
    
    public boolean caso() {
        StringBuilder numero = new StringBuilder(in.next());
        if (numero.toString().equals("0")) {
            return false;
        }
        boolean reversible = numero.charAt(numero.length() - 1) != '0';
        if (reversible) {
            int numeroOriginal = Integer.parseInt(numero.toString());
            int numeroInvertido = Integer.parseInt(numero.reverse().toString());
            int suma = numeroInvertido + numeroOriginal;
            while (suma > 0) {
                if (suma % 2 == 0) {
                    reversible = false;
                    break;
                }
                suma /= 10;
            }
        }
        System.out.println(reversible? "SI" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER193().run();
    }
    
}
