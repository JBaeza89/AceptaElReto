/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer200;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER200 {

    Scanner in;
    List<String> arbol;
    
    public long secuenciaFibonacci(int n, int nivel) {
        long fibo;
        if (n == 0) {
            fibo = 0;
        } else if (n == 1) {
            fibo = 1;
        } else {
            fibo = secuenciaFibonacci(n - 1, nivel + 1) + secuenciaFibonacci(n - 2, nivel + 1);
        }
        String arbolFibo = "";
        for (int i = 0; i < nivel; i++) {
            arbolFibo += "   ";
        }
        arbolFibo += Long.toString(fibo);
        arbol.add(0, arbolFibo);
        
        return fibo;
    }

    public boolean caso() {
        int n = in.nextInt();
        if (n < 0) {
            return false;
        }
        int nivel = 0;
        arbol = new LinkedList<>();
        long fibo;
        if (n == 0) {
            fibo = 0;
        } else if (n == 1) {
            fibo = 1;
        } else {
            fibo = secuenciaFibonacci(n - 1, nivel + 1) + secuenciaFibonacci(n - 2, nivel + 1);
        }
        arbol.add(0, Long.toString(fibo));
        for (String s : arbol) {
            System.out.println(s);
        }
        System.out.println("====");
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER200().run();
    }

}
