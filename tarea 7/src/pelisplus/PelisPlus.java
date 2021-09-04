/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelisplus;

import dominio.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import negocio.CatalogoEmpleadosImpl;
import negocio.clscomisiones;
import negocio.CatalogoEmpleado;

/**
 *
 * @author Ruldin
 */
public class PelisPlus {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\vh367\\OneDrive\\Desktop\\carpeta proyecto\\empleados.txt";//damos la direccion del archivo
    private static final CatalogoEmpleado catalogoPeli =   new CatalogoEmpleadosImpl();

    
      public static String nombre;
       public static double Enero;
       public static double Febrero;
       public static double Marzo;
    /**
     * @param args the command line arguments11
     */
    public static void main(String[] args) {
        //Mientras la opcion elegida sea 0, preguntamos al usuario
     while (opcion != 0) {
            try {
                System.out.println( "1- iniciar nuevo codumento");
                System.out.println("2- para ver opciones de menú");
                        
                opcion = Integer.parseInt(scanner.nextLine());//parseamos la información a int

                //inicializamos el switch principal
                switch (opcion) {
                    case 1:
                        //1. Creamos el objeto que administra el catalogo de personas
                        //La creacion del archivo es opcional, de todas maneras se creara 
                        //al escribir por primera vez en el archivo
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2: 
                       
                        //importando la clase comisiones
                        clscomisiones comi =  new clscomisiones();
                              comi.menu();
                        catalogoPeli.listarEmpleado( nombreArchivo);
                        
                        break;
                                 
                  
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Hasta pronto!");
            }
          }
       
        }

   
    
}
