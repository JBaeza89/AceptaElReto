/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer547;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER547 {

    Scanner in;
    
    public boolean caso() {
        int luces = in.nextInt();
        long inicio = in.nextLong();
        long fin = in.nextLong();
        if (luces == 0 && inicio == 0 && fin == 0) {
            return false;
        }
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
        
    }
    public static void main(String[] args) {
        new AER547().run();
    }
    
}
