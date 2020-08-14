/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer142;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER142 {

    Scanner in;
    
    public boolean caso() {
        int nNinos = in.nextInt();
        int saltos = in.nextInt();
        if (nNinos == 0 && saltos == 0) {
            return false;
        }
        List<Integer> ninos = new LinkedList<>();
        for (int i = 1; i <= nNinos; i++) {
            ninos.add(i);
        }
        int indice = 0;
        while (ninos.size() > 1) {
            indice = (indice + saltos) % ninos.size();
            ninos.remove(indice);
        }
        System.out.println(ninos.get(0));
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER142().run();
    }
    
}
