/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer243;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER243 {

    Scanner in;

    public boolean caso() {
        int unidades = in.nextInt();
        if (unidades == 0) {
            return false;
        }
        int contador = 0;
        for (int i = 1; i <= Math.sqrt(unidades); i++) {
            if (unidades % i == 0) {
                if (unidades / i == i) {
                    contador++;
                } else {
                    contador += 2;
                }
            }
        }
        System.out.println(contador);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER243().run();
    }

}
