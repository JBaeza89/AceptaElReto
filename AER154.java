/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer154;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER154 {

    Scanner in;

    public boolean caso() {
        int numeroMatricula = in.nextInt();
        StringBuilder letrasMatricula = new StringBuilder(in.next());
        if (numeroMatricula == 9999 && letrasMatricula.toString().equals("ZZZ")) {
            return false;
        }
        String letras = "BCDFGHJKLMNPQRSTVWXYZ";
        numeroMatricula += 1;
        if (numeroMatricula > 9999) {
            numeroMatricula = 0;
            if (letrasMatricula.charAt(2) != 'Z') {
                char x = letras.charAt(letras.indexOf(letrasMatricula.substring(2))+ 1);
                letrasMatricula.setCharAt(2, x);
            } else if (letrasMatricula.charAt(1) != 'Z') {
                letrasMatricula.setCharAt(2, 'B');
                char x = letras.charAt(letras.indexOf(letrasMatricula.substring(1, 2))+ 1);
                letrasMatricula.setCharAt(1, x);
            } else {
                letrasMatricula.setCharAt(1, 'B');
                letrasMatricula.setCharAt(2, 'B');
                char x = letras.charAt(letras.indexOf(letrasMatricula.substring(0, 1))+ 1);
                letrasMatricula.setCharAt(0, x);
            }
        }
        System.out.format("%04d %s%n", numeroMatricula, letrasMatricula);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER154().run();
    }
    
}
