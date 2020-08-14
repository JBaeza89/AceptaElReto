/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer517;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER517 {

    Scanner in;
    int[] combinaciones;
    
    
    public void rellenarDiezPrimerasCombinaciones() {
        combinaciones[0] = 0;
        combinaciones[1] = 1;
        for (int i = 2; i <= 10; i++) {
            combinaciones[i] = combinaciones[i - 1] + combinaciones[i - 2];
        }
    }

    public void caso() {
        int pulsaciones = in.nextInt();
        combinaciones = new int[Math.max(11, pulsaciones + 1)];
        rellenarDiezPrimerasCombinaciones();
        for (int i = 11; i <= pulsaciones; i++) {
            for (int j = 1; j <= 10; j++) {
                combinaciones[i] = (combinaciones[i] + combinaciones[i - j - 1]) % 1000000007;
            }
        }
        System.out.println(combinaciones[pulsaciones]);
        
    }

    public void caso2() {
        int pulsaciones = in.nextInt();
        combinaciones = new int[pulsaciones + 1];
        for (int i = 1; i <= pulsaciones; i++) {            
            for (int j = 1; j <= Math.min(i,10); j++) {
                try {
                    combinaciones[i] = (combinaciones[i] + combinaciones[i - j - 1]) % 1000000007;
                } catch (ArrayIndexOutOfBoundsException ex) {
                    combinaciones[i]++;
                }
                
            }
        }
        System.out.println(combinaciones[pulsaciones]);
        
    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso2();
        }
    }

    public static void main(String[] args) {
        new AER517().run();
    }

}
