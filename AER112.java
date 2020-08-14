/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer112;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER112 {

    Scanner in;
    
    public boolean caso() {
        int distancia = in.nextInt();
        int velKmH = in.nextInt();
        int tiempo = in.nextInt();
        if (distancia == 0 && velKmH == 0 && tiempo == 0) {
            return false;
        }
        if (distancia <= 0 || velKmH <= 0 || tiempo <= 0) {
            System.out.println("ERROR");
            return true;
        }
        double velocidad = (double)velKmH * 1000 / 3600;
        double tiempoLimite = distancia / velocidad;
        double tiempoLimitePuntos = tiempoLimite / 1.2;
        if (tiempo <= tiempoLimitePuntos) { //dar la vuelta
            System.out.println("PUNTOS");
        } else if (tiempo < tiempoLimite) {
            System.out.println("MULTA");
        } else {
            System.out.println("OK");
        }
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER112().run();
    }
    
}
