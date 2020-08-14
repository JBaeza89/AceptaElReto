/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer153;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER153 {

    Scanner in;
    
    public void caso() {
        String[] reloj = in.next().split(":");
        int minutos = (60 - Integer.parseInt(reloj[1])) % 60;
        int horas;
        horas = minutos == 0 ? 12 - Integer.parseInt(reloj[0]) : 12 - (Integer.parseInt(reloj[0])+ 1);
        if (horas <= 0) {
            horas += 12;
        }
        System.out.format("%02d:%02d%n", horas, minutos);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER153().run();    }
    
}
