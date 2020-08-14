/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer213;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER213 {

    Scanner in;
    
    public boolean caso() {
        int temporada = in.nextInt();
        int periodo = in.nextInt();
        int dias = in.nextInt();
        if (temporada == 0 && periodo == 0 && dias == 0) {
            return false;
        }
        int periodosPorTemporada = temporada / periodo;
        int diasRestantes = temporada % periodo;
        int diasAprovechados = (dias * periodosPorTemporada) + Math.min(dias, diasRestantes);
        System.out.println(diasAprovechados);
        
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    
    public static void main(String[] args) {
        new AER213().run();
    }
    
}
