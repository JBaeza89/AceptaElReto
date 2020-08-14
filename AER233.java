/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer233;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER233 {

    Scanner in;

    public boolean caso() {
        int numero = in.nextInt();
        if (numero == 0) {
            return false;
        }
        int nueves = numero / 9;
        int primeraCifra = numero % 9;
        if (primeraCifra != 0) {
            System.out.print(primeraCifra);
        }

        for (int i = 0; i < nueves; i++) {
            System.out.print(9);
        }
        System.out.println();
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER233().run();
    }

}
