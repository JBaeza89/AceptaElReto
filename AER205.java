/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer205;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER205 {

    Scanner in;
    
    public String invertirNumero(String s) {
        char[] inverso = new char[s.length()];
        for (int i = 0; i < inverso.length; i++) {
            inverso[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(inverso);
    }
    
    public boolean esCapicua(String s) {
        int cifras = s.length() - 1;
        for (int i = 0; i <= cifras; i++) {
            if (s.charAt(i) != s.charAt(cifras - i)) {
                return false;
            }
        }
        return true;
    }
    
    public void caso() {
        String numero = in.next();
        String numeroInvertido = invertirNumero(numero);
        int suma = 0;
        boolean lychrel = false;
        int contador = 0;
        while (!lychrel && suma <= 1000000000) {
            suma = Integer.parseInt(numero) + Integer.parseInt(numeroInvertido);
            numero = Integer.toString(suma);
            lychrel = esCapicua(numero);
            numeroInvertido = invertirNumero(numero);
            contador++;
        }
        if (lychrel) {
            System.out.println(contador + " " + numero);
        } else {
            System.out.println("Lychrel?");
        }
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER205().run();
    }
    
}
