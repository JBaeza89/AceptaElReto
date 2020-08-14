/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer145;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER145 {

    Scanner in;

    public void caso() {
        String tren = in.next();
        int contadorParejas = 0;
        Deque<Character> vagones = new ArrayDeque<>();
        for (int i = tren.length() - 1; i >= 0; i--) {
            char x = tren.charAt(i);
            if (x == 'M' || x == 'm') {
                vagones.addFirst(x);
            } else if (x == 'h' && !vagones.isEmpty()) {
                if (vagones.getFirst() == 'm') {
                    contadorParejas++;
                    vagones.removeFirst();
                } else {
                    vagones.clear();
                }
            } else if (x == 'H' && !vagones.isEmpty()) {
                if (vagones.getFirst() == 'M') {
                    contadorParejas++;
                    vagones.removeFirst();
                } else {
                    vagones.clear();
                }
            } else if (x == '@') {
                vagones.clear();
            }
        }
        System.out.println(contadorParejas);
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER145().run();
    }

}
