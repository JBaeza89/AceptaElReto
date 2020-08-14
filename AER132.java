/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer132;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jorge
 */
public class AER132 {

    BufferedReader in;
    
    
    public boolean caso() throws IOException {
        char[] texto = in.readLine().toCharArray();
        int intervalos = Integer.parseInt(in.readLine());
        if (intervalos == 0) {
            return false;
        }
        int[] cambios = new int[texto.length];
        int contador = 0;
        for (int i = 1; i < texto.length; i++) {
            if (texto[i] != texto[i - 1]) {
                contador++;
            }
            cambios[i] = contador;
        }
        
        for (int i = 0; i < intervalos; i++) {
            String[] s = in.readLine().split(" ");
            int inicio = Integer.parseInt(s[0]);
            int fin = Integer.parseInt(s[1]);       
            
            System.out.println(cambios[inicio] == cambios[fin]? "SI" : "NO");
        }
        System.out.println();
        
        return true;
    }
    
    public void run() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        while(caso());
    }
    public static void main(String[] args) throws IOException {
        new AER132().run();
    }
    
}
