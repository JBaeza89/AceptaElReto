/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer176;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER176 {

    Scanner in;
    
    public boolean comprobarMinas(char[][] tablero, int fila, int columna) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (tablero[i][j] == '-') {
                    contador++;
                }
                if (contador > 3) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean caso() {
        int ancho = in.nextInt();
        int alto = in.nextInt();
        if (ancho == 0 || alto == 0) {
            return false;
        }
        char[][] tablero = new char[alto][ancho];
        for (int i = 0; i < alto; i++) {
            String linea = in.next();
            for (int j = 0; j < ancho; j++) {
                tablero[i][j] = linea.charAt(j);
            }
        }
        int contador = 0;
        for (int i = 1; i < alto - 1; i++) {
            for (int j = 1; j < ancho - 1; j++) {
                if (tablero[i][j] == '-' && comprobarMinas(tablero, i, j)) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER176().run();
    }
    
}
