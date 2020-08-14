/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer144;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER144 {

    Scanner in;
    
    public void caso() {
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder("");
        int indice = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            switch (x) {
                case '-':
                    indice = 0;
                    break;
                case '+':
                    indice = sb.length();
                    break;
                case '*':
                    if (indice < sb.length()) {
                        indice ++;
                    }   break;
                case '3':
                    if (indice < sb.length()) {
                        sb.deleteCharAt(indice);
                    }   break;
                default:
                    sb.insert(indice, x);
                    indice++;
                    break;
            }
            
        }        
        System.out.println(sb);        
    }
    
    public void run() {
        in = new Scanner(System.in);
        while(in.hasNextLine()) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER144().run();
    }
    
}
