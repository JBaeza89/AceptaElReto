/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer543;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER543 {

    Scanner in;
    
     class Sombrilla {
        int x;
        int y;
        int radio;
        

        public Sombrilla(int x, int y, int radio) {
            this.x = x;
            this.y = y;
            this.radio = radio;
        }
        
        public boolean seSolapan (Sombrilla s) {
            double distancia = Math.sqrt(Math.abs(this.x - s.x) * Math.abs(this.x - s.x) + 
                    Math.abs(this.y - s.y) * Math.abs(this.y - s.y));
            return distancia < this.radio + s.radio;
        }
        
    }
    
    public void caso() {
        int numeroSombrillas = in.nextInt();
        if (numeroSombrillas == 0) {
            System.out.println(0);
            return;
        }
        Sombrilla[] sombrillas = new Sombrilla[numeroSombrillas];
        sombrillas[0] = new Sombrilla(in.nextInt(), in.nextInt(), in.nextInt());
        int contador = 0;
        for (int i = 1; i < numeroSombrillas; i++) {
            sombrillas[i] = new Sombrilla(in.nextInt(), in.nextInt(), in.nextInt());
            for (int j = 0; j < i; j++) {
                if (sombrillas[i].seSolapan(sombrillas[j]) || sombrillas[j].seSolapan(sombrillas[i])) {
                    
                    contador++;
                }
            }
        }
        System.out.println(contador);
        
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER543().run();
    }
    
}
