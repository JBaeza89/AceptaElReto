/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer508;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER508 {

    Scanner in;
    
    public boolean caso() {
        int n = in.nextInt();
        if (n == 0) {
            return false;
        }
        PriorityQueue<Integer> inicio = new PriorityQueue<>();
        PriorityQueue<Integer> fin = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            inicio.add(x - y);
            fin.add(x + y);
        }
        int contador = 0;
        int maximo = 0;
        while (!inicio.isEmpty()) {
            if (inicio.element() <= fin.element()) {
                contador++;
                maximo = Math.max(maximo, contador);
                inicio.remove();
            } else {
                contador--;
                fin.remove();
            }
        }
        System.out.println(maximo);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER508().run();
    }
    
}
