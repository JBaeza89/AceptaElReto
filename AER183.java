/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer183;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER183 {

    Scanner in;
    
    public String anillosBaseA(int fasesCrecimiento) {
        String anillos = "A";
        if (fasesCrecimiento > 0) {
            anillos = "AN";
        }
        while (fasesCrecimiento > 1) {
            int mitad = anillos.length() / 2;
            String apoyo = anillos.substring(mitad) + anillos.substring(0, mitad);
            anillos = anillos + apoyo;
            fasesCrecimiento--;
        }
        return anillos;
    }
    
    public String anillosBaseN(String anillosA) {
        int mitad = anillosA.length() / 2;
        if (mitad == 0) {
            return "N";
        }
        String anillosN = anillosA.substring(mitad) + anillosA.substring(0, mitad);
        return anillosN;
    }
    
    

    public boolean caso() {
        int fasesCrecimiento = in.nextInt();
        String anelido = in.next();        
        if (anelido.equals("C")) {
            return false;
        }
        String anillosA = anillosBaseA(fasesCrecimiento);
        String anillosN = anillosBaseN(anillosA);
        
        for (int i = 0; i < anelido.length() - 1; i++) {
            System.out.print(anelido.charAt(i) == 'A'? anillosA : anillosN);
        }        
        System.out.println("C");
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER183().run();
    }

}
