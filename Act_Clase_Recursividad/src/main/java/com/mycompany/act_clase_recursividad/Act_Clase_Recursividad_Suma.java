/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act_clase_recursividad;

/**
 *
 * @author Erick López
 */
public class Act_Clase_Recursividad_Suma {

    public static void main(String[] args) {
    System.out.println(suma(67));   
    }
    
    public static int suma(int n){
        if (n <= 0){
           
        return 0;  
        }
        return n + suma(n-1);
       
    }
}
