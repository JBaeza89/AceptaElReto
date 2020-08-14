/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer542;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER542 {

    Scanner in;
    
    public void caso() {
        int[] juguete = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
        int[] caja = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.sort(juguete);
        Arrays.sort(caja);
        boolean correcto = true;
        for (int i = 0; i < 3; i++) {
            if (juguete[i] >= caja[i]) {
                correcto = false;
            }
        }
        System.out.println(correcto? "SIRVE" : "NO SIRVE");
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER542().run();
    }
    
}
