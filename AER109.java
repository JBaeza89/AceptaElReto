/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer109;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER109 {

    Scanner in;

    public boolean caso() {
        String categoria = in.next();
        if (categoria.equals("FIN")) {
            return false;
        }

        String token;
        Map<String, Integer> parejas = new HashMap<>();
        int contador = 0;
        do {
            token = in.next();
            if (!token.equals("FIN")) {
                contador++;

                String e1 = token;
                int sets1 = in.nextInt();
                String e2 = in.next();
                int sets2 = in.nextInt();
                if (sets1 > sets2) {
                    if (parejas.containsKey(e1)) {
                        parejas.put(e1, parejas.get(e1) + 2);
                    } else {
                        parejas.put(e1, 2);
                    }
                    if (parejas.containsKey(e2)) {
                        parejas.put(e2, parejas.get(e2) + 1);
                    } else {
                        parejas.put(e2, 1);
                    }
                } else {
                    if (parejas.containsKey(e2)) {
                        parejas.put(e2, parejas.get(e2) + 2);
                    } else {
                        parejas.put(e2, 2);
                    }
                    if (parejas.containsKey(e1)) {
                        parejas.put(e1, parejas.get(e1) + 1);
                    } else {
                        parejas.put(e1, 1);
                    }
                }
            }
        } while (!token.equals("FIN"));
        int mayor = Collections.max(parejas.values());
        int partidosNoJugados = parejas.size() * (parejas.size() - 1) - contador;

        contador = 0;
        String ganador = "";
        for (String pareja : parejas.keySet()) {
            if (parejas.get(pareja) == mayor) {
                contador++;
                if (contador > 1) {
                    break;
                }
                ganador = pareja;
            }
        }
        if (contador > 1) {
            System.out.format("EMPATE %d%n", partidosNoJugados);
        } else {
            System.out.format("%s %d%n", ganador, partidosNoJugados);
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER109().run();
    }
}
