/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer120;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER120 {

    Scanner in;

    public boolean caso() {
        int lado = in.nextInt();
        int comienzo = in.nextInt();
        if (lado == 0) {
            return false;
        }
        int valor = comienzo;
        int[][] matriz = new int[lado][lado];
        int fila = 0;
        int columna = lado / 2;
        while (valor < lado * lado + comienzo) {
            matriz[fila][columna] = valor;
            fila = ((fila - 1) + lado) % lado;
            columna = (columna + 1) % lado;
            if (matriz[fila][columna] != 0 || (fila == 0 && columna == lado / 2)) {
                fila = (fila + 2) % lado;
                columna = ((columna - 1) + lado) % lado;
            } 
            valor++;
        }
        int constante = 0;
        for (int i = 0; i < lado; i++) {
            constante += matriz[i][0];
        }
        System.out.println(constante);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER120().run();
    }

}
