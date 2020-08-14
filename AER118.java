/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer118;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER118 {

    Scanner in;

    public boolean caso() {
        int pilar = in.nextInt();
        int marco = in.nextInt();
        int pedro = in.nextInt();
        if (pilar < 0) {
            return false;
        }
        int min = Math.min(marco, pilar);
        int max = Math.max(marco, pilar);
        if ((pilar == marco && marco == pedro) || (pedro > min && pedro < max)) {
            System.out.println(0);
            return true;
        }
        if (pedro >= max) {
            if (Math.abs(pedro - 21.3) > Math.abs(min - 21.3)) {
                System.out.println("I");
            } else {
                int valor = 3 * (pedro + min) / 2;
                valor++;
                System.out.println(valor);
            }
        } else {
            if (Math.abs(pedro - 42.6) > Math.abs(max - 42.6)) {
                System.out.println("I");
            } else {
                int valor = (3 * (pedro + max) / 2) - 128;
                if ((pedro + max) % 2 == 0) {
                    valor--;
                }
                System.out.println(valor);
            }
        }
        return true;

    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER118().run();
    }

}
