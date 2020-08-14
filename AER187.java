/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer187;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER187 {

    Scanner in;

    public boolean esLaSiguiente(String cartaColocada, String cartaAComprobar) {
        cartaColocada = cartaColocada.substring(0, cartaColocada.length() - 1);
        cartaAComprobar = cartaAComprobar.substring(0, cartaAComprobar.length() - 1);
        if (cartaColocada.equals("")) {
            return cartaAComprobar.equals("1");
        }
        String[] orden = new String[]{"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};
        int indice = 0;
        while (!cartaColocada.equals(orden[indice])) {
            indice++;
        }
        return cartaAComprobar.equals(orden[indice + 1]);
    }

    public boolean caso() {
        int palos = in.nextInt();

        if (palos == 0) {
            return false;
        }
        Map<Character, Deque<String>> solitario = new HashMap<>();
        Deque<String> baraja = new LinkedList<>();

        for (int i = 0; i < palos * 10; i++) {
            String carta = in.next();
            Character palo = in.next().charAt(0);

            if (!solitario.containsKey(palo)) {
                solitario.put(palo, new LinkedList<String>());

            }
            carta = carta + palo;

            baraja.addFirst(carta);

        }

        while (true) {
            Deque<String> pila = new LinkedList<>();

            int inicio = baraja.size();

            while (!baraja.isEmpty()) {
                pila.addFirst(baraja.removeLast());

                if (!baraja.isEmpty()) {
                    pila.addFirst(baraja.removeLast());

                }
                while (true) {
                    String carta = pila.getFirst();
                    String ultimaCartaPuesta = " ";

                    if (!solitario.get(carta.charAt(carta.length() - 1)).isEmpty()) {
                        ultimaCartaPuesta = solitario.get(carta.charAt(carta.length() - 1)).getFirst();
                    } 
                    if (!esLaSiguiente(ultimaCartaPuesta, carta)) {
                        break;
                    }
                    solitario.get(carta.charAt(carta.length() - 1)).addFirst(pila.removeFirst());
                    if (pila.isEmpty()) {
                        break;
                    }
                }
            }
            if (pila.isEmpty() || pila.size() == inicio) {
                baraja = pila;
                break;
            }
            baraja = pila;
        }
        System.out.println(baraja.isEmpty()? "GANA" : "PIERDE");
        
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());

    }

    public static void main(String[] args) {
        new AER187().run();
    }

}
