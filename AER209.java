/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer209;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER209 {
    
    Scanner in;
    
    public void caso() {
        String tunel = in.next();
        int consultas = in.nextInt();
        List<Integer> posicionTelefonos = new ArrayList<>();
        posicionTelefonos.add(0);
        for (int i = 0; i < tunel.length(); i++) {
            if (tunel.charAt(i) == 'T') {
                posicionTelefonos.add(i + 1);
            }
        }
        posicionTelefonos.add(tunel.length() + 1);
        
        for (int i = 0; i < consultas; i++) {
            int seccion = in.nextInt();
            int busqueda = Collections.binarySearch(posicionTelefonos, seccion);
            if (busqueda >= 0) {
                System.out.println("AQUI");
            } else {
                busqueda = (busqueda + 1) * -1;
                if (posicionTelefonos.get(busqueda) - seccion >
                        seccion - posicionTelefonos.get(busqueda - 1)) {
                    System.out.println("PENINSULA");
                } else if (posicionTelefonos.get(busqueda) - seccion <
                        seccion - posicionTelefonos.get(busqueda - 1)) {
                    System.out.println("ISLAS");
                } else {
                    if (seccion > tunel.length() + 1 - seccion) {
                        System.out.println("ISLAS");
                    } else {
                        System.out.println("PENINSULA");
                    }
                }
                
            }
        }
    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER209().run();
    }
    
}
