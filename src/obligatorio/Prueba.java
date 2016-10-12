
package obligatorio; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {


    public static void setEdadInspector(Inspector inspec){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int edad=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese la edad del inspector.");
                edad=in.nextInt();
                if(edad>=0){
                    bandera=true;
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto.");
                in.next();
                bandera=false;
            }
            inspec.setEdad(edad);
        }        
    }

    public static void setCedulaInspector(Inspector inspec){
        boolean bandera=false;
        Scanner in= new Scanner(System.in);
        System.out.println("Por favor ingrese la cedula del inspector.");
        System.out.println("");
        while(!bandera){
            String ced=in.nextLine();
            if (ced.matches("[0-9]+") && ((ced.length()==8)||(ced.length()==7))){
                inspec.setCedula(ced);
                bandera=true;
            }
            else
            {
                System.out.println("Los datos que usted ingreso no son correctos.");
                System.out.println("");
                System.out.println("Ingreselos de nuevo.");
                System.out.println("");
            }
        }
    }
    
    public static void setNombreInspector(Inspector inspec){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        String nombre="";
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el nombre del inspector.");
                nombre=in.nextLine();
                bandera=true;
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto.");
                in.next();
                bandera=false;
            }
            inspec.setNombre(nombre);
        }        
    }  
  
    public static void setSeccionActividad(Actividad activ){
        Scanner in = new Scanner (System.in);
        
        boolean bandera = false;
        System.out.println("");
        int seccion=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente a la seccion de la empresa de la actividad.");
                seccion=in.nextInt();
                if (0<seccion && seccion<11){
                    bandera=true;
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;                    
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto o no esta en el intervalo correcto.");
                bandera=false;
            }
            activ.setSeccion(seccion);
        }                  
    }

    public static void setDescripcionActividad(Actividad activ){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        String descripcion="";
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese la descripcion de la activdad.");
                descripcion=in.nextLine();
                bandera=true;
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto.");
                bandera=false;
            }
            activ.setDescripcion(descripcion);
        }        
    }      

    public static void setDuracionActividad(Actividad activ){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int duracion=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese la duracion de la actividad.");
                duracion=in.nextInt();
                if(duracion>=0){
                    bandera=true;
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto.");
                bandera=false;
            }
            activ.setDuracion(duracion);
        }        
    }
    
    public static void setTipoDeRiesgoPrincipal(Actividad activ){
        Scanner in = new Scanner (System.in);        
        boolean bandera = false;
        System.out.println("");
        int riesgo=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente al tipo de riesgo principal de la actividad.");
                riesgo=in.nextInt();
                if (0<riesgo && riesgo<5){
                    bandera=true;
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto o no esta en el intervalo correcto.");
                bandera=false;
            }
            activ.setTipoDeRiesgoPrincipal(riesgo);
        }                  
    }    

    public static void setTipoDeRiesgoSecundario(Actividad activ){
        Scanner in = new Scanner (System.in);        
        boolean bandera = false;
        System.out.println("");
        int riesgo=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente al tipo de riesgo secundario de la actividad.");
                riesgo=in.nextInt();
                if (0<riesgo && riesgo<5){
                    bandera=true;
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto o no esta en el intervalo correcto.");
                bandera=false;
            }
            activ.setTipoDeRiesgoSecundario(riesgo);
        }                  
    }  
    
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al sistema de control de procesos.");
        System.out.println("");
        System.out.println("A continuacion se definiran dos actividades y un inspector.");
        System.out.println("");
        System.out.println("Por favor ingrese los datos correspondientes al inspector.");
        System.out.println("");
        Inspector inspectorUno = new Inspector();
        setEdadInspector(inspectorUno);
        System.out.println("");
        setNombreInspector(inspectorUno);
        setCedulaInspector(inspectorUno);
        System.out.println("A continuacion se ingresaran las dos primeras actividades.");
        System.out.println("");
        Actividad actividadUno = new Actividad();
        Actividad actividadDos = new Actividad();
        System.out.println("Actividad uno.");
        setSeccionActividad(actividadUno);
        setDescripcionActividad(actividadUno);
        setDuracionActividad(actividadUno);
        setTipoDeRiesgoPrincipal(actividadUno);
        setTipoDeRiesgoSecundario(actividadUno);
        System.out.println("Actividad dos.");
        setSeccionActividad(actividadDos);
        setDescripcionActividad(actividadDos);
        setDuracionActividad(actividadDos);
        setTipoDeRiesgoPrincipal(actividadDos);
        setTipoDeRiesgoSecundario(actividadDos);
    }
    
}
