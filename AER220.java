/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer220;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER220 {

    Scanner in;
    boolean[][] resultados;

    public boolean calcular(int acumulado, int boton) {
        
        if (acumulado >= 31 || resultados[acumulado][boton]) {
            return true;
        }
        
        switch (boton) {
            case 1:
                resultados[acumulado][boton] = !calcular(acumulado + 2, 2) || !calcular(acumulado + 3, 3)
                        || !calcular(acumulado + 4, 4) || !calcular(acumulado + 7, 7);
                break;
            case 2:
                resultados[acumulado][boton] = !calcular(acumulado + 1, 1) || !calcular(acumulado + 3, 3)
                        || !calcular(acumulado + 5, 5) || !calcular(acumulado + 8, 8);
                break;
            case 3:
                resultados[acumulado][boton] = !calcular(acumulado + 1, 1) || !calcular(acumulado + 2, 2)
                        || !calcular(acumulado + 6, 6) || !calcular(acumulado + 9, 9);
                break;
            case 4:
                resultados[acumulado][boton] = !calcular(acumulado + 1, 1) || !calcular(acumulado + 5, 5)
                        || !calcular(acumulado + 6, 6) || !calcular(acumulado + 7, 7);
                break;
            case 5:
                resultados[acumulado][boton] = !calcular(acumulado + 2, 2) || !calcular(acumulado + 4, 4)
                        || !calcular(acumulado + 6, 6) || !calcular(acumulado + 8, 8);
                break;
            case 6:
                resultados[acumulado][boton] = !calcular(acumulado + 3, 3) || !calcular(acumulado + 4, 4)
                        || !calcular(acumulado + 5, 5) || !calcular(acumulado + 9, 9);
                break;
            case 7:
                resultados[acumulado][boton] = !calcular(acumulado + 1, 1) || !calcular(acumulado + 4, 4)
                        || !calcular(acumulado + 8, 8) || !calcular(acumulado + 9, 9);
                break;
            case 8:
                resultados[acumulado][boton] = !calcular(acumulado + 2, 2) || !calcular(acumulado + 5, 5)
                        || !calcular(acumulado + 7, 7) || !calcular(acumulado + 9, 9);
                break;
            default:
                resultados[acumulado][boton] = !calcular(acumulado + 3, 3) || !calcular(acumulado + 6, 6)
                        || !calcular(acumulado + 7, 7) || !calcular(acumulado + 8, 8);
                break;
        }       
        return resultados[acumulado][boton];
    }

    public void caso() {
        int acumulado = in.nextInt();
        int boton = in.nextInt();
        System.out.println(calcular(acumulado, boton) ? "GANA" : "PIERDE");
    }

    public void run() {
        in = new Scanner(System.in);
        resultados = new boolean[32][10];
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER220().run();
    }

}
