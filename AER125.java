/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer125;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class AER125 {

    Scanner in;
    
    public boolean esVampiro(int colmillo, int numero, StringBuilder cadenaDigitos) {
        int colmillo2 = numero / colmillo;
        String c1 = Integer.toString(colmillo);
        String c2 = Integer.toString(colmillo2);
        if (c1.length() > cadenaDigitos.length() / 2 || c2.length() > cadenaDigitos.length() / 2 ) {
            return false;
        }
        if (colmillo % 10 == 0 && colmillo2 % 10 == 0) {
            return false;
        }
        String colmillos = c1 + c2;
        for (int i = colmillos.length(); i < cadenaDigitos.length(); i++) {
            colmillos += "0";
        }
        for (int i = 0; i < colmillos.length(); i++) {
            try {
                cadenaDigitos.deleteCharAt(cadenaDigitos.indexOf(colmillos.substring(i, i + 1)));
            } catch (Exception ex) {
                return false;
            }
        }
        return true;
    }
    
    public void caso() {
        String cadenaDigitos = in.next();
        boolean vampiro = false;
        if (cadenaDigitos.length() % 2 == 0) {
           int numero = Integer.parseInt(cadenaDigitos);
           Set<Integer> divisores = new HashSet<>();
           for (int i = 2; i < Math.pow(10, cadenaDigitos.length() / 2); i++) {
               if (numero % i == 0) {
                   int divisor = numero / i;
                   if (divisores.contains(divisor)) {
                       break;
                   }                   
                   divisores.add(i);
               }
           }
           for (Integer d : divisores) {
               vampiro = esVampiro(d, numero, new StringBuilder(cadenaDigitos));
               if (vampiro) {
                   break;
               }
           }
        }
        System.out.println(vampiro? "SI" : "NO");
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER125().run();
    }
    
}
