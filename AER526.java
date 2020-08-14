/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer526;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER526 {

    Scanner in;
    String tP1;
    String tP2;
    String texto;
    int indiceMax;

    public boolean comprobar(int indice) {
        if (indice >= texto.length()) {
            return true;
        }
        indiceMax = Math.max(indice, indiceMax);
        if (indiceMax - indice > 5) {
            return false;
        }
        boolean sePuede = tP1.contains(texto.substring(indice, indice + 1)) && comprobar(indice + 1);
        if (!sePuede) {
            try {
                return tP2.contains(texto.substring(indice, indice + 2)) && comprobar(indice + 2);

            } catch (Exception ex) {
                return false;
            }
        }
        return true;

    }

    public void caso() {
        texto = in.nextLine().toLowerCase().replace(" ", "");
        boolean sePuede = comprobar(0);
        indiceMax = 0;
        if (!sePuede) {
            sePuede = comprobar(0);
        }
        System.out.println(sePuede ? "SI" : "NO");
    }

    public void run() {
        in = new Scanner(System.in);
        tP1 = "hkyvwbcnposfiu";
        tP2 = "li na rb cs fr be mg ca sr ba ra sc ti zr hf rf nb ta db cr mo sg mn tc re bh fe "
                + "ru os hs co rh ir mt ni pd pt ds cu ag au "
                + "rg zn cd hg cn al ga in tl nh si ge sn pb fl as sb bi mc se te po lv cl br "
                + "at ts he ne ar kr xe rn og la ce pr nd "
                + "pm sm eu gd tb dy ho er tm yb lu ac th pa np pu am cm bk cf es fm md no lr";
        while (in.hasNextLine()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER526().run();
    }

}