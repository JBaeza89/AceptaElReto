/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer159;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER159 {

    Scanner in;
    
    
    
    public boolean caso() {
        String[] reloj = in.next().split(":");
        String[] horaFinal = in.next().split(":");        
        int digito = in.nextInt();
        if (reloj[0].equals("24")) {
            return false;
        }
        int hora = Integer.parseInt(reloj[0]);
        int minuto = Integer.parseInt(reloj[1]);
        int horaF = Integer.parseInt(horaFinal[0]);
        int minutoF = Integer.parseInt(horaFinal[1]);
        int contador = 0;
        while (hora <= horaF && !(hora == horaF && minuto > minutoF)) {
            if (hora % 10 == digito || hora / 10 == digito ||
                    minuto % 10 == digito || minuto / 10 == digito) {
                contador++;
            }
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
        }
        System.out.println(contador);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER159().run();
    }
    
}
