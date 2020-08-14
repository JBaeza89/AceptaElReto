/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer201;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER201 {

    Scanner in;
    boolean cumple1;
    boolean cumple2;
    int indice;
    
    public boolean comprobarHijo(String s) {
        indice++;
        char x = s.charAt(indice);
        if (x == '.') {
            return false;
        }
        int numeroHijos = 0;
        numeroHijos = comprobarHijo(s) ? numeroHijos + 1 : numeroHijos;
        numeroHijos = comprobarHijo(s) ? numeroHijos + 1 : numeroHijos;
        if (numeroHijos > 1) {
            cumple1 = false;
        }
        if (numeroHijos == 1) {
            cumple2 = false;
        }

        return true;
    }

    public boolean caso() {

        String linea = in.nextLine();

        if (linea.equals(".")) {
            return false;
        }
        cumple1 = true;
        cumple2 = true;
        indice = 0;
        int numeroHijos = 0;
        numeroHijos = comprobarHijo(linea) ? numeroHijos + 1 : numeroHijos;
        numeroHijos = comprobarHijo(linea) ? numeroHijos + 1 : numeroHijos;
        if (numeroHijos > 1) {
            cumple1 = false;
        }
        if (numeroHijos == 1) {
            cumple2 = false;
        }
        if (cumple1) {
            System.out.print(1);
        }
        if (cumple2) {
            System.out.print(2);
        }
        if (!cumple1 && !cumple2) {
            System.out.print("N");
        }
        System.out.println();
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new AER201().run();
    }

}
