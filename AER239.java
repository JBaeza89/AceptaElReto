/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer239;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER239 {

    Scanner in;
    
    public boolean caso() {
        int diasEntrada = in.nextInt();
        int emisoras = in.nextInt();
        if (diasEntrada == 0 && emisoras == 0) {
            return false;
        }
        int segundosTotales = diasEntrada * 24 * 6 * emisoras;
        int dias = segundosTotales /(24 * 3600);
        int horas = (segundosTotales %(24 * 3600)) / 3600;
        int minutos = ((segundosTotales %(24 * 3600)) % 3600) / 60;
        int segundos = ((segundosTotales %(24 * 3600)) % 3600) % 60;
        System.out.format("%d:%02d:%02d:%02d%n", dias, horas, minutos, segundos);
        return true;
    }
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER239().run();
    }
    
}
