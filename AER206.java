/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer206;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER206 {

    Scanner in;
    
    public void caso() {
        int diagonal = in.nextInt();
        int catetoA = diagonal - 1;
        int catetoB = 1;
        int cuadradoA = catetoA * catetoA;
        int cuadradoB = catetoB * catetoB;
        int diagonalCuadrada = diagonal * diagonal;
        
        while (cuadradoA + cuadradoB != diagonalCuadrada) {
            if (cuadradoA + cuadradoB > diagonalCuadrada) {
                catetoA--;
                cuadradoA = catetoA * catetoA;
            } else if (cuadradoA + cuadradoB < diagonalCuadrada) {
                catetoB++;
                cuadradoB = catetoB * catetoB;
            }
        }
        int suma = catetoA + catetoB;
        System.out.println(suma);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER206().run();
    }
    
}
