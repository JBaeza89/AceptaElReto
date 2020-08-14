/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer111;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER111 {

    Scanner in;
    
    public boolean caso() {
        String elemento = in.next();
        if (elemento.equals("Exit")) {
            return false;
        }
        short nAtomico = in.nextShort();
        String[] orden = {"1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", "4d", "5p", "6s",
            "4f", "5d", "6p", "7s", "5f", "6d", "7p"};
        short[] electrones = {2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 6};
        String salida = "";
        for (int i = 0; i < orden.length; i++) {
            if (nAtomico > electrones[i]) {
                salida += orden[i] + electrones[i] + " ";
                nAtomico -= electrones[i];
            } else {
                salida += orden[i] + nAtomico;
                break;
            }            
        }
        System.out.println(salida);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER111().run();
    }
    
}
