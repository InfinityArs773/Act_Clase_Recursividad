/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act_clase_recursividad;

/**
 *
 * @author Erick López
 */
public class Act_Clase_Recursividad_Inverted_String {

    public static void main(String[] args) {
        System.out.println(invertir("Gato"));
    }
    
    public static String invertir (String texto){
        if (texto.isEmpty()){
            return "";
        }
        return invertir(texto.substring(1)) 
                + texto.charAt(0);
    }
}
