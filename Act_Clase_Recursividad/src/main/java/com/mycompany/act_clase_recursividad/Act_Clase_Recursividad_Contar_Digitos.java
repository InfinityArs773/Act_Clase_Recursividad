/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act_clase_recursividad;

/**
 *
 * @author Erick López
 */
public class Act_Clase_Recursividad_Contar_Digitos {

    public static void main(String[] args) {
    int numero = 67676767;
    System.out.println("El numero " + numero + "tiene " + Cont_Digitos(numero) + "digitos");
    }
    
    public static int Cont_Digitos (int n){
        if (n >= -9 && n <= 9){
            return 1;
        }
            return 1 + Cont_Digitos(n/10);
    }

       
}

