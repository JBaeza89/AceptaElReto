/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer164;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER164 {

    Scanner in;
    
    public boolean caso() {
        int base = in.nextInt();
        int altura = in.nextInt();
        base = in.nextInt() - base;
        altura = in.nextInt() - altura;
        if (base < 0 || altura < 0) {
            return false;
        }
        System.out.println(base * altura);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER164().run();
    }
    
}
