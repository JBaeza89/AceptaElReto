/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer104;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER104 {

    Scanner in;

    public int submovil() {
        int[] movil = new int[4];
        boolean balanceado = true;
        for (int i = 0; i < 4; i++) {
            movil[i] = in.nextInt();
        }
        if (movil[0] == 0) {
            movil[0] = submovil();
            if (movil[0] == -1) {
                balanceado = false;
            }
        }
        if (movil[2] == 0) {
            movil[2] = submovil();
            if (movil[2] == -1) {
                balanceado = false;
            }
        }
        if (balanceado) {
            balanceado = movil[0] * movil[1] == movil[2] * movil[3];
        }
        return balanceado ? movil[0] + movil[2] : -1;
    }

    public boolean caso() {
        int[] movil = new int[4];
        for (int i = 0; i < 4; i++) {
            movil[i] = in.nextInt();
        }
        if (movil[0] + movil[1] + movil[2] + movil[3] == 0) {
            return false;
        }
        boolean balanceado = true;

        if (movil[0] == 0) {
            movil[0] = submovil();
            if (movil[0] == -1) {
                balanceado = false;
            }
        }
        if (movil[2] == 0) {
            movil[2] = submovil();
            if (movil[2] == -1) {
                balanceado = false;
            }
        }
        if (balanceado) {
            balanceado = movil[0] * movil[1] == movil[2] * movil[3];
        }
        System.out.println(balanceado ? "SI" : "NO");
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER104().run();
    }

}
