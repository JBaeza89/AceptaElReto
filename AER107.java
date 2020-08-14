/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER107 {

    Scanner in;
    List<Integer> primos;
    
    

    
    public boolean caso() {
        int n = in.nextInt();
        int m = in.nextInt();
        if (n == 0 && m == 0) {
            return false;
        }
        int totalPrimos = Math.abs(Collections.binarySearch(primos, n) + 1) ;
        double maximoPermitido = 1.00 / Math.pow(10, m);
        double maximoAproximacion = Math.abs(((double)totalPrimos / n) - (1.00 / Math.log(n)));
        if (maximoAproximacion > maximoPermitido) {
            System.out.println("Mayor");
        } else if (maximoAproximacion < maximoPermitido) {
            System.out.println("Menor"); 
        } else {
            System.out.println("Igual");
        }
        return true;
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        primos = new ArrayList<>();
        primos.add(2);
        for (int i = 3; i <= 100000; i += 2) {
            boolean primo = true;
            for (int p : primos) {
                if (i % p == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                primos.add(i);
            }
        }
        while (caso());
    }
    public static void main(String[] args) {
        new AER107().run();
    }
    
}
