/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer491;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER491 {

    Scanner in;
    int posibilidades;
    int[] uvas;
    long peso;
    
    public void cogerUva(int contador, long pesoAcumulado, int indice) {
        if (pesoAcumulado > peso) {
            return;
        }
        if (contador == 12) {
            if (pesoAcumulado <= peso) {
                posibilidades++;
            }
            return;
        }
        
        for (int i = indice; i <= uvas.length - 12 + contador; i++) {
            cogerUva(contador + 1, pesoAcumulado + uvas[i], i + 1);
        }
    }
    
    public boolean caso() {
        peso = in.nextLong();
        int nUvas = in.nextInt();
        if (peso == 0 && nUvas == 0) {
            return false;
        }
        posibilidades = 0;
        uvas = new int[nUvas];
        int contador = 0;
        long pesoAcumulado = 0;
        for (int i = 0; i < nUvas; i++) {
            uvas[i] = in.nextInt();
        }
        for (int i = 0; i <= nUvas - 12; i++) {
            cogerUva(contador + 1, pesoAcumulado + uvas[i], i + 1);
            
        }
        System.out.println(posibilidades);
        
        
        return true;
    }
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER491().run();
    }
    
}
