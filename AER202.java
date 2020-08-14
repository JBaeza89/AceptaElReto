/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer202;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER202 {

    Scanner in;
    final int MODULO = 1000000007;
    int[][] resultadosObtenidos;
    
    

    public int contarCombinaciones(int numeroBits, int bitsAUno) {
        if (bitsAUno < 0 || numeroBits < bitsAUno) {
            return 0;
        }
        if (numeroBits == bitsAUno) {
            return 1;
        }
        if (resultadosObtenidos[numeroBits][bitsAUno] != 0) {
            return resultadosObtenidos[numeroBits][bitsAUno];
        }
        resultadosObtenidos[numeroBits][bitsAUno]
                = ((contarCombinaciones(numeroBits - 1, bitsAUno) % MODULO)
                + (contarCombinaciones(numeroBits - 1, bitsAUno - 1) % MODULO)) % MODULO;
        return resultadosObtenidos[numeroBits][bitsAUno];
    }

    public boolean caso() {
        int numeroBits = in.nextInt();
        int bitsAUno = in.nextInt();
        if (numeroBits == 0 && bitsAUno == 0) {
            return false;
        }
        int contador = 0;
        if (numeroBits != 0 && bitsAUno <= numeroBits) {
            contador = contarCombinaciones(numeroBits, bitsAUno);
        }
        System.out.println(contador);
        return true;
    }   

    public void run() {
        in = new Scanner(System.in);
        resultadosObtenidos = new int[1001][1001];
        while (caso());
    }

    public static void main(String[] args) {
        new AER202().run();
    }

}
