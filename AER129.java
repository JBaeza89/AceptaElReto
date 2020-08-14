/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer129;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER129 {

    Scanner in;
    
    public int cambiosPorCifra(int entrada, int salida) {
        int cantidadCambios = 0;
        int[][] cifraEnSegmentos = new int [][] {
            {1, 1, 1, 0, 1, 1, 1},
            {0, 0, 1, 0, 0, 1, 0},
            {1, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 1, 0, 1, 1},
            {0, 1, 1, 1, 0, 1, 0},
            {1, 1, 0, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 1, 0},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0},
        };
        
        for (int i = 0; i < 7; i++){
            if (cifraEnSegmentos[entrada][i] - cifraEnSegmentos[salida][i] != 0){
                cantidadCambios ++;
            }
        }
        return cantidadCambios;
    }
        
    public boolean caso() {
        int entrada = in.nextInt();
        if (entrada == -1) {
            return false;
        }
        int contadorCifras = 0;
        int salida;
        int cantidadCambiosTotal = 0;
        int acumulacionCambios = 0;
        while (entrada != -1) {
             if (contadorCifras == 0) {                
                salida = 10;
            } else {
                salida = entrada;
                entrada = in.nextInt();
            }
            if (entrada != -1) {
                contadorCifras ++;
                acumulacionCambios += cambiosPorCifra(entrada, salida);                
            } else {
                cantidadCambiosTotal = (cambiosPorCifra(10, salida) + acumulacionCambios) * 
                        contadorCifras;
            }      
        }
        System.out.println(cantidadCambiosTotal);
        
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER129().run();
    }
    
}
