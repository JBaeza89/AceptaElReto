/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer108;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER108 {

    Scanner in;

    public void caso() {
        String[] categorias = new String[]{"DESAYUNOS", "COMIDAS", "MERIENDAS", "CENAS", "COPAS"};
        String codigos = "DAMIC";
        double[] datos = new double[5];
        int mayor = 0;
        int menor = 0;
        boolean empateMayor = false;
        boolean empateMenor = false;
        double suma = 0;
        int contadorV = 0;
        int contadorA = 0;
        while (true) {
            String cod = in.next();
            int indice = codigos.indexOf(cod);
            double diners = in.nextDouble();
            if (indice < 0) {
                break;
            }
            datos[indice] += diners;
            contadorV++;
            if (indice == 1) {
                contadorA++;
            }
        }
        suma += datos[0];
        for (int i = 1; i < 5; i++) {
            suma += datos[i];
            if (datos[i] >= datos[mayor]) {
                empateMayor = datos[mayor] == datos[i];
                mayor = i;
            }
            if (datos[i] <= datos[menor]) {
                empateMenor = datos[menor] == datos[i];
                menor = i;
            }
        }
        double mediaVentas = contadorV == 0? 0: suma / contadorV;
        double mediaComidas = contadorA == 0? 0 : datos[1] / contadorA;
        System.out.format("%s#%s#%s%n", empateMayor ? "EMPATE" : categorias[mayor],
                empateMenor ? "EMPATE" : categorias[menor], mediaComidas > mediaVentas ? "SI" : "NO");
    }

    public void run() {
        in = new Scanner(System.in);
        in.useLocale(Locale.ROOT);
        while (in.hasNext()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER108().run();
    }

}
