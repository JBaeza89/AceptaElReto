/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer541;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER541 {

    Scanner in;
    
    public int mcdEuclides(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    public int mcmEuclides(int a, int b) {
        return a / mcdEuclides(a, b) * b;
    }
    
    public boolean caso() {
        int i = in.nextInt();
        int v = in.nextInt();
        int x = in.nextInt();
        if (i == 0 && v == 0 && x == 0) {
            return false;
        }
        int op = mcdEuclides(i, v);
        op = mcdEuclides(op, x);
        int suma = i / op + v / op + x / op;
        System.out.println(suma);
        
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER541().run();
    }
    
}
