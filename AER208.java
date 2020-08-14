/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer208;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER208 {

    Scanner in;
    
    public boolean caso() {
        long filas = in.nextLong();
        long filaBoloGolpeado = in.nextLong();
        if (filas == 0) {
            return false;
        }
        long totalBolos = (filas + 1) * filas / 2;
        long bolosTirados = (filas - filaBoloGolpeado + 2) * (filas - filaBoloGolpeado + 1) / 2;
        long bolosPorTirar = totalBolos - bolosTirados;
        System.out.println(bolosPorTirar);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER208().run();
    }
    
}
