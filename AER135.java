/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer135;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER135 {

    Scanner in;
    
    public void caso() {
        int contadorCambios = 0;
        int numero = in.nextInt();
        int apoyo = in.nextInt();
        int constanteActual = (apoyo + 1000000 - numero) % 1000000;
        while(true) {
            numero = apoyo;
            apoyo = in.nextInt();
            if (apoyo == -1) {
                break;
            }
            int constApoyo = (apoyo + 1000000 - numero) % 1000000;
            if (constanteActual != constApoyo) {
                contadorCambios++;
                constanteActual = constApoyo;
            }
        }
        int numeroFinal = (numero + constanteActual) % 1000000;
        System.out.println(contadorCambios + " " + numeroFinal);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER135().run();
    }
    
}
