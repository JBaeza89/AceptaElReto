/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer245;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER245 {

    Scanner in;
    
    public boolean caso() {
        int personas = in.nextInt();
        if (personas == 0) {
            return false;
        }
        boolean mayor = true;
        boolean menor = true;
        long anterior = in.nextLong();
        for (int i = 1; i < personas; i++) {
            long actual = in.nextLong();
            if (actual >= anterior) {
                menor = false;
            }
            if (actual <= anterior) {
                mayor = false;
            }
            if (!(mayor || menor)) {
                in.nextLine();
                break;
            }
            anterior = actual;
        }
        if (mayor || menor) {
            System.out.println("DALTON");
        } else {
            System.out.println("DESCONOCIDOS");
        }
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER245().run();
    }
    
}
