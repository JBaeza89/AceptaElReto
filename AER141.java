/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer141;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER141 {

    Scanner in;

    public void caso() {
        String cadena = in.nextLine();
        Deque<Character> pila = new LinkedList<>();
        for (int i = 0; i < cadena.length(); i++) {
            char x = cadena.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                pila.addFirst(x);
            } else if (x == ')' || x == '}' || x == ']') {
                if (pila.isEmpty() || Math.abs(x - pila.getFirst()) > 2) {
                    System.out.println("NO");
                    return;
                }
                pila.removeFirst();
            }
        }
        System.out.println(pila.isEmpty() ? "YES" : "NO");
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNextLine()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER141().run();
    }

}
