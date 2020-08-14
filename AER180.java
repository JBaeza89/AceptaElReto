/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer180;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER180 {

    Scanner in;
    
    public void caso() {
        int[] lados = new int[3];
        for(int i = 0; i < 3; i++) {
            lados[i] = in.nextInt();
        }
        Arrays.sort(lados);
        boolean posible = lados[2] < lados[0] + lados [1];
        if (!posible) {
            System.out.println("IMPOSIBLE");            
        } else if(lados[2] * lados[2] == lados[1] * lados[1] + lados[0] * lados[0]) {
            System.out.println("RECTANGULO");
        } else if(lados[2] * lados[2] < lados[1] * lados[1] + lados[0] * lados[0]) {
            System.out.println("ACUTANGULO");
        } else {
            System.out.println("OBTUSANGULO");
        }   
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casosPrueba = in.nextInt();
        for (int i = 0; i < casosPrueba; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER180().run();
    }
    
}
