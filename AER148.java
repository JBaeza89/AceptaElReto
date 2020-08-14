/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer148;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER148 {

    Scanner in;
    
    public boolean caso() {
        String[] hora = in.next().split(":");
        if (hora[0].equals("00") && hora[1].equals("00")) {
            return false;
        }
        int minutos = 60 - Integer.parseInt(hora[1]);
        int horas = minutos == 0? 24 - Integer.parseInt(hora[0]) : 23 - Integer.parseInt(hora[0]);
        minutos += 60 * horas;
        System.out.println(minutos);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER148().run();
    }
    
}
