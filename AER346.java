/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer346;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER346 {

    Scanner in;
    
    public boolean caso() {
        int nacimientosTotales = in.nextInt();
        int periodo = in.nextInt();
        if (nacimientosTotales == 0 && periodo == 0) {
            return false;
        }
        List<Integer> annosNacimientos = new ArrayList<Integer>();
        annosNacimientos.add(in.nextInt());
        int mayor = 1;
        int indice = 0;
        for (int i = 1; i < nacimientosTotales; i++) {
            int anno = in.nextInt();
            while(indice < annosNacimientos.size() && anno - annosNacimientos.get(indice) >= periodo) {
                indice++;
            }
            annosNacimientos.add(anno);
            mayor = Math.max(mayor, annosNacimientos.size() - indice);
        }
        System.out.println(mayor);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER346().run();
    }
    
}
