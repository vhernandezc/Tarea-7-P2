/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.mdEmpleado;

/**
 *
 * @author Ruldin
 */
public interface CatalogoEmpleado {
    public void agregarEmpleado(String nombrePrchivo, Double Enero, Double Febrero, Double Marzo, String nombreArchivo); 
    public void listarEmpleado( String nombreArchivo);
    public void buscarEmpleado(String nombreArchivo, String Buscar);
   
    public void iniciarArchivo(String nombreArchivo);
}
