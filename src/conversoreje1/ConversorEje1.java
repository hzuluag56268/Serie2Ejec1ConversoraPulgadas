/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversoreje1;

import java.util.Scanner;

/**
 *
 */
public class ConversorEje1 {

    /**
     */
    public static void main(String[] args) {
        
        
      double d = 1, a, valor, res = 0;
      String UnidadMedida = ""; 
      
      Scanner teclado = new Scanner(System.in);
        
      System.out.print("ingrese unidad de medida para convertir a pulgadas ‘P’ para pie," + 
                       " ‘C’ para centímetro, ‘L’ para legua, y ‘Y’ para yarda ");
      UnidadMedida = teclado.nextLine();
      
      System.out.print("ingrese el numero para convertir a pulgadas");
      valor = teclado.nextDouble();
      
      if(UnidadMedida.equals("P")){
          res =Math.round(valor / 0.0833);
          System.out.println(valor + " Pies equivale a " + res + " pulgadas. ");
          
        } else if(UnidadMedida.equals("C")){
          res =Math.round(valor / 2.54);
          System.out.println(valor + " Centimetros equivale a " + res + " pulgadas. ");
          
        } else if(UnidadMedida.equals("L")){
          res =Math.round(valor * 190080.02);
          System.out.println(valor + " Leguas equivale a " + res + " pulgadas. ");
          
        } else if(UnidadMedida.equals("Y")){
          res =Math.round(valor * 36);
          System.out.println(valor + " Yardas equivale a " + res + " pulgadas. ");
          
        } else {
            System.out.print("Los sentimos, tu valor ingresado no es valido. :( . Revisa las mayusculas. ");
        };
      
      
      
      
    }
    
}
