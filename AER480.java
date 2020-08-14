/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer480;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER480 {

    Scanner in;

    public void caso() {
        int uvasCompradas = in.nextInt();
        int uvasMalasPorLote = in.nextInt();
        int tamannoLote = in.nextInt();
        int uvasMalas = ((uvasCompradas / tamannoLote) * uvasMalasPorLote)
                + Math.min(uvasCompradas % tamannoLote, uvasMalasPorLote);
        System.out.println(uvasMalas);

    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER480().run();
    }

}
