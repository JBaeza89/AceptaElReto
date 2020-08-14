/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer150;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER150 {

    Scanner in;

    public boolean caso() {
        int lado = in.nextInt();
        char caracter = in.next().charAt(0);
        if (lado == 0 && caracter == '0') {
            return false;
        }
        int blancos = lado -1;
        int caracteres = lado;
        for (int i = 1; i < lado * 2; i++) {
            for (int j = 0; j < blancos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < caracteres; j++) {
                System.out.print(caracter);
            }
            
            if (i < lado) {
                blancos--;
                caracteres += 2;
            } else {
                blancos++;
                caracteres -= 2;
            }
            System.out.println();
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER150().run();
    }

}
