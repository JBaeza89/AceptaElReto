/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer184;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER184 {

    Scanner in;

    public boolean caso() {
        int noches = in.nextInt();
        if (noches == 0) {
            return false;
        }
        int minDormidos = 0;
        for (int i = 0; i < noches; i++) {
            String[] tiempos = in.next().split("-");
            String[] dormir = tiempos[0].split(":");
            String[] despertar = tiempos[1].split(":");
            minDormidos +=
                   ((Integer.parseInt(despertar[0]) - Integer.parseInt(dormir[0]) + 24) % 24 * 60)
                   + (Integer.parseInt(despertar[1]) - Integer.parseInt(dormir[1]));
        }
        int horas = minDormidos / 60;
        int minutos = minDormidos % 60;
        System.out.format("%02d:%02d%n", horas, minutos);
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER184().run();
    }

}
