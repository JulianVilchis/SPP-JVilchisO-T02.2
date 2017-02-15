/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jvilchiso.t02.pkg2;
import java.util.Scanner;

public class SPPJVilchisOT022 {

    public static void main(String[] args) {
     
        double valinf, valsup;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Bienvenido al Verificador de números 3000000");
        System.out.println("******************************");
        
        System.out.println("\nIntroduce un número entero:");
        valinf = kb.nextDouble();
        
        System.out.println("Ahora introduce un número mayor al anterior:");
        valsup = kb.nextDouble();
        
       
        
       while(valinf <= valsup){
           if (valinf % 2 == 0){
        System.out.println(valinf + " = *Este número es PAR*");
    }
           else if (valinf % 3==0 && valinf % 5==0){
           System.out.println(valinf+ " = *Este número es divisible entre 3 y 5*");
       }
           else if(valinf % 3==0){
               System.out.println(valinf+ " = *Este número es divisible entre 3*");
            }
           else if(valinf % 5==0){
               System.out.println(valinf+ " = *Este número es divisible entre 5*");
            }
           else{
               System.out.println(valinf);
           }
           valinf++;
        }
       

       }  
}