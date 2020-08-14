/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer219;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER219 {

    Scanner in;
    
    public void caso() {
        int decimosDistintos = in.nextInt();
        int contadorPares = 0;
        for (int i = 0; i < decimosDistintos; i++) {
            if (in.nextInt() % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println(contadorPares);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER219().run();
    }
    
}
