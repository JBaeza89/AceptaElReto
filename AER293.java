/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer293;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER293 {

    Scanner in;
    
    public void caso() {
        int patas = 6 * in.nextInt() + 8 * in.nextInt() + 10 * in.nextInt() + 
                2 * in.nextInt() * in.nextInt();
        System.out.println(patas);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER293().run();
    }
    
}
