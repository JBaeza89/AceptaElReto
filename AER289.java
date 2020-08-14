/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer289;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER289 {

    Scanner in;
    
    public boolean caso() {
        int sumandos = in.nextInt();
        if (sumandos == 0) {
            return false;
        }
        PriorityQueue<Long> numeros = new PriorityQueue<>();
        long esfuerzo = 0;
        for (int i = 0; i < sumandos; i++) {
            numeros.add(in.nextLong());
        }
        while (numeros.size() > 1) {
            long op = numeros.remove() + numeros.remove();
            esfuerzo += op;
            numeros.add(op);
        }
        System.out.println(esfuerzo);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER289().run();
    }
    
}
