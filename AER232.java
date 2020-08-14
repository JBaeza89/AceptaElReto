/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer232;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER232 {

    Scanner in;

    public int calcularMeses(int mes) {
        int suma = 0;
        for (int i = 1; i < mes; i++) {
            switch (i) {
                case 1:
                    suma += 31;
                    break;
                case 2:
                    suma += 28;
                    break;
                case 3:
                    suma += 31;
                    break;
                case 4:
                    suma += 30;
                    break;
                case 5:
                    suma += 31;
                    break;
                case 6:
                    suma += 30;
                    break;
                case 7:
                    suma += 31;
                    break;    
                case 8:
                    suma += 31;
                    break;
                case 9:
                    suma += 30;
                    break;
                case 10:
                    suma += 31;
                    break;
                default:
                    suma += 30;
                    break;
            }
        }
        return suma;
    }

    public boolean caso() {
        int[][] fechas = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                fechas[i][j] = in.nextInt();
            }
        }
        if (fechas[0][0] == 0) {
            return false;
        }
        if (fechas[0][0] == fechas[1][0] && fechas[0][1] == fechas[1][1]) {
            System.out.println(0);
        } else {
            int diasNacimiento = fechas[0][0] + calcularMeses(fechas[0][1]) + fechas[0][2] * 365;
            int diasFechaActual = fechas[1][0] + calcularMeses(fechas[1][1]) + fechas[1][2] * 365;
            int noCumpleannos = diasFechaActual - diasNacimiento - (fechas[1][2] - fechas[0][2] - 1);
            if (fechas[1][1] > fechas[0][1] || 
                    (fechas[1][1] == fechas[0][1] && fechas[1][0] > fechas[0][0])) {
                noCumpleannos--;
            }
            System.out.println(noCumpleannos);
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER232().run();
    }

}
