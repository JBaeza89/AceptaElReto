/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer133;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER133 {

    Scanner in;
    
    public int calcularUnValor(String v, int base) {
        int calculo = 0;
        for (int i = 0; i < v.length(); i++) {
            char x = v.charAt(i);
            if (Character.isDigit(x)) {
                calculo = (calculo + x - '0') % (base - 1);
            } else {
                calculo = (calculo + x - 'A' + 10) % (base - 1);
            }
        }
        return calculo;
    }
    
    public void caso() {
        int base = in.nextInt();
        String dividendo = in.next();
        String divisor = in.next();
        String cociente = in.next();
        String resto = in.next();
        int f = calcularUnValor(dividendo, base);
        int d = calcularUnValor(divisor, base);
        int c = calcularUnValor(cociente, base);
        int r = calcularUnValor(resto, base);
        int calculos = (d * c + r) % (base - 1);
        
        if (calculos == f) {
            System.out.println("POSIBLEMENTE CORRECTO");            
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
        
    }
    public static void main(String[] args) {
        new AER133().run();
    }
    
}
