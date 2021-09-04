/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.*;

import dominio.Empleado;
import dominio.mdEmpleado;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

/**
 *
 * @author Ruldin
 */
public class CatalogoEmpleadosImpl implements CatalogoEmpleado {
     private final AccesoDatos datos;
    
    public CatalogoEmpleadosImpl(){
        this.datos = new AccesoDatosImpl(); //poner * en el import datos.*
    }
    @Override
    //le mandamos parametros al constructor
    public void agregarEmpleado(String nombreEmpleado,Double Enero1,Double Febrero1,Double Marzo1, String nombreArchivo) {
       Empleado empleado = new Empleado(nombreEmpleado, Enero1,Febrero1,Marzo1);//variable de tipo clase Empleado va a contener estos parametros
        boolean anexar = false;
        try { 
            anexar = datos.existe(nombreArchivo);//bandera si anexa o no
            datos.escribir(empleado,nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    
  
    
}
    @Override
    public void  listarEmpleado(  String nombreArchivo) {
        
         try {
            List<Empleado> empleados = datos.listar(nombreArchivo);
            
        
            for(Empleado emple : empleados){
                System.out.println("empleado "+emple);
                
                Spliterator<Empleado>lectura= empleados.spliterator().trySplit();
               
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
        
    }
    
    @Override
    public void buscarEmpleado(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
           
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la empleado");
            ex.printStackTrace();
        }
         System.out.println("Resultado Busqueda:"+resultado);
    
    }
  
           
   

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        
        try {
            if(datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //crearmos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }

    }
    
    
}
