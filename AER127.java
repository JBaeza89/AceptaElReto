/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer127;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER127 {

    Scanner in;
    
    public void caso() {
        List<String> nombres = new LinkedList<>();
        while (true) {
            String nombre = in.next();
            if (nombre.equals("F")) {
                break;
            }
            nombres.add(nombre);
        }
        int camas = in.nextInt();
        int cancion = in.nextInt();
        if (camas == 0) {
            System.out.println("NADIE TIENE CAMA");
        } else if (camas >= nombres.size()) {
            System.out.println("TODOS TIENEN CAMA");
        } else {
            int indice = -1;
            int nPeregrinos = nombres.size();
            for (int i = 0; i < nPeregrinos - camas; i++) {
                indice = (indice + cancion) % nombres.size();
                nombres.remove(indice);
                indice--;
            }
            System.out.print(nombres.get(0));
            for (int i = 1; i < nombres.size(); i++) {
                System.out.print(" " + nombres.get(i));
            }
            System.out.println();
        }
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER127().run();
    }
    
}
