/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer530;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER530 {

    Scanner in;
    int inicioY;
    int inicioX;
    char[][] dibujo;

    public boolean tieneX() {
        boolean tieneX;
        for (int i = 0; i < dibujo.length; i++) {
            for (int j = 0; j < dibujo[0].length; j++) {
                tieneX = dibujo[i][j] == 'X';
                if (tieneX) {
                    inicioY = i;
                    inicioX = j;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean cortaDesdeBorde(int y, int x) {
        for (int i = 0; i < x; i++) {
            if (dibujo[0][i] == '.') {
                cortes(0, i);
            }
            if (dibujo[y - 1][i] == '.') {
                cortes(y - 1, i);
            }
        }
        for (int i = 0; i < y; i++) {
            if (dibujo[i][0] == '.') {
                cortes(i, 0);
            }
            if (dibujo[i][x - 1] == '.') {
                cortes(i, x - 1);
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (dibujo[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void cortes(int y, int x) {
        dibujo[y][x] = ' ';
        if (y - 1 >= 0 && dibujo[y - 1][x] == '.') {
            cortes(y - 1, x);
        }
        if (y + 1 < dibujo.length && dibujo[y + 1][x] == '.') {
            cortes(y + 1, x);
        }
        if (x - 1 >= 0 && dibujo[y][x - 1] == '.') {
            cortes(y, x - 1);
        }
        if (x + 1 < dibujo[0].length && dibujo[y][x + 1] == '.') {
            cortes(y, x + 1);
        }
    }

    public void pintarX(int y, int x) {

        dibujo[y][x] = '0';

        if (y - 1 >= 0 && dibujo[y - 1][x] == 'X') {
            pintarX(y - 1, x);
        }
        if (y + 1 < dibujo.length && dibujo[y + 1][x] == 'X') {
            pintarX(y + 1, x);
        }
        if (x - 1 >= 0 && dibujo[y][x - 1] == 'X') {
            pintarX(y, x - 1);
        }
        if (x + 1 < dibujo[0].length && dibujo[y][x + 1] == 'X') {
            pintarX(y, x + 1);
        }

    }
    public boolean esSimetrico() {
        for (int i = 0; i < dibujo.length; i++) {
            for (int j = 0; j < dibujo[0].length; j++) {
                if (dibujo[i][j] != dibujo[dibujo.length - 1 - i][dibujo[0].length - 1 - j]) {
                    return false;
                }
                    
            }
        }
        return true;
    }

    public void caso() {
        int x = in.nextInt();
        int y = in.nextInt();
        dibujo = new char[y][x];
        for (int i = 0; i < y; i++) {
            String linea = in.next();
            for (int j = 0; j < x; j++) {
                dibujo[i][j] = linea.charAt(j);
            }
        }
        if (!tieneX()) {
            System.out.println("TRAMPOSO");
        } else {
            pintarX(inicioY, inicioX);
            if (tieneX() || !esSimetrico() || 
                    !cortaDesdeBorde((int)Math.ceil(y / 2.0), (int)Math.ceil(x / 2.0))) {
                System.out.println("TRAMPOSO");
            } else {

                System.out.println("CORRECTO");
            }
        }
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER530().run();
    }

}
