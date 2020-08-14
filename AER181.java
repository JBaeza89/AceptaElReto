/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer181;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER181 {

    Scanner in;

    public boolean caso() {
        int dimension = in.nextInt();
        if (dimension == 0) {
            return false;
        }
        char[][] tablero = new char[dimension][];
        for (int i = 0; i < dimension; i++) {
            tablero[i] = in.next().toCharArray();
        }

        int[][] solucion = new int[dimension][dimension];
        for (int i = dimension - 1; i >= 0; i--) {
            for (int j = 0; j < dimension; j++) {
                if (tablero[i][j] != '.') {
                    solucion[i][j] = 0;
                } else if (i < dimension - 1 && j > 0) {
                    solucion[i][j] = solucion[i + 1][j] + solucion[i][j - 1];
                } else if (i < dimension - 1) {
                    solucion[i][j] = solucion[i + 1][j];
                } else if (j > 0) {
                    solucion[i][j] = solucion[i][j - 1];
                } else {
                    solucion[i][j] = 1;
                }

            }
        }
        System.out.println(solucion[0][dimension - 1]);

        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER181().run();
    }

}
