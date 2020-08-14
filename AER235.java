/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer235;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER235 {

    Scanner in;

    class Cubo {

        char[] f1;
        char[] f2;
        char[] f3;

        public Cubo() {
            f1 = new char[3];
            f2 = new char[3];
            f3 = new char[3];
        }

        public Cubo(String x, String y, String z) {
            f1 = x.toCharArray();
            f2 = y.toCharArray();
            f3 = z.toCharArray();
        }

        public void setF1(char x, char y, char z) {
            f1[0] = x;
            f1[1] = y;
            f1[2] = z;
        }

        public void setF2(char x, char y, char z) {
            f2[0] = x;
            f2[1] = y;
            f2[2] = z;
        }

        public void setF3(char x, char y, char z) {
            f3[0] = x;
            f3[1] = y;
            f3[2] = z;
        }
        
        public boolean equals(Cubo c) {
            for (int i = 0; i < 3; i++) {
                if (this.f1[i] != c.f1[i]) {
                    return false;
                }
                if (this.f2[i] != c.f2[i]) {
                    return false;
                }
                if (this.f3[i] != c.f3[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean caso() {
        int filas = in.nextInt();
        int columnas = in.nextInt();
        if (filas == 0 && columnas == 0) {
            return false;
        }
        Cubo[][] imagen = new Cubo[filas][columnas];
        for (int i = 0; i < filas; i++) {
            char[] x = in.next().toCharArray();
            char[] y = in.next().toCharArray();
            char[] z = in.next().toCharArray();

            for (int j = 0; j < columnas; j++) {
                imagen[i][j] = new Cubo();
                imagen[i][j].setF1(x[j * 3], x[j * 3 + 1], x[j * 3 + 2]);
                imagen[i][j].setF2(y[j * 3], y[j * 3 + 1], y[j * 3 + 2]);
                imagen[i][j].setF3(z[j * 3], z[j * 3 + 1], z[j * 3 + 2]);
            }
        }

        int cubos = in.nextInt();
        for (int i = 0; i < cubos; i++) {
            Cubo cubo = new Cubo(in.next(), in.next(), in.next());
            boolean encontrado = false;
            for (int j = 0; j < filas; j++) {
                for (int k = 0; k < columnas; k++) {
                    if (imagen[j][k].equals(cubo)) {
                        System.out.println((j + 1) + " " + (k + 1));
                        encontrado = true;
                        break;
                    }

                }
                if (encontrado) {
                    break;
                }

            }
            if (!encontrado) {
                System.out.println("NO SE USA");
            }
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER235().run();
    }

}
