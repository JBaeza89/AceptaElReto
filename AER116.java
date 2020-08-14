/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer116;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER116 {

    Scanner in;
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            System.out.println("Hola mundo.");
        }
    }
    public static void main(String[] args) {
        new AER116().run();
    }
    
}
