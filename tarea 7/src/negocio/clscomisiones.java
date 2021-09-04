/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.mdEmpleado;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import static pelisplus.PelisPlus.Enero;
import static pelisplus.PelisPlus.Febrero;
import static pelisplus.PelisPlus.Marzo;
import static pelisplus.PelisPlus.nombre;


/**
 *
 * @author vh367
 */
public class clscomisiones {
    private static final CatalogoEmpleado catalogoPeli =   new CatalogoEmpleadosImpl();
      private static final Scanner scanner = new Scanner(System.in);
       private static final String nombreArchivo = "C:\\Users\\vh367\\OneDrive\\Desktop\\carpeta proyecto\\empleados.txt";
   
    Scanner t = new Scanner(System.in);//lee los datos que ingresamos
    public List<mdEmpleado> Todos = new ArrayList<mdEmpleado>();//declaramos una lista de tipo Md que se llama todos
     Scanner x = new Scanner(System.in);
    public mdEmpleado Ingreso_informacion(){
        mdEmpleado vende = new mdEmpleado();
         
        System.out.println("Ingrese Nombre");
        nombre = scanner.nextLine();
        vende.nombre = nombre;
        System.out.println("Ingrese Enero");
        Enero= scanner.nextInt();
        vende.enero = Enero;     
         
        System.out.println("Ingrese Febrero");
        Febrero= scanner.nextInt();
        vende.febrero = Febrero;      
        System.out.println("Ingrese Marzo");
        Marzo= scanner.nextInt();
        vende.marzo = Marzo;
         Todos.add(vende);
       
         catalogoPeli.agregarEmpleado(nombre,Enero,Febrero,Marzo, nombreArchivo);
                        
         return vende;
    }
    
      public void desplegarDato(){
        for(mdEmpleado ele: Todos){
          
            System.out.println( "__Nombre  " +ele.nombre+ "__Enero " +ele.enero+ "__Febrero " +ele.febrero+  "__Marzo " +ele.marzo+" \n");
         
        
        }
    }
     
       
       
        
    //metodo para realizar la suma por cada mes
     public void sumaxmes(){
         String nota="suma de cada mes";
         double Total1 = 0.00;
          double Total2 = 0.00;
         double Total3 = 0.00;
         
        
     nombre=nota;
    
            for(mdEmpleado obje : Todos){ 
            Total1 += obje.enero;
            Enero=Total1;
            }
         
            System.out.println("la suma de Enero es = " + Total1);
              for(mdEmpleado obje : Todos){ 
            Total2 += obje.febrero;
            Febrero=Total2;
            }
         
            System.out.println("la suma de Febrero es = " + Total2);
             for(mdEmpleado obje : Todos){ 
            Total3 += obje.marzo;
            Marzo=Total3;
            }
        
            System.out.println("la suma de Marzo es = " + Total3);
              catalogoPeli.agregarEmpleado(nombre,Enero,Febrero,Marzo, nombreArchivo);
     }
    
    
    
      // metodos para el promedio de cada mes
       public void promedioxmes(){
           String notap="el promedio de cad mes es:";
           nombre=notap;
        double Total4 = 0.00;
         double Total5 = 0.00;
         double Total6 = 0.00;
            double Promedio1 = 0.00;
            double Promedio2 = 0.00;
            double Promedio3 = 0.00;
            for(mdEmpleado obje : Todos){
            Total4 += obje.enero;
            Promedio1 += obje.enero/Todos.size();   
            Enero=Promedio1;
            }
            System.out.println("El promedio de Enero es: "+Promedio1);
            for(mdEmpleado obje : Todos){
            Total5 += obje.febrero;
            Promedio2 += obje.febrero/Todos.size(); 
            Febrero=Promedio2;
            }
            System.out.println("El promedio de Febrero es: "+Promedio2);
            for(mdEmpleado obje : Todos){
            Total6 += obje.marzo;
            Promedio3 += obje.marzo/Todos.size();   
            Marzo=Promedio3;
            }
            System.out.println("El promedio de Marzo es: "+Promedio3);
            catalogoPeli.agregarEmpleado(nombre,Enero,Febrero,Marzo, nombreArchivo);
     }
     
    public void menu(){
        int opc ;
        do{
            System.out.println("1- Ingreso de Informacion");
            System.out.println("2- Ver Informacion");
            System.out.println("3-suma de cada mes");
            System.out.println("4-promedio de cada mes");
            System.out.println("5-salir de opciones del menu");
            System.out.println("6-volver al menú principal");
            opc=Integer.parseInt(t.next());
            switch(opc){
                case 1: 
                           Ingreso_informacion();
                break;
                case 2: desplegarDato();
                break;    
                case 3: sumaxmes();
                           break;
               
               
            
            case 4: promedioxmes();break;
                      
            case 5: 
            System.out.println("Introduce el nombre de una pelicula a buscar:");
                        String buscar = scanner.nextLine();
                        catalogoPeli.buscarEmpleado(nombreArchivo, buscar);
                        
            break;
             case 6:
                        System.out.println("!Adios!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;}
        }while(opc!=(6));
    }

   
}
