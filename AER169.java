/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer169;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER169 {

    Scanner in;
    
    public void caso() {
        Map<String, Integer> apellidos = new HashMap<>();
        String apellido;
        int hermanos = 0;
        int corredores = 0;
        do {
            apellido = in.next().toLowerCase();
            if (!apellido.equals("====")) {
                corredores++;
                in.next();
                if (apellidos.containsKey(apellido)) {
                    int valor = apellidos.get(apellido);
                    if (valor == 1) {
                        hermanos++;
                    }
                    apellidos.put(apellido, valor + 1);
                    hermanos++;
                } else {
                    apellidos.put(apellido, 1);
                }
            }
        } while (!apellido.equals("===="));
        
        
        
        System.out.format("%d %d%n", corredores,hermanos);
    }
    
    public void run() {
        in = new Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            caso();
        }
    }
    public static void main(String[] args) {
        new AER169().run();
    }
    
}
