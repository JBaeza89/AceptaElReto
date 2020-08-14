package aer524;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER524 {

    Scanner in;
    
    class Compra implements Comparable<Compra> {
        int compe;
        int tencia;
        int diferencia;

        public Compra(int compe, int tencia) {
            this.compe = compe;
            this.tencia = tencia;
            diferencia = compe - tencia;
        }

        @Override
        public int compareTo(Compra c) {
            if (diferencia < c.diferencia) {
                return -1;
            } else {
                return 1;
            }
        }
        
        
    }
    
    public boolean caso() {
        int compras = in.nextInt();
        if (compras == 0) {
            return false;
        }
        int compe = in.nextInt();
        int tencia = in.nextInt();
        int[] ap = new int[compras];
        for (int i = 0; i < compras; i++) {
            ap[i] = in.nextInt();
        }
        PriorityQueue<Compra> cola = new PriorityQueue<>();
        for (int i = 0; i < compras; i++) {
            cola.add(new Compra(ap[i], in.nextInt()));
        }
        int suma = 0;
        for (int i = 0; i < compe; i++) {
            suma+= cola.remove().compe;
        }
        for (int i = 0; i < compras - compe - tencia; i++) {
            Compra c = cola.remove();
            suma += Math.min(c.compe, c.tencia);
        }
        for (int i = 0; i < tencia; i++) {
            suma+= cola.remove().tencia;
        }
        System.out.println(suma);
        
        return true;
    }
    
    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }
    public static void main(String[] args) {
        new AER524().run();
    }
    
}
