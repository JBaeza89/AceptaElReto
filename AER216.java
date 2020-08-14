/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer216;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER216 {

    Scanner in;
    
    public void caso() {
        int capacidadCubo = in.nextInt();
        int horas = capacidadCubo / 3600;
        int minutos = capacidadCubo % 3600 / 60;
        int segundos = capacidadCubo % 60;
        
        System.out.format("%02d:%02d:%02d%n", horas, minutos, segundos);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER216().run();
    }
    
}
