/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer244;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER244 {

    Scanner in;
    
    public boolean caso() {
        int dimensionesTablero = in.nextInt();
        int reinas = in.nextInt();
        if (dimensionesTablero == 0 && reinas == 0) {
            return false;
        }
        int [][] posicionReinas = new int[reinas][2];
        boolean atacadas = false;
        for (int i = 0; i < reinas; i++) {
            posicionReinas[i][0] = in.nextInt();
            posicionReinas[i][1] = in.nextInt();
            for (int j = i - 1; j >= 0; j--) {
                if (atacadas) {
                    break;
                }
                if (posicionReinas[i][0] == posicionReinas[j][0] ||
                        posicionReinas[i][1] == posicionReinas[j][1] || 
                        Math.abs(posicionReinas[i][0] - posicionReinas[j][0]) == 
                        Math.abs(posicionReinas[i][1] - posicionReinas[j][1])) {
                    atacadas = true;
                }
            }
            if (atacadas) {
                in.nextLine();
                break;
            }
        }
        System.out.println(atacadas? "SI" : "NO");
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER244().run();
    }
    
}
