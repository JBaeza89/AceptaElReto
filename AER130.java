/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer130;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER130 {

    Scanner in;
    
    public boolean caso() {
        int n = in.nextInt();
        if (n == 0) {
            return false;
        }
        long x1 = in.nextLong();
        long y1 = in.nextLong();
        long x2 = in.nextLong();
        long y2 = in.nextLong();
        long suma = x1 + y1 + x2 + y2;
        if (suma % 2 != 0) {
            System.out.println("IMPOSIBLE");
        } else if (x1 == x2 && y1 == y2) {
             System.out.println("0");          
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {        
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        
        return true;        
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(caso());
    }
    
    public static void main(String[] args) {
        new AER130().run();
    }
    
}
