/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer136;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER136 {

    Scanner in;
    
    public int cortes(int fuerza, int eslabones, int contadorCortes) {
        contadorCortes++;
        int corteCorto = eslabones / 3;
        if (fuerza < corteCorto) {
            contadorCortes = cortes(fuerza, corteCorto, contadorCortes);
        }
        int corteLargo = eslabones - corteCorto;
        if (fuerza < corteLargo) {
            contadorCortes = cortes(fuerza, corteLargo, contadorCortes);
        }
        
        return contadorCortes;
    }
    
    public boolean caso() {
        int fuerza = in.nextInt() * 2;
        int cadena = in.nextInt();
        if (fuerza == 0) {
            return false;
        }
        int contadorCortes = 0;
        if (fuerza < cadena) {
            contadorCortes = cortes(fuerza, cadena, contadorCortes);
        }
        System.out.println(contadorCortes);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER136().run();
    }
    
}
