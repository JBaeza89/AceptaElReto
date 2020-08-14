/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER210 {
    
    Scanner in;
    List<Integer> primos;
    final int MAYOR_ASCII = 255;
    
    public void calcularPrimos() {
        primos = new ArrayList<>();
        primos.add(2);
        for (int i = 3; i <= MAYOR_ASCII * 50; i += 2) {
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
    }
    
    public void caso() {
        char[] palabra = in.next().toCharArray();
        int suma = 0;
        for (int i = 0; i < palabra.length; i++) {
            suma += palabra[i];
        }
        int busqueda = Collections.binarySearch(primos, suma);
        int primo = busqueda >= 0? primos.get(busqueda - 1) : primos.get((busqueda + 2) * -1);
        System.out.println(primo);
    }

    public void run() {
        in = new Scanner(System.in);
        calcularPrimos();
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER210().run();
    }
    
}
