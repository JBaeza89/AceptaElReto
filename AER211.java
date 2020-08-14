/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer211;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AER211 {

    Scanner in;
    Map<Character, String> morse;
    
    public void crearCodigoMorse() {
        morse = new HashMap<>();
        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "..-.");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', ".---");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', ".--");
        morse.put('X', "-..-");
        morse.put('Y', "-.--");
        morse.put('Z', "--..");
    }
    
    public String codificar(String palabra) {
        palabra = palabra.toUpperCase();
        String vocales = "AEIOU";
        String codigo = "";
        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.indexOf(palabra.charAt(i)) >= 0) {
                codigo += palabra.charAt(i) == 'O'? "-" : ".";
            }
        }
        return codigo;
    }
    
    public void caso() {
        String palabra = in.next();
        String palabraCodificada = codificar(palabra);
        if (morse.get(palabra.toUpperCase().charAt(0)).equals(palabraCodificada)) {
            System.out.println(palabra + " OK");
        } else {
            System.out.println(palabra + " X");
        }
    }
    
    public void run () {
        in = new Scanner(System.in);
        crearCodigoMorse();
        while (in.hasNext()) {
            caso();
        }
    }
    
    public static void main(String[] args) {
        new AER211().run();
    }
    
}
