/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer137;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER137 {

    Scanner in;
    
    public boolean existeBarco(int tamanno, int[] tamannos) {
        for (int i = 0; i < tamannos.length; i++) {
            if (tamanno == tamannos[i]) {
                tamannos[i] = 0;
                return true;
            }
        }
        return false;
    }
    
    public int procesarBarcoVertical(String[][] tablero, int tamanno, int i, int j) {
        tamanno++;
        tablero[i][j] = "p";
        try {
            if (tablero[i + 1][j].equals("1")) {                
                tamanno = procesarBarcoVertical(tablero, tamanno, i + 1, j);
            }
        } catch (Exception ex){}
        return tamanno;
    }
    
    public int procesarBarcoHorizontal(String[][] tablero, int tamanno, int i, int j) {
        tamanno++;
        tablero[i][j] = "p";
        try {
            if (tablero[i][j + 1].equals("1")) {                
                tamanno = procesarBarcoHorizontal(tablero, tamanno, i, j + 1);
            }
        } catch (Exception ex){}
        return tamanno;
    }
    
    public int obtenerTamannoBarco(String[][] tablero, int i, int j) {
        int tamanno = 1;
        
        tablero[i][j] = "p";
        try {
            if (tablero[i + 1][j].equals("1")) {                
                tamanno = procesarBarcoVertical(tablero, tamanno, i + 1, j);
            }
        } catch (Exception ex){}
        try {
            if (tablero[i][j + 1].equals("1")) {                
                tamanno = procesarBarcoHorizontal(tablero, tamanno, i, j + 1);
            }
        } catch (Exception ex){}
        
        return tamanno;
    }

    public int[] encontrarBarco(String[][] tablero) {
        int[] posicionBarco = new int[]{-1, -1};
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j].equals("1")) {
                    posicionBarco[0] = i;
                    posicionBarco[1] = j;
                    return posicionBarco;
                }
            }
        }
        return posicionBarco;
    }   
    

    public boolean caso() {
        int barcos = in.nextInt();
        if (barcos == 0) {
            return false;
        }
        int[] tamannos = new int[barcos];
        for (int i = 0; i < barcos; i++) {
            tamannos[i] = in.nextInt();
        }
        int dimensiones = in.nextInt();
        boolean correcto = true;
        String[][] tablero = new String[dimensiones][dimensiones];
        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                tablero[i][j] = in.next();
                if (tablero[i][j].equals("1")) {
                    try {
                        if (tablero[i - 1][j - 1].equals("1")) {
                            correcto = false;
                        }
                    } catch (Exception ex) {
                    }
                    try {
                        if (tablero[i - 1][j + 1].equals("1")) {
                            correcto = false;
                        }
                    } catch (Exception ex) {
                    }
                }
            }
        }
        if (correcto) {
            
            for (int i = 0; i < barcos; i++) {
                int[] posicion = encontrarBarco(tablero);

                correcto = posicion[0] != -1;
                if (correcto) {
                    int tamanno = obtenerTamannoBarco(tablero, posicion[0], posicion[1]);
                    correcto = existeBarco(tamanno, tamannos);
                }
                if (!correcto) {
                    break;
                }
            }
            int[] posicion = encontrarBarco(tablero);

                correcto = correcto && posicion[0] == -1;          
            
        }
        System.out.println(correcto? "SI" : "NO");
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER137().run();
    }

}
