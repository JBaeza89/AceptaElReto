/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer128;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER128 {

    Scanner in;

    public boolean caso() {
        int varillasLargas = in.nextInt();
        if (varillasLargas == -1) {
            return false;
        }
        int retales = 0;
        int contadorVarillas = 0;
        int sobrante = 0;
        boolean posible = true;

        while (true) {
            int nervios = in.nextInt();
            if (nervios == -1) {
                retales += sobrante;
                break;
            }
            int numeroSegmentos = nervios * in.nextInt();
            int longitudSegmento = in.nextInt();

            if (!posible) {
                continue;
            }

            posible = longitudSegmento <= varillasLargas;
            
            if (!posible) {
                continue;
            }

            int segmentosPosibles = sobrante / longitudSegmento;
            if (segmentosPosibles >= numeroSegmentos) {
                sobrante -= numeroSegmentos * longitudSegmento;
                continue;
            }
            numeroSegmentos -= segmentosPosibles;
            sobrante -= segmentosPosibles * longitudSegmento;
            retales += sobrante;
            sobrante = 0;

            while (true) {
                contadorVarillas++;
                segmentosPosibles = varillasLargas / longitudSegmento;
                if (segmentosPosibles >= numeroSegmentos) {
                    sobrante = varillasLargas - numeroSegmentos * longitudSegmento;
                    break;
                }
                numeroSegmentos -= segmentosPosibles;
                retales += varillasLargas % longitudSegmento;
            }
        }
        if (posible) {
            System.out.format("%d %d%n", contadorVarillas, retales);
        } else {
            System.out.println("IMPOSIBLE");
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER128().run();
    }

}
