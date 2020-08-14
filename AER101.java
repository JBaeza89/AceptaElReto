/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer101;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER101 {

    Scanner in;

    public boolean caso() {
        int n = in.nextInt();
        if (n == 0) {
            return false;
        }
        int[][] matriz = new int[n][n];
        boolean diabolico = true;
        boolean esoterico = true;
        int diagonales = 0;
        int cm = 0;
        int filas[] = new int[n];
        int columnas[] = new int[n];
        boolean cifras[] = new boolean[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int numero = in.nextInt();
                try {
                    if (!cifras[numero - 1]) {
                        cifras[numero - 1] = true;
                    } else {
                        esoterico = false;
                    }

                } catch (Exception ex) {
                    esoterico = false;
                }
                matriz[i][j] = numero;
                filas[i] += matriz[i][j];
                columnas[j] += matriz[i][j];
                if (i == j) {
                    cm += matriz[i][j];
                    diagonales += matriz[i][j];
                }
                if (i + j == n - 1) {
                    diagonales -= matriz[i][j];
                }
            }
        }
        if (diagonales != 0) {
            diabolico = false;
        } else {
            for (int i = 0; i < n; i++) {
                if (cm != filas[i] || cm != columnas[i]) {
                    diabolico = false;
                }
            }
        }
        if (diabolico && esoterico) {
            int cm2 = 4 * cm / n;
            int esquinas;
            int centro;
            int centroLados;
            if (n % 2 == 0) {
                esquinas = matriz[0][0] + matriz[0][n - 1]
                        + matriz[n - 1][0] + matriz[n - 1][n - 1];
                centro = matriz[n / 2 - 1][n / 2 - 1] + matriz[n / 2 - 1][n / 2]
                        + matriz[n / 2][n / 2 - 1] + matriz[n / 2][n / 2];
                centroLados = (matriz[0][n / 2 - 1] + matriz[0][n / 2] + matriz[n / 2 - 1][0]
                        + matriz[n / 2][0] + matriz[n - 1][n / 2 - 1] + matriz[n - 1][n / 2]
                        + matriz[n / 2 - 1][n - 1] + matriz[n / 2][n - 1]) / 2;

            } else {
                esquinas = matriz[0][0] + matriz[0][n - 1]
                        + matriz[n - 1][0] + matriz[n - 1][n - 1];
                centro = 4 * matriz[n / 2][n / 2];
                centroLados = matriz[0][n / 2] + matriz[n / 2][0]
                        + matriz[n - 1][n / 2] + matriz[n / 2][n - 1];

            }
            if (cm2 != esquinas || cm2 != centro || cm2 != centroLados) {
                esoterico = false;
            }
        }
        if (!diabolico) {
            System.out.println("NO");
        } else {
            System.out.println(esoterico ? "ESOTERICO" : "DIABOLICO");
        }

        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER101().run();
    }

}
