/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer225;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER225 {

    Scanner in;

    public int sucesionBastarda(int n, int[] v) {
        if (n == 0) {
            return v[0];
        }
        if (n == 1) {
            return v[1];
        }
        if (v[n] != 0) {
            return v[n];
        }
        v[n] = (sucesionBastarda(n - 1, v) + sucesionBastarda(n - 2, v)) % 1000000007;
        return v[n];
    }

    public void caso() {
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int[] valores = new int[Math.max(n + 1, 2)];
        valores[0] = x;
        valores[1] = y;

        System.out.println(sucesionBastarda(n, valores));
    }
    
    public void caso2() {
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int valor = n > 0? y : x;
        for (int i = 2; i <= n; i++) {
            valor = (x + y) % 1000000007;
            x = y;
            y = valor;
            
        }
        System.out.println(valor);      
        
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER225().run();
    }

}
