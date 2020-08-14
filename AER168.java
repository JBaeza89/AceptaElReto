/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer168;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER168 {

    Scanner in;
    
    public boolean caso() {
        int piezas = in.nextInt();
        if (piezas == 0) {
            return false;
        }
        int suma = 0;
        for (int i = 1; i < piezas; i++) {
            suma += in.nextInt();
        }
        int resultado = ((1 + piezas) * piezas / 2) - suma;
        System.out.println(resultado);
        return true;
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    
    public static void main(String[] args) {
        new AER168().run();
    }
    
}
