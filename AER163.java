/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer163;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER163 {

    Scanner in;
    
    public boolean caso() {
        String numeroHexadecimal = in.next();
        if (numeroHexadecimal.equals("FIN")) {
            return false;
        }
        
        String digitosHexadecimales = "0123456789ABCDEF";
        String numeroAumentado = "";
        int indice = numeroHexadecimal.length() - 1;
        while (indice >= 0) {
            if (numeroHexadecimal.charAt(indice) != 'F') {
                char x = digitosHexadecimales.charAt(digitosHexadecimales.
                        indexOf(numeroHexadecimal.substring(indice, indice + 1))+ 1);
                
                numeroAumentado += numeroHexadecimal.substring(0, indice) + x;
                
                for (int i = indice; i < numeroHexadecimal.length() - 1; i++) {
                    numeroAumentado += "0";
                }
                break;
            }
            indice--;
        }
        if (indice < 0) {
            numeroAumentado = "1";
            for (int i = 0; i < numeroHexadecimal.length(); i++) {
                numeroAumentado += "0";
            }
        }
        System.out.println(numeroAumentado);
        return true;    
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER163().run();
    }
    
}
