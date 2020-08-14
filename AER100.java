/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer100;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER100 {

    Scanner in;

    public void caso() {
        String numero = in.next();
        
        int contador = 0;

        while (!numero.equals("6174") && contador < 8) {
            int ceros = 4 - numero.length();
            for (int i = 0; i < ceros; i++) {
                numero = "0" + numero;
            }
            char[] nAscendente = numero.toCharArray();
            Arrays.sort(nAscendente);
            char[] nDescendente = new char[]{
                nAscendente[3], nAscendente[2], nAscendente[1], nAscendente[0]};

            int resultado = Integer.parseInt(new String(nDescendente))
                    - Integer.parseInt(new String(nAscendente));
            contador++;
            numero = String.format("%d", resultado);
            
        }
        System.out.println(contador);

    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER100().run();
    }

}
