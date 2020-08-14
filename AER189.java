/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer189;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER189 {

    Scanner in;
    
    public int embarcar(int[] pasajeros, int numero, int numeroPasajeros) {
        int indice = 0;
        for (int i = 0; i < numeroPasajeros; i++) {
            if (pasajeros[i] != numero) {
                pasajeros[indice] = pasajeros[i];
                indice++;
            }
        }
        return indice;
    }
    
    public boolean caso() {
        int numeroPasajeros = in.nextInt();
        if (numeroPasajeros == 0) {
            return false;
        }
        int[] pasajeros = new int[numeroPasajeros];
        for (int i = 0; i < numeroPasajeros; i++) {
            pasajeros[i] = in.nextInt();
        }
        int numeroAcciones = in.nextInt();
        for (int i = 0; i < numeroAcciones; i++) {
            String accion = in.next();
            int numero = in.nextInt();
            if (accion.equals("EMBARQUE")) {
                numeroPasajeros = embarcar(pasajeros, numero, numeroPasajeros);
                System.out.println(numeroPasajeros);
            } else {
                
                System.out.println(pasajeros[numero - 1]);
            }
        }
        System.out.println("*");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER189().run();
    }
    
}
