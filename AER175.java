/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer175;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER175 {

    Scanner in;

    public void caso() {
        int numeroSemanas = in.nextInt();
        int[] pastillas = new int[7];
        for (int i = 0; i < numeroSemanas; i++) {
            String semana = in.next();
            for (int j = 0; j < semana.length(); j++) {
                if (semana.charAt(j) == '*') {
                    pastillas[j]++;
                }
            }
        }
        int menor = pastillas[0];
        int numeroDia = 0;
        for (int i = 1; i < pastillas.length; i++) {
            if (pastillas[i] < menor) {
                menor = pastillas[i];
                numeroDia = i;
            }
        }
        String dia;
        switch (numeroDia) {
            case 1:
                dia = "M";
                break;
            case 2:
                dia = "X";
                break;
            case 3:
                dia = "J";
                break;
            case 4:
                dia = "V";
                break;
            case 5:
                dia = "S";
                break;
            case 6:
                dia = "D";
                break;
            default:
                dia = "L";
                break;
        }
        System.out.println(dia + " " + (menor + 1));
    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER175().run();
    }

}
