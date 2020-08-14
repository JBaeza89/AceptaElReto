/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer238;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER238 {

    Scanner in;
    
    public boolean caso() {
        int numeroBilletes = in.nextInt();
        int numeroPersonas = in.nextInt();
        if (numeroBilletes == 0 && numeroPersonas == 0) {
            return false;
        }
        List<Integer>[] personas = new List[numeroPersonas];
        
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = new ArrayList<Integer>();
            personas[i].add(0);
        }
        
        int indice = 0;
        for (int i = 1; i <= numeroBilletes; i++) {
            int billete = in.nextInt();
            personas[indice].add(billete);
            personas[indice].set(0, personas[indice].get(0) + billete);
            indice = i % numeroPersonas;
        }
        
        for (int i = 0; i < personas.length; i++) {
            System.out.format("%d:", personas[i].get(0));
            for (int j = 1; j < personas[i].size(); j++) {
                System.out.format(" %d", personas[i].get(j));
            }
            System.out.println();
        }
        System.out.println("---");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER238().run();
    }
    
}
