/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer242;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER242 {

    Scanner in;
    
    public boolean caso() {
        int numeroPaises = in.nextInt();
        if (numeroPaises == 0) {
            return false;
        }
        long parejas = 0; 
        long personas = in.nextInt();
        for (int i = 1; i < numeroPaises; i++) {
            int nuevoPais = in.nextInt();
            parejas += personas * nuevoPais;
            personas += nuevoPais;
        }
        System.out.println(parejas);
        
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER242().run();
    }
    
}
