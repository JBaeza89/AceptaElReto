/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer171;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER171 {

    Scanner in;
    
    public boolean caso() {
        int nMontannas = in.nextInt();
        if (nMontannas == 0) {
            return false;
        }
        List<Integer> montannas = new LinkedList<>();
        for (int i = 0; i < nMontannas; i++) {
            montannas.add(0, in.nextInt());
        }
        int contador = 0;
        int mayor = 0;
        for (int m : montannas) {
            if (m > mayor) {
                contador++;
                mayor = m;
            }
        }
        System.out.println(contador);
        return true;
    }
    
    public boolean caso2() {
        int nMontannas = in.nextInt();
        if (nMontannas == 0) {
            return false;
        }
        int[] montannas = new int[nMontannas];
        for (int i = nMontannas - 1; i >= 0; i--) {
            montannas[i] = in.nextInt();
        }
        int contador = 0;
        int mayor = 0;
        for (int m : montannas) {
            if (m > mayor) {
                contador++;
                mayor = m;
            }
        }
        System.out.println(contador);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso2());
    }
    
    public static void main(String[] args) {
        new AER171().run();
    }
    
}
