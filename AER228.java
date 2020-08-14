/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer228;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER228 {

    Scanner in;
    String entrada;
    int indice;
    
    class NodoArbol {
        char caracter;
        NodoArbol NodoDerecho;
        NodoArbol NodoIzquierdo;
        
        public NodoArbol() {
            caracter = entrada.charAt(indice);
            indice++;
            if (caracter != ' ') {
                NodoDerecho = new NodoArbol();
                NodoIzquierdo = new NodoArbol();
            }
        }
    }
    
    
    
     public void imprimirArbol(NodoArbol a) {        
        if (a.caracter != ' ') {
            System.out.print(a.caracter);
            imprimirArbol(a.NodoIzquierdo);
            imprimirArbol(a.NodoDerecho);
        }
        
    }
    
    public void caso() {
        entrada = in.nextLine();
        indice = 0;
        NodoArbol arbol = new NodoArbol();
        imprimirArbol(arbol);
        System.out.println();
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (in.hasNextLine()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER228().run();
    }
    
}
