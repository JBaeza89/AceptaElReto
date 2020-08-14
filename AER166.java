/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer166;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER166 {

    Scanner in;
    
    public boolean caso() {
        int canalInicio = in.nextInt();
        int canalFinal = in.nextInt();
        if (canalInicio == 0) {
            return false;
        }
        int diferencia = Math.abs(canalFinal - canalInicio);
        System.out.println(Math.min(diferencia, 99 - diferencia));
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER166().run();
    }
    
}
