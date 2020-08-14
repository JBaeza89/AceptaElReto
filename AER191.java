/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer191;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER191 {

    Scanner in;

    public void caso() {
        int numCompartimentos = in.nextInt();
        int compartimentoMayor = in.nextInt();
        int diferencia = in.nextInt();
        int total = 0;
        int compartimento = compartimentoMayor;
        for (int i = 0; i < numCompartimentos; i++) {
            total += compartimento;
            compartimento -= diferencia;
        }
        System.out.println(total);
    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER191().run();
    }

}
