/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer172;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER172 {

    Scanner in;
    
    public boolean caso() {
        int sillas = in.nextInt();
        if (sillas == 0) {
            return false;
        }
        String mesa = in.next();
        boolean derecha = false;
        boolean izquierda = false;
        for (int i = 0; i < mesa.length(); i++) {
            char x = mesa.charAt(i);
            if (x == 'D') {
                derecha = true;
            } else if (x == 'I') {
                izquierda = true;
            }
            if (derecha && izquierda) {
                break;
            }
        }
        System.out.println(izquierda && derecha? "ALGUNO NO COME" : "TODOS COMEN");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());        
    }
    public static void main(String[] args) {
        new AER172().run();
    }
    
}
