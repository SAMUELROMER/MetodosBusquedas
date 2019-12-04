package Busqueda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CT7-PC37
 */
public class BusquedaLinael {
    public static String busquedaSecuencial(int []arreglo,int dato){
 String posicion = " ";
  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
    posicion += i+",";//Si es verdadero guardamos la posicion
   //Para el ciclo
   }
 }
 return posicion;
}
    
    public static  String busquedaSecuencial02(String []arreglo,String dato){
 String posicion = " ";
 
 
  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
      if(dato == null ? arreglo[i] == null : dato.equals(arreglo[i])){//comparamos el elemento en el arreglo con el buscado
    posicion += i+"-";//Si es verdadero guardamos la posicion
   }
 }
 return posicion;
}
    
   
}
