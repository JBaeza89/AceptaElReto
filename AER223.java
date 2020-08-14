/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer223;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER223 {

    Scanner in;
    
    public void caso() {
        int tamannoSecuencia = in.nextInt();
        int contador = 0;
        int mayor = 0;
        int posicionMayor = 0;
        for (int i = 0; i < tamannoSecuencia; i++) {
            if (in.nextInt() != 0) {
                contador++;
                if (contador > mayor) {
                    mayor = contador;
                    posicionMayor = i;
                }
            } else {
                contador = 0;
            }
        }
        if (mayor > 0) {
            int posicionMenor = posicionMayor - mayor + 1;
            System.out.format("%d -> [%d,%d]%n", mayor, posicionMenor, posicionMayor);
        } else {
            System.out.println("SIGUE BUSCANDO");
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
        new AER223().run();
    }
    
}
