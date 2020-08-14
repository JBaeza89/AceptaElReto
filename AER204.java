/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer204;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER204 {
    
    Scanner in;
    int indice;
    String arbol;
    boolean ok;
    
    class Arbol {
        char rama;
        int valor;
        int contadorI;
        int contadorD;
        Arbol nodoI;
        Arbol nodoD;
        
        public Arbol() {
            rama = arbol.charAt(indice);
            indice++;
            if (rama == 'Y') {
                nodoI = new Arbol();
                nodoD = new Arbol();
                contadorI = nodoI.valor;
                contadorD = nodoD.valor;
                valor = contadorI + contadorD;
                if (Math.abs(contadorI - contadorD) > 1) {
                    ok = false;
                }
            } else {
                valor = rama == '*'? 1 : 0;
            }
        }    
        
    }
    
    public void caso() {
        indice = 0;
        arbol = in.next();
        ok = true;
        new Arbol();
        System.out.println(ok? "OK" : "KO");
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER204().run();
    }
    
}
