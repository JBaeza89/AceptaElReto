/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer533;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER533 {

    Scanner in;
    
    public void caso() {
        int kg = in.nextInt() * 8;
        int reciclaje = in.nextInt();
        
        int persona = 1;
        boolean ganador = false;
        while (reciclaje != 0) {
            kg -= reciclaje;
            if (kg <= 0 && !ganador) {
                ganador = true;
                System.out.println(persona);
            }
            persona++;
            reciclaje =in.nextInt();
        }
        if (kg > 0) {
            System.out.println("SIGAMOS RECICLANDO");
        }
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER533().run();
    }
    
}
