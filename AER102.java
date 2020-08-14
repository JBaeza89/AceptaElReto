/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer102;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER102 {

    Scanner in;

    public boolean caso() {
        StringBuilder sb = new StringBuilder(in.nextLine());
        int cambios = 'p' - sb.charAt(0);
        sb.deleteCharAt(0);
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < sb.length(); i++) {
            char x = sb.charAt(i);
            if (x >= 'a' && x <= 'z') {
                x = (char) ((((x - 'a' + cambios) + 26) % 26) + 'a');
            }
            if (x >= 'A' && x <= 'Z') {
                x = (char) ((((x - 'A' + cambios) + 26) % 26) + 'A');
            }
            sb.setCharAt(i, x);
            if (vocales.contains(sb.substring(i, i + 1))) {
                contador++;                
            }
        }
        if (sb.toString().equals("FIN")) {
            return false;
        }
        System.out.println(contador);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER102().run();
    }

}
