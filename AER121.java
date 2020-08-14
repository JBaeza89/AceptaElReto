/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer121;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER121 {

    Scanner in;
    
    public boolean caso() {
        int envoltoriosNecesarios = in.nextInt();
        int regalo = in.nextInt();
        int chicles = in.nextInt();
        if(envoltoriosNecesarios == 0 && regalo == 0 && chicles == 0) {
            return false;
        }
        if (regalo >= envoltoriosNecesarios && chicles >= envoltoriosNecesarios) {
            System.out.println("RUINA");
            return true;
        }
        if (regalo == 0) {
            System.out.println(chicles + " " + chicles);
            return true;
        }
        int chiclesApoyo = chicles;
        while (chicles >= envoltoriosNecesarios) {
            int intercambio = chicles / envoltoriosNecesarios;
            chiclesApoyo += intercambio * regalo;
            chicles = intercambio * regalo + chicles % envoltoriosNecesarios;
        }
        System.out.println(chiclesApoyo + " " + chicles);
        
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    
    public static void main(String[] args) {
        new AER121().run();
    }
    
}
