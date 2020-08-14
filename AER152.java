/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer152;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER152 {

    Scanner in;
    
    public boolean caso() {
        int valores = in.nextInt();
        if (valores == 0) {
            return false;
        }
        int mayor = 0;
        int moda = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < valores; i++) {
            int numero = in.nextInt();
            if (m.containsKey(numero)) {
                m.put(numero, m.get(numero) +1);
            } else {
                m.put(numero, 1);
            }
            if (Math.max(mayor, m.get(numero)) == m.get(numero)) {
                mayor = m.get(numero);
                moda = numero;
            }            
        }
        System.out.println(moda);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER152().run();
    }
    
    
}
