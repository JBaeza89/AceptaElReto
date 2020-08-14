/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer398;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER398 {

    Scanner in;
    int totalBotones;
    int[][] botones;
    Map<Clave, Integer> valores;

    class Clave {

        int k1;
        int k2;
        int k3;

        public Clave(int k1, int k2, int k3) {
            this.k1 = k1;
            this.k2 = k2;
            this.k3 = k3;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Clave)) {
                return false;
            }
            Clave key = (Clave) o;
            return k1 == key.k1 && k2 == key.k2 && k3 == key.k3;
        }

        @Override
        public int hashCode() {
            return Integer.toString(k1).hashCode() + Integer.toString(k2).hashCode() + 
                   Integer.toString(k3).hashCode();
        }

    }

    public int movimiento(int actual, int siguiente) {
        return Math.abs(botones[actual][0] - botones[siguiente][0])
                + Math.abs(botones[actual][1] - botones[siguiente][1]);
    }

    public int recorrerCamino(int avanza, int espera, int tiempo) {
        if (avanza == totalBotones + 1) {
            return Math.max(tiempo, movimiento(espera, avanza));
        }
        Clave clave = new Clave(avanza, espera, tiempo);
        if (valores.containsKey(clave)) {
            return valores.get(clave);
        }

        int tiempoEspera = Math.max(movimiento(espera, avanza + 1) - tiempo, 0);
        int valor = Math.min(recorrerCamino(avanza + 1, espera, tiempo
                + movimiento(avanza, avanza + 1)),
                tiempo + recorrerCamino(avanza + 1, avanza, tiempoEspera));
        valores.put(clave, valor);
        return valores.get(clave);

    }

    public void caso() {
        int filas = in.nextInt();
        int columnas = in.nextInt();
        totalBotones = in.nextInt();
        if (totalBotones == 0) {
            System.out.println(filas + columnas - 1);
        } else {
            botones = new int[totalBotones + 2][2];
            botones[0][0] = 1;
            botones[1][1] = 1;
            botones[totalBotones + 1][0] = filas;
            botones[totalBotones + 1][1] = columnas;
            valores = new HashMap<Clave, Integer>();
            for (int i = 1; i <= totalBotones; i++) {
                botones[i][0] = in.nextInt();
                botones[i][1] = in.nextInt();
            }
            System.out.println(recorrerCamino(1, 0, movimiento(0, 1)));

        }

    }

    public void run() {
        in = new Scanner(System.in);
        while (in.hasNext()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER398().run();
    }

}
