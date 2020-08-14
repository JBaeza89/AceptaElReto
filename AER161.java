/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer161;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER161 {

    Scanner in;

    public boolean caso() {
        int cantidadNumeros = in.nextInt();
        if (cantidadNumeros == 0) {
            return false;
        }
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidadNumeros; i++) {
            int num = in.nextInt();
            int busqueda = Collections.binarySearch(numeros, num);
            if (busqueda >= 0) {
                numeros.add(busqueda, num);
            } else {
                busqueda = busqueda * -1 - 1;
                numeros.add(busqueda, num);
            }
        }
        
        if (cantidadNumeros % 2 == 0) {
            System.out.println(numeros.get(cantidadNumeros/2) + numeros.get(cantidadNumeros/2 - 1));
        } else {
            System.out.println(numeros.get(cantidadNumeros/2) * 2);
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER161().run();
    }
    
}
