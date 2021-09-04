/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Empleado;
import dominio.mdEmpleado;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author Ruldin
 */
public interface AccesoDatos  {
  
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    public List<Empleado> listar(String nombreArchivo) throws LecturaDatosEx;
    void escribir(Empleado pelicula, String nombreArchivo,boolean anexar) throws EscrituraDatosEx;
    public String buscar(String nombreArchivo,String buscar) throws LecturaDatosEx;
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    public void borrar(String nombreArchivo) throws AccesoDatosEx;
   
}

