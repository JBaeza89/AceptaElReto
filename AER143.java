/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer143;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER143 {

    Scanner in;
    
    public boolean caso() {
        String tortita = in.next();
        if (tortita.equals("-1")) {
            in.next();
            return false;
        }
        Deque<String> tortitas = new ArrayDeque<>();
        tortitas.addFirst(tortita);
        do {
            tortita = in.next();
            if (!tortita.equals("-1")) {
                tortitas.addFirst(tortita);
            }
        } while (!tortita.equals("-1"));
        int volteos = in.nextInt();
        for (int i = 0; i < volteos; i++) {
            int tortitasVolteadas = in.nextInt();
            String[] apoyo = new String[tortitasVolteadas];
            for (int j = 0; j < tortitasVolteadas; j++) {
                apoyo[j] = tortitas.removeFirst();
            }
            for (int j = 0; j < tortitasVolteadas; j++) {
                tortitas.addFirst(apoyo[j]);
            }
        }
        System.out.println(tortitas.getFirst());
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER143().run();
    }
    
}
