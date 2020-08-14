/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer247;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER247 {

    Scanner in;
    
    public boolean caso() {
        int numeroIndicadores = in.nextInt();
        if (numeroIndicadores == 0) {
            return false;
        }
        int antiguo = in.nextInt();
        boolean finCrisis = true;
        for (int i = 1; i < numeroIndicadores; i++) {
            int actual = in.nextInt();
            if (actual <= antiguo) {
                finCrisis = false;
                in.nextLine();
                break;
            }
            antiguo = actual;
        }
        System.out.println(finCrisis? "SI" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER247().run();
    }
    
}
