/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer105;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER105 {

    Scanner in;

    public boolean caso() {
        double[] semana = new double[6];
        semana[0] = in.nextDouble();
        if (semana[0] < 0) {
            return false;
        }
        int mayor = 0;
        int menor = 0;
        boolean empateMayor = false;
        boolean empateMenor = false;
        double media = semana[0];
        String[] dias = new String[]{"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        for (int i = 1; i < 6; i++) {
            semana[i] = in.nextDouble();
            media += semana[i];
            if (semana[i] >= semana[mayor]) {
                empateMayor = semana[i] == semana[mayor];
                mayor = i;
            }
            if (semana[i] <= semana[menor]) {
                empateMenor = semana[i] == semana[menor];
                menor = i;

            }
        }
        media = media / 6;
        System.out.format("%s %s %s%n", empateMayor ? "EMPATE" : dias[mayor],
                empateMenor ? "EMPATE" : dias[menor], semana[5] > media ? "SI" : "NO");
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        in.useLocale(Locale.ROOT);
        while (caso());
    }

    public static void main(String[] args) {
        new AER105().run();
    }

}
