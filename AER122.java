/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer122;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER122 {

    Scanner in;

    public boolean caso() {
        int altura = in.nextInt();
        if (altura == -1) {
            return false;
        }
        int tramo = 0;
        int contadorKmLlanos = 0;
        int comienzoComida = 0;
        int mayorKm = 0;

        while (true) {
            int apoyo = in.nextInt();            
            if (apoyo == altura) {
                contadorKmLlanos++;
            } else {
                if (contadorKmLlanos > mayorKm) {
                    mayorKm = contadorKmLlanos;
                    comienzoComida = tramo - mayorKm;
                }
                contadorKmLlanos = 0;
            }
            if (apoyo == -1) {                
                break;
            }
            altura = apoyo;
            tramo++;
        }
        if (mayorKm > 0) {
            System.out.format("%d %d%n", comienzoComida, mayorKm);
        } else {
            System.out.println("HOY NO COMEN");
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER122().run();
    }

}
