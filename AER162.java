/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer162;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER162 {

    Scanner in;
    
    public boolean caso() {
        int dimension = in.nextInt();
        if (dimension == 0) {
            return false;
        }
        char caracter = in.next().charAt(0);
        System.out.print("|");
        for (int i = 0; i < dimension * 8; i++) {
            System.out.print("-");
        }
        System.out.println("|");
        boolean color = false;
        for (int i = 1; i <= dimension * 8; i++) {
            System.out.print("|");
            for(int j = 1; j <= dimension * 8; j++) {
                System.out.print(color? caracter : " ");
                if (j % dimension == 0) {
                    color = !color;
                }
            }
            System.out.println("|");
            if (i % dimension == 0) {
                color = !color;
            }
        }
        System.out.print("|");
        for (int i = 0; i < dimension * 8; i++) {
            System.out.print("-");
        }
        System.out.println("|");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER162().run();
    }
    
}
