/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer540;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER540 {

    Scanner in;
    
    public void caso() {
        int piso = in.nextInt();
        int escalonesPorPiso = in.nextInt();
        int pisoCaida = in.nextInt();
        int escalonesSubidos = in.nextInt();
        int bajada = pisoCaida * escalonesPorPiso + escalonesSubidos;
        int subida = piso * escalonesPorPiso + bajada;
        System.out.println(bajada + " " + subida);
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER540().run();
    }
    
}
