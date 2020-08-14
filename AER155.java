/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer155;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER155 {

    Scanner in;
    
    public boolean caso() {
        int x = in.nextInt() * 2;
        int y = in.nextInt() * 2;
        if (x < 0 || y < 0) {
            return false;
        }
        int suma = x + y;
        System.out.println(suma);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    
    public static void main(String[] args) {
        new AER155().run();
    }
    
}
