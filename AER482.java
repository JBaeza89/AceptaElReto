/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer482;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER482 {

    Scanner in;
    
    public boolean caso() {
        String calcetin = in.next();
        if (calcetin.equals(".")) {
            return false;
        }
        int negros = calcetin.equals("N")? 1: 0;
        int grises = calcetin.equals("G")? 1: 0;
        while (true) {
            calcetin = in.next();
            if (calcetin.equals(".")) {
                break;
            }
            if (calcetin.equals("N")) {
                negros++;
            } else {
                grises++;
            }
        }
        String[] salidas = {"EMPAREJADOS", "NEGRO SOLITARIO", "GRIS SOLITARIO", "PAREJA MIXTA"};
        int salida = 0;
        if (negros % 2 == 1) {
            if (grises % 2 == 1) {
                salida = 3;
            } else {
                salida = 1;
            }
        } else {
            if (grises % 2 == 1) {
                salida = 2;
            }
        }
        System.out.println(salidas[salida]);
        
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER482().run();
    }
    
}
