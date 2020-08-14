/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer177;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author jorge
 */
public class AER177 {

    Scanner in;
    
    public boolean caso() {
        String[] numeros = new String[8];
        numeros[0] = in.next();
        if (numeros[0].equals("0")) {
            return false;
        }        
        SortedSet<Long> cambios = new TreeSet<>();
        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = in.next();
        }
        for (int i = 0; i < numeros.length; i++) {
            long n = Long.parseLong(numeros[i]);
            cambios.add(10 - n);
            cambios.add(100 - n);
            cambios.add(1000 - n);
            cambios.add(10000 - n);
            cambios.add(100000 - n);
            cambios.add(1000000 - n);
            cambios.add(10000000 - n);
            cambios.add(100000000 - n);
            cambios.add(1000000000 - n);            
        }
        int contadorZipi = 0;
        int contadorZape = 0;
        
        for (long n : cambios) {
            if (n > 0 && n <= 10000000) {
                if (n % 2 == 1) {
                    contadorZipi++;
                    System.out.format("Zipi: %d%n", n);
                } else {
                    contadorZape++;
                    System.out.format("Zape: %d%n", n);
                }
            }
        }
        System.out.format("Resultado final: Zipi: %d Zape: %d%n", contadorZipi, contadorZape);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);        
        while(caso());
    }
    public static void main(String[] args) {
        new AER177().run();
    }
    
}
