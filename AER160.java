/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer160;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER160 {

    Scanner in;

    public boolean caso() {
        int n = in.nextInt();
        if (n == 0) {
            return false;
        }
        String[][] matriz = new String[n][n];
        boolean trianguloSuperior = true;
        boolean trianguloinferior = true;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = in.next();
                if (i < j && !matriz[i][j].equals("0")) {
                    trianguloSuperior = false;
                } else if (i > j && !matriz[i][j].equals("0")) {
                    trianguloinferior = false;
                }
            }
        }
        System.out.println(trianguloSuperior || trianguloinferior ? "SI" : "NO");
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER160().run();
    }
    
}
