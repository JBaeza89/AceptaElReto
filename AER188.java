/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer188;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER188 {

    Scanner in;

    public void caso() {
        String[] palabras = in.nextLine().split(" ");
        boolean coincide = true;
        if (palabras.length > 1) {
            for (int i = 0; i < palabras.length - 1; i++) {
                if (palabras[i + 1].charAt(0) != palabras[i].charAt(palabras[i].length() - 2) || 
                        palabras[i + 1].charAt(1) != palabras[i].charAt(palabras[i].length() - 1)) {
                    coincide = false;
                    break;
                }
            }
        }
        System.out.println(coincide ? "SI" : "NO");
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNextLine()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER188().run();
    }

}
