/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer158;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER158 {

    Scanner in;

    public void caso() {
        int numeroMuros = in.nextInt();
        int muro = in.nextInt();
        int subidas = 0;
        int bajadas = 0;
        for (int i = 1; i < numeroMuros; i++) {
            int siguienteMuro = in.nextInt();
            if (siguienteMuro > muro) {
                subidas++;
            } else if (siguienteMuro < muro) {
                bajadas++;
            }
            muro = siguienteMuro;
        }
        System.out.println(subidas + " " + bajadas);
    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER158().run();
    }

}
