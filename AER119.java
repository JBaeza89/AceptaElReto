/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer119;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER119 {

    Scanner in;
    
    public boolean caso() {
        int legionarios = in.nextInt();
        if (legionarios == 0) {
            return false;
        }
        int escudos = 0;
        while (legionarios > 0) {
            int formacion = (int)Math.sqrt(legionarios);
            int externos = 4 * (formacion - 1);
            formacion = formacion * formacion;
            escudos += formacion + externos + 4;
            legionarios -= formacion;
        }
        System.out.println(escudos);
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER119().run();
    }
    
}
