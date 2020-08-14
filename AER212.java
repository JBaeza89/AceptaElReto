/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer212;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER212 {

    Scanner in;
    
    public boolean caso() {
        int calles = in.nextInt();
        if (calles == 0) {
            return false;
        }
        int intersecciones = in.nextInt();
        int[] pasosPorInterseccion = new int[intersecciones];
        for (int i = 0; i < calles; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            pasosPorInterseccion[a - 1]++;
            pasosPorInterseccion[b - 1]++;
        }
        int contadorImpares = 0;
        for (int i = 0; i < pasosPorInterseccion.length; i++) {
            if (pasosPorInterseccion[i] % 2 != 0) {
                contadorImpares++;
            }
        }
        System.out.println(contadorImpares < 3? "SI" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER212().run();
    }
    
}
