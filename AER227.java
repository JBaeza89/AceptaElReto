/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer227;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER227 {

    Scanner in;

    final int MODULO = 1000000007;

    

    public boolean caso() {
        int n = in.nextInt();
        int m = in.nextInt();
        if (n == 0 && m == 0) {
            return false;
        }
        BigInteger ultimo = new BigInteger("1");
        int[] resultados = new int[n + 1];
        int resultado = 1;
        for (int i = 0; i <= n / 2; i++) {
            
            resultados[i] = resultado;
            resultados[n - i] = resultado;
            if (i == m) {
                break;
            }
            ultimo = ultimo.multiply(new BigInteger(Integer.toString(n - i))).
                    divide(new BigInteger(Integer.toString(i + 1)));
            resultado = ultimo.mod(new BigInteger(Integer.toString(MODULO))).intValue();
        }
        System.out.print(resultados[0]);
        for (int i = 1; i <= m; i++) {
            System.out.print(" " + resultados[i]);
        }
        System.out.println();

        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER227().run();
    }

}
