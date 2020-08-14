/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer117;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int personas = in.nextInt();
        for (int i = 0; i < personas; i++) {
            in.next();
            System.out.format("Hola, %s.%n", in.next());
        }
    }
    
}
