/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer249;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class AER249 {

    Scanner in;
    
    public void caso() {
        int burros = in.nextInt();
        int sacos = in.nextInt();
        Set<Integer> pesos = new HashSet<>();
        int contador = 0;
        for (int i = 0; i < sacos; i++) {
            int pesoSaco = in.nextInt();
            if (pesos.contains(pesoSaco)) {
                contador++;
                pesos.remove(pesoSaco);
            } else {
                pesos.add(pesoSaco);
            }
            if (contador == burros) {
                in.nextLine();
                break;
            }
        }
        System.out.println(contador);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        
        for(int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER249().run();
    }
    
}
