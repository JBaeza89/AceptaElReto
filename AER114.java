/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer114;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER114 {

    Scanner in;
    
    public void caso() {
        int factorial = in.nextInt();
        switch (factorial) {
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(6);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println(0);
                break;
        }
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER114().run();
    }
    
}
