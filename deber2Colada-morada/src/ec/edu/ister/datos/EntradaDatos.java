/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.datos;

import java.util.Scanner;

/**
 *
 * Nombre: EDISON CHANATAXI
 */
public class EntradaDatos {
    public static void ingreso() {
        
        Scanner input =new Scanner(System.in);
        
        int dato;
        
        System.out.println("Colada Morada");
        System.out.println("ingredientes utilizados :");
        dato = input.nextInt();
        String datos[] = new String[dato];  
     
        
        String aux;  
        
        System.out.println("Ingrese todos los Ingredientes: ");
        
        for(int i=0;i<dato;i++){
            System.out.print((i+1)+")Ingredientes: ");
            aux = input.next();                                         
            datos[i] = aux;                                              
        
        }
                
        Scanner entrada =new Scanner(System.in);
        int pan ;
        
        System.out.println("Guagua de pan ");
        
        System.out.println("1.-SI ");
        System.out.println("2.-NO ");
        pan= entrada.nextInt();
        
        if(pan==1)                                                      
           {
            int dato2;
            String aux2;
            System.out.println("numero de Ingredientes Utilizados :");
            dato2 = input.nextInt(); 
            String datos2[] = new String[dato2];
            System.out.println("Ingresar los Ingredientes: ");
            for(int i=0;i<dato2;i++){
            System.out.print((i+1)+")Ingredientes: ");
            aux = input.next();                                         
            datos2[i] = aux;  
                   
        }
            {
                System.out.println(""); 
                System.out.println("Ingredientes del Guagua de pan : "); 
        for(int i=0;i<dato2;i++){
            System.out.println((i+1)+")Ingrediente: "+datos2[i]);
            
        
        }
            }   
        }
        
        else{
            System.out.println("Gracias ");
        }
        System.out.println(""); 
        System.out.println("Los ingredientes de la Colada Morada son : ");
        for(int i=0;i<dato;i++){
            System.out.println((i+1)+")Ingrediente: "+datos[i]);
            
        
        }
        
        
         
    }
        
     
    }


