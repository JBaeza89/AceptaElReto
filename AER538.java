/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer538;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER538 {

    Scanner in;
    
    public boolean caso() {
        int edad = in.nextInt();
        int iglesia = in.nextInt();
        if (edad == 0 && iglesia == 0) {
            return false;
        }
        System.out.println(iglesia > edad? "SENIL" : "CUERDO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    public static void main(String[] args) {
        new AER538().run();
    }
    
}
