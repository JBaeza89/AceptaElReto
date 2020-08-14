/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer197;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER197 {

    Scanner in;
    
    public String volteo(String s) {
        String retorno = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            retorno += s.charAt(i);
        }
        return retorno;
    }
    
    public String desprimar(String linea) {
        String retorno = "";
        int indice = 0;
        String vocales = "AEIOUaeiou";
        for (int i = 0; i < linea.length(); i++) {
            String x = "" + linea.charAt(i);
            if (vocales.contains(x)) {
                retorno += volteo(linea.substring(indice, i)) + x;
                indice = i + 1;
            }
        }
        if (indice < linea.length()) {
            retorno += volteo(linea.substring(indice));
        }
        return retorno;
    }
    
    public String desencundar(String linea) {
        char[] retorno = new char[linea.length()];
        int indice = 0;
        for (int i = 0; i < retorno.length; i++) {
            char x = linea.charAt(i);
            if (i == 0 || i % 2 == 0) {
                retorno[indice] = x;
            } else {
                retorno[retorno.length - 1 - indice] = x;
                indice++;
            }
        }
        return new String(retorno);
    }

    public void caso() {
        String linea = in.nextLine();
        String salida = desencundar(linea);
        salida = desprimar(salida);
        System.out.format("%s => %s%n", linea, salida);
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER197().run();
    }
    
}
