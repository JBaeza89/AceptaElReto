/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer157;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER157 {

    Scanner in;
    
    public void caso() {
        int dia = in.nextInt();
        int mes = in.nextInt();
        int[] diasPorMes = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDias = diasPorMes[mes - 1] - dia;
        for (int i = mes; i < 12; i++) {
            totalDias += diasPorMes[i];
        }
        System.out.println(totalDias);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
        
    }
    public static void main(String[] args) {
        new AER157().run();
    }
    
}
