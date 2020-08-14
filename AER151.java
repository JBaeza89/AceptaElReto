/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer151;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER151 {

    Scanner in;

    public boolean caso() {
        int filas = Integer.parseInt(in.nextLine());
        if (filas == 0) {
            return false;
        }

        String[] fila = in.nextLine().split(" ");
        int longitudFila = fila.length;
        boolean identidad = fila[0].equals("1");
        for (int i = 1; i < longitudFila; i++) {
            if (!fila[i].equals("0")) {
                identidad = false;
                break;
            }
        }
        for (int i = 1; i < filas; i++) {
            fila = in.nextLine().split(" ");
            if (longitudFila != fila.length) {
                identidad = false;
            }
            if (identidad) {
                longitudFila = fila.length;
                for (int j = 0; j < longitudFila; j++) {
                    if (j == i) {
                        if (!fila[j].equals("1")) {
                            identidad = false;
                            break;
                        }
                    } else {
                        if (!fila[j].equals("0")) {
                            identidad = false;
                            break;
                        }
                    }
                }
            }
            
        }
        System.out.println(identidad ? "SI" : "NO");
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER151().run();
    }

}
