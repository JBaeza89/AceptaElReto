/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer537;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class AER537 {

    Scanner in;
    Map<Integer, Set<Integer>> carriles;
    boolean[] puntos;

    public void comprobarCaminos(int x) {
        Set<Integer> caminos = carriles.get(x);
        for (int v : caminos) {
            if (!puntos[v]) {
                puntos[v] = true;
                comprobarCaminos(v);
            }

        }
    }
    
    public boolean hayCaminos() {
        for(int i = 1; i < puntos.length; i++) {
            if (!puntos[i]){
                return false;
            }
        }
        return true;
    }

    public void caso() {
        int p = in.nextInt();
        int c = in.nextInt();
        puntos = new boolean[p + 1];
        puntos[1] = true;
        carriles = new HashMap<Integer, Set<Integer>>();
        carriles.put(1, new HashSet<Integer>());
        for (int i = 0; i < c; i++) {
            int ini = in.nextInt();
            int fin = in.nextInt();
            if (carriles.containsKey(ini)) {
                carriles.get(ini).add(fin);
            } else {
                carriles.put(ini, new HashSet<Integer>());
                carriles.get(ini).add(fin);
            }
            if (carriles.containsKey(fin)) {
                carriles.get(fin).add(ini);
            } else {
                carriles.put(fin, new HashSet<Integer>());
                carriles.get(fin).add(ini);
            }
        }
        comprobarCaminos(1);
        System.out.println(hayCaminos()? "BICI" : "A PIE");

    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }

    }

    public static void main(String[] args) {
        new AER537().run();
    }

}
