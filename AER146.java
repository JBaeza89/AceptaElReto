/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer146;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER146 {

    Scanner in;
    
    
    public boolean caso() {
        int n = in.nextInt();
        if (n == 0) {
            return false;
        }
        
        List<Integer> lista = new ArrayList<>(50000);
        
        for (int i = 2; i <= n; i+= 2) {
            lista.add(i);
        }
        int m = 3;
        while(lista.size() >= m) {
            List<Integer> apoyo = new ArrayList<>(50000);
            for (int i = 0; i < lista.size(); i++) {
                if (i % m != 0) {
                    apoyo.add(lista.get(i));
                }
            }
            lista = apoyo;
            m++;
        }
        
        System.out.print(n + ":");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(" " + lista.get(i));
        }
        System.out.println();
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        
        while (caso());
    }
    public static void main(String[] args) {
        new AER146().run();
    }
    
}
