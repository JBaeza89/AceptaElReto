/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer481;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER481 {

    Scanner in;
    
    public boolean caso() {
        int f = in.nextInt();
        int c = in.nextInt();
        if (f == 0 && c == 0) {
            return false;
        }
        char[] letras = {'0','h','g', 'f', 'e', 'd', 'c', 'b', 'a'};
        System.out.print(letras[f]);
        System.out.println(c);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER481().run();
    }
    
}
