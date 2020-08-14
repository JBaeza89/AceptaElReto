/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer196;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER196 {

    Scanner in;
    
    public void caso() {
        in.nextLine();
        char[][] sudoku = new char[9][];
        for (int i = 0; i < 9; i++) {
            sudoku[i] = in.nextLine().toCharArray();
        }
        boolean sudokuValido = true;
        int contadorDigitos = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '-') {
                    if (sudoku[8 - i][8 - j] != '-') {
                        sudokuValido = false;
                        break;
                    }
                } else {
                    contadorDigitos++;
                }
            }
        }
        sudokuValido = sudokuValido && contadorDigitos <= 32;
        System.out.println(sudokuValido? "SI" : "NO");
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = Integer.parseInt(in.nextLine());
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER196().run();
    }
    
}
