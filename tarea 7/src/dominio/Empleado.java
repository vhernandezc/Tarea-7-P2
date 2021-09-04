/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.*;
import java.util.Scanner;
import negocio.CatalogoEmpleadosImpl;
import negocio.CatalogoEmpleado;

/**
 *
 * @author Ruldin
 */
public class Empleado {
    
     
    private String nombre;
    private Double Eneda;
    private Double Febeda;
    private Double Marda;
 
    
    //se agregan los parametros para ingresar los datos de cada mes
    public Empleado( String nombre_peli, Double Enero, Double Febrero, Double Marzo){
        this.nombre=nombre_peli;
        this.Eneda=Enero;
        this.Febeda=Febrero;
        this.Marda=Marzo;
       
    }

    public Empleado(String linea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //retornamos cada dato
    @Override
    public String toString(){
        return this.getNombre()+ this.getEneda()+this.getFebeda()+this.getMarda();
        
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Eneda
     */
    public Double getEneda() {
        return Eneda;
    }

    /**
     * @param Eneda the Eneda to set
     */
    public void setEneda(Double Eneda) {
        this.Eneda = Eneda;
    }

    /**
     * @return the Febeda
     */
    public Double getFebeda() {
        return Febeda;
    }

    /**
     * @param Febeda the Febeda to set
     */
    public void setFebeda(Double Febeda) {
        this.Febeda = Febeda;
    }

    /**
     * @return the Marda
     */
    public Double getMarda() {
        return Marda;
    }

    /**
     * @param Marda the Marda to set
     */
    public void setMarda(Double Marda) {
        this.Marda = Marda;
    }

   
}
