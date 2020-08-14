/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer246;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER246 {

    Scanner in;
    
    public void comprobarPosiblesPolidivisibles(String numeroCadena, int digitosRestantes) {
        if (digitosRestantes == 0) {
            return;
        }
        long numero = Long.parseLong(numeroCadena) * 10;
        for (int i = 0; i <= 9; i++) {
            if (numero % (numeroCadena.length() + 1) == 0) {
                System.out.println(numero);
                comprobarPosiblesPolidivisibles(Long.toString(numero), digitosRestantes - 1);
            }
            numero++;
        }
    }
    
    public void caso() {
        String numero = in.next();
        int digitosMaximos = in.nextInt();
        int digitosRestantes = digitosMaximos - numero.length();
        
        System.out.println(numero);
        comprobarPosiblesPolidivisibles(numero, digitosRestantes);
        System.out.println("---");
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER246().run();
    }
    
}
