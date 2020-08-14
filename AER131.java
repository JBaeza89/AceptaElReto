/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer131;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER131 {

    Scanner in;
    
    public boolean caso() {
        int piscina1 = in.nextInt();
        int barreno1 = in.nextInt();
        int ltPerdidos1 = in.nextInt();
        int piscina2 = in.nextInt();
        int barreno2 = in.nextInt();
        int ltPerdidos2 = in.nextInt();
        if (piscina1 == 0 || piscina2 == 0) {
            return false;
        }
        
        int viajesYo = 0;        
        int viajesVecino = 0;
        
        if (barreno1 >= piscina1) {
            viajesYo ++;
        } else if (barreno1 > ltPerdidos1) {
            
            do {
                viajesYo += piscina1 / barreno1;
                piscina1 = piscina1 % barreno1 + ltPerdidos1 * (piscina1 / barreno1);
            } while(piscina1 > barreno1);
            if (piscina1 > 0) {
                viajesYo ++;
            }
        } else {
            viajesYo = -1;
        }
        if (barreno2 >= piscina2) {
            viajesVecino ++;
        } else if (barreno2 > ltPerdidos2) {
            do {
                viajesVecino += piscina2 / barreno2;
                piscina2 = piscina2 % barreno2 + ltPerdidos2 * (piscina2 / barreno2);
            } while(piscina2 > barreno2);
            if (piscina2 > 0) {
                viajesVecino ++;
            }
        } else {
            viajesVecino = -1;
        }
        if (viajesYo < 0) {
            viajesYo = viajesVecino + 1;
        } else if (viajesVecino < 0) {
            viajesVecino = viajesYo + 1;
        }
        
        if (viajesYo == viajesVecino) {
            System.out.format("EMPATE %d%n", viajesYo);
        } else if (viajesYo < viajesVecino) {
            System.out.format("YO %d%n", viajesYo);            
        } else {
            System.out.format("VECINO %d%n", viajesVecino);
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER131().run();
    }
    
}
