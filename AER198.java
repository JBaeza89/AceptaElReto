/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer198;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER198 {

    Scanner in;

    public void caso() {
        String linea = in.nextLine();
        Queue<Integer> cola = new ArrayDeque<>();
        Deque<Integer> pila = new ArrayDeque<>();
        boolean errorCola = false;
        boolean errorPila = false;
        for (int i = 0; i < linea.length(); i++) {
            char x = linea.charAt(i);
            if (Character.isDigit(x)) {
                cola.add(x - '0');
                pila.addFirst(x - '0');
            } else {
                try {
                    int op2 = cola.remove();
                    int op1 = cola.remove();
                    switch (x) {
                        case '+':
                            cola.add(op1 + op2);
                            break;
                        case '-':
                            cola.add(op1 - op2);
                            break;
                        case '*':
                            cola.add(op1 * op2);
                            break;
                        default:
                            cola.add(op1 / op2);
                            break;
                    }
                } catch (Exception ex) {
                    errorCola = true;
                }
                try {
                    int op2 = pila.removeFirst();
                    int op1 = pila.removeFirst();
                    switch (x) {
                        case '+':
                            pila.addFirst(op1 + op2);
                            break;
                        case '-':
                            pila.addFirst(op1 - op2);
                            break;
                        case '*':
                            pila.addFirst(op1 * op2);
                            break;
                        default:
                            pila.addFirst(op1 / op2);
                            break;
                    }
                } catch (Exception ex) {
                    errorPila = true;
                }
            }
        }
        if (errorPila && errorCola) {
            System.out.println("ERROR = ERROR");
        } else if (errorPila) {
            System.out.format("ERROR != %d%n", cola.element());
        } else if (errorCola) {
            System.out.format("%d != ERROR%n", pila.getFirst());
        } else {
            System.out.format("%d %s %d%n", pila.getFirst(),
                    (int) pila.getFirst() == (int) cola.element() ? "=" : "!=", cola.element());
        }
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNextLine()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER198().run();
    }

}
