package com.mycompany.modulo4tarea;

import helpers.Ciudadano;
import helpers.CostaRica;
import helpers.Honduras;
import helpers.Panama;
//MICHAEL ALEJANDRO GUERRA MELENDEZ 201810010296
/**
 *
 * @author MICHAEL GUERRA M
 */
public class MainClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //********PRIMERA PARTE DE TAREA*************
       //Establecer Valor a variable privada
       Ciudadano ciudadano = new Ciudadano();
       ciudadano.setNombre("MICHAEL");
       ciudadano.setEdad(20);
       ciudadano.setAExperencia(3);
       
       //Imprimiendo Valores
       System.out.println(ciudadano.obtenerNombre());
       System.out.println(ciudadano.obtenerEdad());
       System.out.println(ciudadano.obtenerAExperencia());
       
       //********SEGUNDA PARTE DE TAREA**********
       Honduras honduras = new Honduras();
       CostaRica _costaRica = new CostaRica();
       Panama panama = new Panama();
       
       System.out.println(honduras.getPais());
       System.out.println(honduras.getPresidente());
       System.out.println(_costaRica.getPais());
       System.out.println(_costaRica.getPresidente());
       System.out.println(panama.getPais());
       System.out.println(panama.getPresidente());
    }
    
}
