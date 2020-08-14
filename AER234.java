/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer234;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER234 {

    Scanner in;
    
    public void caso() {
        int numeroPilas = in.nextInt();
        int voltajeNecesario = in.nextInt();
        Queue<Integer> listaMenor = new PriorityQueue<>();
        Queue<Integer> listaMayor = new PriorityQueue<>(100000, Collections.reverseOrder());
        for (int i = 0; i < numeroPilas; i++) {
            int pila = in.nextInt();
            listaMenor.add(pila);
            listaMayor.add(pila);
        }
        int contador = 0;
        int controlMenor = 0;
        int controlMayor = listaMayor.size() - 1;
        while (controlMayor > controlMenor) {
            if (listaMayor.element() + listaMenor.element() >= voltajeNecesario) {
                contador++;
                listaMayor.remove();
                controlMayor--;
            }
            listaMenor.remove();
            controlMenor++;
            
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
        new AER234().run();
    }
    
}
