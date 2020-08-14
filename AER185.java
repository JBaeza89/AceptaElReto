/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer185;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author jorge
 */
public class AER185 {

    Scanner in;

    public boolean caso() {
        int numeroPotitos = in.nextInt();
        if (numeroPotitos == 0) {
            return false;
        }
        Set<String> buenos = new HashSet<>();
        SortedSet<String> malos = new TreeSet<>();
        for (int i = 0; i < numeroPotitos; i++) {
            if (in.next().equals("SI:")) {
                String ingrediente;
                while (true) {
                    ingrediente = in.next();
                    if (ingrediente.equals("FIN")) {
                        break;
                    }
                    buenos.add(ingrediente);
                }
            } else {
                String ingrediente;
                while (true) {
                    ingrediente = in.next();
                    if (ingrediente.equals("FIN")) {
                        break;
                    }
                    malos.add(ingrediente);
                }
            }
        }
        Iterator<String> ingredientes = malos.iterator();
        while (ingredientes.hasNext()) {
            String ingrediente = ingredientes.next();
            if (!buenos.contains(ingrediente)) {
                System.out.print(ingrediente);
                break;
            }
        }
        
        while (ingredientes.hasNext()) {
            String ingrediente = ingredientes.next();
            if (!buenos.contains(ingrediente)) {
                System.out.print(" " + ingrediente);
            }
        }

        System.out.println();
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER185().run();
    }

}
