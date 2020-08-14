/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer295;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER295 {

    Scanner in;
    final int MODULO = 31543;
    
    public int potenciaRecursiva(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int potenciaIntermedia;
        if (n % 2 == 0) {
            potenciaIntermedia = potenciaRecursiva(x, n / 2);
            return (potenciaIntermedia * potenciaIntermedia) % MODULO;
        }
        potenciaIntermedia = potenciaRecursiva(x, (n -1) / 2);
        return (((potenciaIntermedia * potenciaIntermedia) % MODULO) * x) % MODULO;
    }
    
    public boolean caso() {
        int base = in.nextInt() % MODULO;
        int exponente = in.nextInt();
        if (base == 0 && exponente == 0) {
            return false;            
        }
        System.out.println(potenciaRecursiva(base, exponente));
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER295().run();
    }
    
}
