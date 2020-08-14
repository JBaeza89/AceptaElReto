/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer400;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER400 {

    Scanner in;
    
    public void caso() {
        String camas = in.nextLine();
        int indice = 0;
        int mayor = 0;
        int contador = 0;
        while (camas.charAt(indice) == '.') {
            contador++;
            indice++;
        }
        mayor = contador - 1;
        contador = 0;
        while (indice < camas.length()) {
            if (camas.charAt(indice) == '.') {
                contador++;
            } else {
                mayor = Math.max(mayor, contador % 2 == 0? contador / 2 - 1 : contador / 2);
                contador = 0;
            }
            indice++;
        }
        mayor = Math.max(mayor, contador - 1);
        System.out.println(mayor);
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (in.hasNextLine()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER400().run();
    }
    
}
