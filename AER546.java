/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer546;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jorge
 */
public class AER546 {

    Scanner in;
    
    public void caso() {
        int numeroAlejandro = in.nextInt();
        Set<Integer> cromosA = new HashSet<>();
        TreeSet<Integer>repetidosA = new TreeSet<>();
        for (int i = 0; i < numeroAlejandro; i++) {
            int cromo = in.nextInt();
            if (cromosA.contains(cromo)) {
                repetidosA.add(cromo);
            } else {
                cromosA.add(cromo);
            }
        }
        int numeroMateo = in.nextInt();
        Set<Integer> cromosM = new HashSet<>();
        TreeSet<Integer>repetidosM = new TreeSet<>();
        for (int i = 0; i < numeroMateo; i++) {
            int cromo = in.nextInt();
            if (cromosM.contains(cromo)) {
                repetidosM.add(cromo);
            } else {
                cromosM.add(cromo);
            }
        }
        boolean vacia = true;
        for (int v : repetidosA) {
            if (!cromosM.contains(v)) {
                if (!vacia) {
                    System.out.print(" ");
                }
                System.out.print(v);
                vacia = false;
            }
        }
        System.out.println(vacia? "Nada que intercambiar" : "");
        vacia = true;
        for (int v : repetidosM) {
            if (!cromosA.contains(v)) {
                if (!vacia) {
                    System.out.print(" ");
                }
                System.out.print(v);
                vacia = false;
            }
        }
        System.out.println(vacia? "Nada que intercambiar" : "");
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER546().run();
    }
    
}
