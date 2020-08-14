/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer214;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER214 {

    Scanner in;
    
    public boolean caso() {
        int numeroReyes = in.nextInt();
        if (numeroReyes == 0) {
            return false;
        }
        Map<String, Integer> reyes = new HashMap<>();
        for (int i = 0; i < numeroReyes; i++) {
            String rey = in.next();
            if (reyes.containsKey(rey)) {
                reyes.put(rey, reyes.get(rey) + 1);
            } else {
                reyes.put(rey, 1);
            }
        }
        int herederos =  in.nextInt();
        for (int i = 0; i < herederos; i++) {
            String rey = in.next();
            if (reyes.containsKey(rey)) {
                reyes.put(rey, reyes.get(rey) + 1);                
            } else {
                reyes.put(rey, 1);
            }
            System.out.println(reyes.get(rey));
        }
        System.out.println();
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER214().run();
    }
    
}
