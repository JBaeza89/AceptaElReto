/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer345;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class AER345 {

    Scanner in;

    public void rellenarSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = in.nextInt();
            }
        }
    }
    
    public boolean comprobarFilasYColumnas(int[][] sudoku) {
        Set<Integer> comprobarFilas;
        Set<Integer> comprobarColumnas;
        for (int i = 0; i < 9; i++) {
            comprobarFilas = new HashSet<Integer>();
            comprobarColumnas = new HashSet<Integer>();
            for (int j = 0; j < 9; j++) {
                if (comprobarFilas.contains(sudoku[i][j]) || comprobarColumnas.contains(sudoku[j][i])) {
                    return false;
                }
                comprobarFilas.add(sudoku[i][j]);
                comprobarColumnas.add(sudoku[j][i]);
            }
        }
        return true;
    }
    
    public boolean comprobarSecciones(int[][] sudoku) {
        Set<Integer> comprobarSeccion;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                comprobarSeccion = new HashSet<Integer>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int fila = i * 3 + k;
                        int columna = j * 3 + l;
                        if (comprobarSeccion.contains(sudoku[fila][columna])) {
                            return false;
                        }
                        comprobarSeccion.add(sudoku[fila][columna]);
                        
                    }
                }
            }
        }
        return true;
    }

    public void caso() {
        int[][] sudoku = new int[9][9];
        rellenarSudoku(sudoku);
        boolean correcto = comprobarFilasYColumnas(sudoku)&& comprobarSecciones(sudoku);
        System.out.println(correcto? "SI" : "NO");

    }

    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER345().run();
    }

}
