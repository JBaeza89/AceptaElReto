/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer217;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER217 {

    Scanner in;
    
    public boolean caso() {
        int numeroCalle = in.nextInt();
        if (numeroCalle == 0) {
            return false;
        }
        System.out.println(numeroCalle % 2 == 0? "DERECHA" : "IZQUIERDA");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER217().run();
    }
    
}
