/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer539;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER539 {

    Scanner in;
    
    public void caso() {
        int inicio = in.nextInt() % 10;
        int anno = in.nextInt() % 10;
        boolean bueno = inicio - anno == 1 || anno - inicio == 9;
        System.out.println(bueno? "FELIZ DECADA NUEVA" : "TOCA ESPERAR");
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(in.hasNext()) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER539().run();
    }
    
}
