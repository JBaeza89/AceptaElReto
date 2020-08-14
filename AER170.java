/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer170;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER170 {

    Scanner in;
    
    public boolean caso() {
        int piedras = in.nextInt();
        if (piedras == 0) {
            return false;
        }
        int triangulo = (int)Math.sqrt(piedras * 2);        
        int restantes = piedras - ((triangulo + 1) * triangulo / 2);
        if (restantes < 0) {
            triangulo--;
            restantes = piedras - ((triangulo + 1) * triangulo / 2);
        }
        System.out.format("%d %d%n", triangulo, restantes);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER170().run();
    }
    
}
