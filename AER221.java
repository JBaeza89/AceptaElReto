/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer221;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER221 {

    Scanner in;
    
    public void caso() {
        int vecinosEnLaFila = in.nextInt();
        boolean abrirPuerta = true;
        int contadorImpares = 0;
        for (int i = 0; i < vecinosEnLaFila; i++) {
            if (in.nextInt() % 2 != 0) {
                contadorImpares++;
            } else if (contadorImpares > 0) {
                abrirPuerta = false;
            }
        }
        
        if (abrirPuerta) {
            System.out.println("SI " + (vecinosEnLaFila - contadorImpares));
        } else {
            System.out.println("NO");
        }
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER221().run();
    }
    
}
