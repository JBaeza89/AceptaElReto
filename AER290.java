/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer290;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER290 {

    Scanner in;
    int alturaMaxima;
    int indice;
    
    public void recorrerArbol(String arbol, int altura) {
        if (arbol.charAt(indice) == '.') {
            return;
        }
        altura++;
        indice++;
        alturaMaxima = Math.max(altura, alturaMaxima);
        recorrerArbol(arbol, altura);
        indice++;
        recorrerArbol(arbol, altura);
    }
    
    public void caso() {
        alturaMaxima = 0;
        indice = 0;
        String arbol = in.next();        
        recorrerArbol(arbol, 0);
        System.out.println(alturaMaxima);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER290().run();
    }
    
}
