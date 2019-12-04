/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda;

/**
 *
 * @author CT7-PC37
 */
public class busquedaBinaria {
    public static int busquedaBinaria(int  vector[], int dato){
  int n = vector.length;
  int centro,inf=0,sup=n-1;
   while(inf<=sup){
     centro=(sup+inf)/2;
     if(vector[centro]==dato) return centro;
     else if(dato < vector [centro] ){
        sup=centro-1;
     }
     else {
       inf=centro+1;
     }
   }
   return -1;
 }
    
     public static String busquedaBinaria2(int  vector[], int [] dato){
          String posicion = " ";                
     
  for(int i = 0; i < dato.length; i++){//recorremos todo el arreglo
       int n = vector.length;
       int centro,inf=0,sup=n-1;
   while(inf<=sup){
     centro=(sup+inf)/2;
      if(vector[centro]==dato[i]){
    String numCadena= String.valueOf(centro);
       posicion += centro+"-";
        return posicion;  
      }
              
     else if(dato[i] < vector [centro] ){
        sup=centro-1;
     }
     else {
       inf=centro+1;
     }
   }
 }
 return "-1";
}
        
}
