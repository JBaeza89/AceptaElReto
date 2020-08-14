/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer186;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER186 {

    Scanner in;
    
    public boolean caso() {
        int nEquipos = in.nextInt();
        int nGlobos = in.nextInt();
        if (nEquipos == 0 && nGlobos == 0) {
            return false;
        }
        int[] clasificacion = new int[nEquipos];
        
        for (int i = 0; i < nGlobos; i++) {
            int equipo = in.nextInt();
            clasificacion [equipo - 1]++;
            in.next();
        }
        int ganador = 0;
        boolean empate = false;
        for (int i = 1; i < nEquipos; i++) {
            if (clasificacion[ganador] == clasificacion[i]) {
                empate = true;
            }
            if (clasificacion[i] > clasificacion[ganador]) {
                ganador = i;
                empate = false;
            }
        }
        System.out.println(empate? "EMPATE" : Integer.toString(ganador + 1));
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER186().run();
    }
    
}
