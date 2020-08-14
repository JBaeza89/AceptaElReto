/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer544;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER544 {

    Scanner in;

    public void caso() {
        int numeroUvas = in.nextInt();
        long pesoMaximo = in.nextLong();
        int indice = 0;
        long uva = 0;        
        int contador = 0;
        for (int i = 0; i < numeroUvas; i++) {
            long nuevaUva = in.nextLong();
            if (nuevaUva <= pesoMaximo) {
                if (uva + nuevaUva <= pesoMaximo) {
                    contador++;
                    uva = Math.max(uva, nuevaUva);                    
                } else {
                    uva = Math.min(uva, nuevaUva);
                }
            }
        }
        System.out.println(contador);
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER544().run();
    }

}
