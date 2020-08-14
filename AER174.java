/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer174;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER174 {

    Scanner in;

    public boolean comprobarDigitosRepetidos(int anno) {
        String numero = Integer.toString(anno);
        int[] digitos = new int[10];
        for (int i = 0; i < numero.length(); i++) {
            int x = numero.charAt(i) - '0';
            digitos[x]++;
            if (digitos[x] > 1) {
                return true;
            }
        }
        return false;
    }

    public void caso() {
        int anno = in.nextInt();
        boolean digitosRepetidos = comprobarDigitosRepetidos(anno);
        int annoInicioSerie;
        int contador = 1;
        if (comprobarDigitosRepetidos(anno)) {
            while (true) {
                anno--;
                if (!comprobarDigitosRepetidos(anno)) {
                    annoInicioSerie = anno + 1;
                    anno += contador;
                    break;
                }
                contador++;
            }
            while (true) {
                anno++;
                if (!comprobarDigitosRepetidos(anno)) {
                    break;
                }
                contador++;
            }
            
        } else {
            while (true) {
                anno--;
                if (comprobarDigitosRepetidos(anno)) {
                    annoInicioSerie = anno + 1;
                    anno += contador;
                    break;
                }
                contador++;
            }
            while (true) {
                anno++;
                if (comprobarDigitosRepetidos(anno)) {
                    break;
                }
                contador++;
            }
        }
        System.out.println(annoInicioSerie + " " + contador);
    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER174().run();
    }

}
