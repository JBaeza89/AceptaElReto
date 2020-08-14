/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer291;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author jorge
 */
public class AER291 {

    Scanner in;
    
    public boolean caso() {
        int lineas = Integer.parseInt(in.nextLine());
        if (lineas == 0) {
            return false;
        }
        Map<String, SortedSet<Integer>> mapa = new TreeMap<>();
        for (int i = 1; i <= lineas; i++) {
            String[] linea = in.nextLine().toLowerCase().split(" ");
            for (int j = 0; j < linea.length; j++) {
                if (linea[j].length() > 2) {
                    if (!mapa.containsKey(linea[j])) {
                        mapa.put(linea[j], new TreeSet<Integer>());
                    }
                    mapa.get(linea[j]).add(i);
                }
            }
        }
        for (String clave : mapa.keySet()) {
            System.out.format("%s", clave);
            for (Integer linea : mapa.get(clave)) {
                System.out.format(" %d", linea);
            }
            System.out.println();
        }
        System.out.println("----");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    
    public static void main(String[] args) {
        new AER291().run();
    }
    
}
