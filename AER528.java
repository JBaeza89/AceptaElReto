/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer528;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER528 {

    Scanner in;

    public boolean caso() {
        int numeros = in.nextInt();
        if (numeros == 0) {
            return false;
        }
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i < numeros; i++) {
            double n = in.nextDouble();
            if (n > 1) {
                mayores++;
            } else if(n > 0 && n < 1) {
                menores++;
            }
        }
        long total = ((long)numeros * (numeros - 1) / 2) - ((long)mayores * menores);
        System.out.println(total);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        in.useLocale(Locale.ROOT);
        while (caso());
    }

    public static void main(String[] args) {
        new AER528().run();
    }

}
