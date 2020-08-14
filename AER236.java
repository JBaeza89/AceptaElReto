/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer236;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER236 {

    Scanner in;
    
    public boolean caso() {
        long primeraCasilla = in.nextLong();
        long factor = in.nextLong();
        long casillas = in.nextLong();
        if (primeraCasilla == 0 && factor == 0 && casillas == 0) {
            return false;
        }
        long totalGranos = casillas > 0? primeraCasilla : 0;
        long multiplicador = primeraCasilla;
        for (int i = 1; i < casillas; i++) {
            multiplicador *= factor;
            totalGranos += multiplicador;
        }
        System.out.println(totalGranos);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER236().run();
    }
    
}
