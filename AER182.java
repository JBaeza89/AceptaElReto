/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer182;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER182 {

    Scanner in;
    
    public void caso() {
        String numero = in.next();
        int contador = 0;
        while (numero.length() > 1) {
            int producto = 1;
            for (int i = 0; i < numero.length(); i++) {
                producto *= numero.charAt(i) - '0';
            }
            numero = Integer.toString(producto);
            contador++;
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
        new AER182().run();
    }
    
}
