/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer203;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER203 {

    Scanner in;

    class Arbol {

        private int valor;
        private Arbol nodoIzquierdo;
        private Arbol nodoDerecho;

        public Arbol(int valor) {
            this.valor = valor;

            if (valor != -1) {
                setIzquierdo(new Arbol(in.nextInt()));
                setDerecho(new Arbol(in.nextInt()));
            }
        }

        public Arbol(Arbol a, Arbol b) {
            if (a.getValor() != -1 && b.getValor() != -1) {
                this.valor = a.getValor() + b.getValor();
                setIzquierdo(new Arbol(a.getNodoIzquierdo(), b.getNodoIzquierdo()));
                setDerecho(new Arbol(a.getNodoDerecho(), b.getNodoDerecho()));
            } else if (a.getValor() == -1) {
                this.valor = b.getValor();
                setIzquierdo(b.getNodoIzquierdo());
                setDerecho(b.getNodoDerecho());
            } else if (b.getValor() == -1) {
                this.valor = a.getValor();
                setIzquierdo(a.getNodoIzquierdo());
                setDerecho(a.getNodoDerecho());
            } else {
                this.valor = -1;
            }
        }

        public void setIzquierdo(Arbol izquierdo) {
            this.nodoIzquierdo = izquierdo;
        }

        public void setDerecho(Arbol derecho) {
            this.nodoDerecho = derecho;
        }

        public Arbol getNodoIzquierdo() {
            return nodoIzquierdo;
        }

        public void setNodoIzquierdo(Arbol nodoIzquierdo) {
            this.nodoIzquierdo = nodoIzquierdo;
        }

        public Arbol getNodoDerecho() {
            return nodoDerecho;
        }

        public void setNodoDerecho(Arbol nodoDerecho) {
            this.nodoDerecho = nodoDerecho;
        }

        public int getValor() {
            return valor;
        }

    }

    public void imprimirNodo(Arbol a) {
        System.out.print(" " + a.getValor());
        if (a.getValor() != -1) {
            imprimirNodo(a.getNodoIzquierdo());
            imprimirNodo(a.getNodoDerecho());
        }
    }

    public void imprimirArbol(Arbol a) {
        System.out.print(a.getValor());
        if (a.getValor() != -1) {
            imprimirNodo(a.getNodoIzquierdo());
            imprimirNodo(a.getNodoDerecho());
        }
    }

    public boolean caso() {
        Arbol arbolA = new Arbol(in.nextInt());
        Arbol arbolB = new Arbol(in.nextInt());
        if (arbolA.getValor() == -1 && arbolB.getValor() == -1) {
            return false;
        }
        Arbol arbolSuma = new Arbol(arbolA, arbolB);
        
        imprimirArbol(arbolSuma);
        
        System.out.println();

        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER203().run();
    }

}
