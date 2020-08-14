/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author jorge
 */
public class AER254 {

    BufferedReader in;
    
    public int[] parsearEntrada(int n) throws IOException {
        
        int[] salida = new int[n];
        for (int i = 0; i < n - 1; i++) {            
            while (true) {                
                char x = (char) in.read();
                if (x == ' ') {
                    break;
                }
                salida[i] = salida[i] * 10 + (x - '0');
            }
            
        }
        salida[n - 1] = Integer.parseInt(in.readLine());
        return salida;
    }
    
    public boolean caso() throws IOException {
        int n = Integer.parseInt(in.readLine());
        if (n == 0) {
            return false;
        }
        
        int[] esquiadores = parsearEntrada(n);
        int[] esquis = parsearEntrada(n);        
        
        Arrays.sort(esquiadores);
        Arrays.sort(esquis);
        int diferencias = 0;
        for (int i = 0; i < n; i++) {
            diferencias += Math.abs(esquiadores[i] - esquis[i]);
        }
        System.out.println(diferencias);
        return true;
    }
    
    public void run() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));;
        while (caso());
    }
    
    public static void main(String[] args) throws IOException {
        new AER254().run();
    }
    
}
