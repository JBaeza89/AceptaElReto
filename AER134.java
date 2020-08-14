/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer134;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author jorge
 */
public class AER134 {

    Scanner in;
    String[] valores = new String[] {
        "2", "3", "4", "5", "6", "7","8", "9", "10", "J", "Q", "K","A"};
    
    public int posicionCarta(String c) {
        int posicion;
        try {
            posicion = Integer.parseInt(c) - 2;
        } catch (NumberFormatException ex) {
            switch (c) {
                case "J":
                    posicion = 9;
                    break;
                case "Q":
                    posicion = 10;
                    break;
                case "K":
                    posicion = 11;
                    break;
                default:
                    posicion = 12;
                    break;
            }
        }
        return posicion;
    }
    
    public boolean caso() {
        String carta = in.next();
        if (carta.equals("0")) {
            return false;
        }
        String palo = in.next();
        List<Integer> mano = new ArrayList<>();
        boolean palosIguales = true;
        mano.add(posicionCarta(carta));
        for (int i = 1; i < 4; i++) {
            carta = in.next();
            String apoyo = in.next();
            palosIguales = palosIguales && palo.equals(apoyo);
            if (palosIguales) {
                mano.add(posicionCarta(carta));
            }
        }
        if (palosIguales) {
            Collections.sort(mano);
            if (mano.get(3) - mano.get(0) > 4) {
                System.out.println("NADA");
            } else {
                int cartaRestante = 0;
                for (int i = 1; i < 4; i++) {
                    if (mano.get(i) - 2 == mano.get(i - 1)) {
                        cartaRestante = mano.get(i) - 1;
                        break;
                    }
                }
                if (cartaRestante == 0) {
                    cartaRestante = mano.get(3) != 12? mano.get(3) + 1 : 8;
                }
                System.out.println(valores[cartaRestante] + " " + palo);
            }
            
        } else {
            System.out.println("NADA");
        }
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER134().run();
    }
    
}
