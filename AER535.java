/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer535;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER535 {

    Scanner in;
    
    public boolean caso() {
        int tramos = Integer.parseInt(in.nextLine());
        if (tramos == 0) {
            return false;
        }
        String[] entrada = in.nextLine().split(" ");
        int alturaPueblo = Integer.parseInt(entrada[entrada.length - 1]);
        int acumulador = 0;
        for (int i = 0; i < entrada.length - 1; i++) {
            acumulador += alturaPueblo - Integer.parseInt(entrada[i]);
        }
        System.out.println(acumulador);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER535().run();
    }
    
}
