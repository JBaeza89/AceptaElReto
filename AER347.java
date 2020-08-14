/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer347;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER347 {

    Scanner in;
    
    public boolean caso() {
        int ancho = in.nextInt();
        int largo = in.nextInt();
        if (ancho == 0 && largo == 0) {
            return false;
        }
        int contador = 0;
        while (true) {
            if (ancho < 10 || largo < 10) {
                break;
            }
            if (ancho > largo) {
                contador += ancho / largo;
                ancho %= largo;
            } else if (largo > ancho) {
                contador+= largo / ancho;
                largo %= ancho; 
            } else {
                contador++;
                break;
            }
            
        }
        System.out.println(contador);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER347().run();
    }
    
}
