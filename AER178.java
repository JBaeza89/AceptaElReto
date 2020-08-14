/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer178;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER178 {

    Scanner in;

    public void caso() {
        String texto = in.nextLine().toLowerCase();
        String mensaje = in.nextLine().replaceAll(" *", "").toLowerCase();        
        char[] caracteres = mensaje.toCharArray();
        int indice = 0;
        boolean mensajeOculto = false;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracteres[indice]) {
                indice++;
            }
            if (indice == caracteres.length) {
                mensajeOculto = true;
                break;
            }
        }
        System.out.println(mensajeOculto? "SI" : "NO");

    }

    public void run() {
        in = new Scanner(System.in);
        int casosPrueba = Integer.parseInt(in.nextLine());
        for (int i = 0; i < casosPrueba; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new AER178().run();
    }

}
