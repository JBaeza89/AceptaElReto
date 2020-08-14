/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer123;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER123 {

    Scanner in;
    String[][][] conjugaciones = new String[][][]{
        {
            {"o", "as", "a", "amos", "ais", "an"},
            {"e", "aste", "o", "amos", "asteis", "aron"},
            {"are", "aras", "ara", "aremos", "areis", "aran"},},
        {
            {"o", "es", "e", "emos", "eis", "en"},
            {"i", "iste", "io", "imos", "isteis", "ieron"},
            {"ere", "eras", "era", "eremos", "ereis", "eran"},},
        {
            {"o", "es", "e", "imos", "is", "en"},
            {"i", "iste", "io", "imos", "isteis", "ieron"},
            {"ire", "iras", "ira", "iremos", "ireis", "iran"}
        }
    };

    String[] pronombres = new String[]{"yo", "tu", "el", "nosotros", "vosotros", "ellos"};

    public boolean caso() {

        String verbo = in.next();
        String tiempoVerbal = in.next();
        if (tiempoVerbal.equals("T")) {
            return false;
        }
        String terminacion = verbo.substring(verbo.length() - 2);
        int conjugacion;
        int tiempo;
        if (terminacion.equals("ar")) {
            conjugacion = 0;
        } else if (terminacion.equals("er")) {
            conjugacion = 1;
        } else {
            conjugacion = 2;
        }
        if (tiempoVerbal.equals("A")) {
            tiempo = 0;
        } else if (tiempoVerbal.equals("P")) {
            tiempo = 1;
        } else {
            tiempo = 2;
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.format("%s %s%s%n", pronombres[i], verbo.substring(0, verbo.length() - 2), 
                    conjugaciones[conjugacion][tiempo][i]);
        }
        
        return true;
    }

    public void run() {
        in = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new AER123().run();
    }

}
