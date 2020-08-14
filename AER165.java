/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer165;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER165 {

    Scanner in;
    
    public boolean caso() {
        int numero = in.nextInt();
        if (numero < 0) {
            return false;
        }
        boolean hyperPar = numero % 2 == 0;
        while (hyperPar && numero > 9) {
            numero /= 10;
            if (numero % 2 != 0) {
                hyperPar = false;
            }
            
        }
        
        System.out.println(hyperPar? "SI" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER165().run();
    }
    
}
