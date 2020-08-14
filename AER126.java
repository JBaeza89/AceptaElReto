/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer126;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER126 {

    Scanner in;
    
    public boolean caso() {
        int primo = in.nextInt();
        int factorial = in.nextInt();
        if (primo < 0 && factorial < 0) {
            return false;
        }
        System.out.println(primo <= factorial || primo == 1? "YES" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER126().run();
    }
    
}
