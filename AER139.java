/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer139;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class AER139 {

    Scanner in;

    public boolean caso() {
        String numero = in.next();
        if (numero.equals("0")) {
            return false;
        }
        System.out.print(numero);
        Set<String> serie = new HashSet<>();
        serie.add(numero);
        boolean cubifinito = true;
        while (cubifinito && !numero.equals("1")) {
            int apoyo = 0;
            for (int i = 0; i < numero.length(); i++) {
                int digito = numero.charAt(i) - '0';
                apoyo += Math.pow(digito, 3);
            }
            String cadena = Integer.toString(apoyo);
            cubifinito = !serie.contains(cadena);
            serie.add(cadena);
            numero = cadena;
            System.out.print(" - " + numero);
        }
        System.out.println(" -> " + (cubifinito? "cubifinito." : "no cubifinito."));
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER139().run();
    }

}
