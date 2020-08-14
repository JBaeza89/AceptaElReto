/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer222;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER222 {

    Scanner in;
    
    public void caso() {
        int base = in.nextInt();
        int exponente = in.nextInt();
        int acumuladorPotencias = 1;
        int suma = 1;
        for (int i = 0; i < exponente; i++) {
            acumuladorPotencias = acumuladorPotencias * base % 1000007 ;
            suma = (suma + acumuladorPotencias) % 1000007;
        }
        System.out.println(suma);
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER222().run();
    }
    
}
