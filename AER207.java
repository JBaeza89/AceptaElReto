/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer207;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER207 {

    Scanner in;
    int contador;

    public void rellenarSombras(int f, int c, char[][] camping) {
        for (int i = f - 1; i <= f + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                try {
                    if (camping[i][j] == 0) {
                        camping[i][j] = 's';
                        contador++;
                    }
                } catch (Exception ex) {}
            }
        }
    }

    public boolean caso() {
        int columna = in.nextInt();
        int fila = in.nextInt();
        int arboles = in.nextInt();
        if (columna == 0 && fila == 0 && arboles == 0) {
            return false;
        }
        char[][] camping = new char[fila][columna];
        contador = 0;
        for (int i = 0; i < arboles; i++) {
            int c = in.nextInt() - 1;
            int f = in.nextInt() - 1;
            if (camping[f][c] == 's') {
                contador--;
            }
            camping[f][c] = 'a';
            rellenarSombras(f, c, camping);
        }
        System.out.println(contador);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER207().run();
    }

}
