/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer327;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER327 {

    Scanner in;
    final int maximo = 1000000000;
    Map<Integer, Integer> resultados;
    int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23};
    
    public void recursion (int d, long v, int exp, int indice) {
        if (indice == primos.length) {
            return;
        }
        for (int i = 0; i <= exp; i++) {
            long  valor= v * (long)Math.pow(primos[indice], i);
            int divisores = (i + 1) * d;
            if (valor > maximo) {
                break;
            }
            if (resultados.containsKey(divisores)) {
                resultados.put(divisores, Math.min(resultados.get(divisores), (int)valor));
            } else {
                resultados.put(divisores, (int)valor);
            }
            recursion(divisores, valor, i, indice + 1);
        }
    }

    public void rellenarResultados() {
        
        resultados = new HashMap<>();
        for (int i = 0; i < 32; i++) {
            int indice = 0;
            long valor = (long)Math.pow(primos[indice], i);
            int divisores = i + 1;
            if (valor > maximo) {
                break;
            }
            if (resultados.containsKey(divisores)) {
                resultados.put(divisores, Math.min(resultados.get(divisores), (int)valor));
            } else {
                resultados.put(divisores, (int)valor);
            }
            recursion(divisores, valor, i, indice + 1);
            
        }
        
    }

    public boolean caso() {
        int formaciones = in.nextInt();
        if (formaciones == 0) {
            return false;
        }
        if (resultados.containsKey(formaciones)) {
            System.out.println(resultados.get(formaciones));
        } else {
            System.out.println("+INF");
        }
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        rellenarResultados();
        while (caso());
    }

    public static void main(String[] args) {
        new AER327().run();
    }

}
