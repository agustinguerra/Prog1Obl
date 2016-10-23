
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
                else {
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("");
                System.out.println("El dato ingresado no corresponde el tipo correcto.");
                System.out.println("");
                in.nextLine();
                bandera=false;
            }
            inspec.setEdad(edad);
        }        
    }

    public static void setCedulaInspector(Inspector inspec){
        boolean bandera=false;
        Scanner in= new Scanner(System.in);
        System.out.println("");
        System.out.println("Por favor ingrese la cedula del inspector.");
        while(!bandera){
            String ced=in.nextLine();
            if (ced.matches("[0-9]+") && ((ced.length()==8)||(ced.length()==7))){
                inspec.setCedula(ced);
                bandera=true;
            }
            else
            {
                System.out.println("");
                System.out.println("Los datos que usted ingreso no son correctos.");
                System.out.println("");
                System.out.println("Ingreselos de nuevo.");
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
                    System.out.println("");
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;                    
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("");
                System.out.println("El dato ingresado no corresponde el tipo correcto o no esta en el intervalo correcto.");
                System.out.println("");
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
                System.out.println("");
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
                    System.out.println("");
                }
                else {
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("");
                System.out.println("El dato ingresado no corresponde el tipo correcto.");
                System.out.println("");
                bandera=false;
            }
            activ.setDuracion(duracion);
        }        
    }

   
    

    
    public static void setTipoDeRiesgoPrincipal(Actividad activ){
        Scanner in = new Scanner (System.in);        
        boolean bandera = false;
        int riesgo=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente al tipo de riesgo principal de la actividad.");
                riesgo=in.nextInt();
                if ((0<riesgo && riesgo<5)&& (riesgo!=activ.getTipoDeRiesgoSecundario())){
                    bandera=true;
                    System.out.println("");
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("");
                System.out.println("El dato ingresado no corresponde el tipo correcto,no esta en el intervalo correcto o el riesgo secundario coincide.");
                System.out.println("");
                bandera=false;
            }
            activ.setTipoDeRiesgoPrincipal(riesgo);
        }                  
    }    

    public static void setTipoDeRiesgoSecundario(Actividad activ){
        Scanner in = new Scanner (System.in);        
        boolean bandera = false;
        int riesgo=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente al tipo de riesgo secundario de la actividad.");
                riesgo=in.nextInt();
                if ((0<riesgo && riesgo<5) && (riesgo!=activ.getTipoDeRiesgoPrincipal())){
                    System.out.println("");
                    bandera=true;
                }
                else{
                    System.out.println("");
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("El dato ingresado no corresponde el tipo correcto,no esta en el intervalo correcto o el riesgo principal coincide.");
                System.out.println("");
                bandera=false;
            }
            activ.setTipoDeRiesgoSecundario(riesgo);
        }                  
    }  

    public static void setHoraInspeccion(Inspeccion inspec){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int hora=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese las horas de la inspeccion.");
                System.out.println("");
                hora=in.nextInt();
                if(hora>=0){
                    bandera=true;
                }
                else {
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("El dato ingresado no corresponde el tipo correcto.");
                System.out.println("");
                bandera=false;
            }
            inspec.setHoras(hora);
        }        
    }

    public static void setDiaInspeccion(Inspeccion inspec){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int dia=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el dia de la inspeccion.");
                System.out.println("");
                dia=in.nextInt();
                if(dia>0 && dia<31){
                    bandera=true;
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("El dato ingresado no corresponde el tipo correcto o no esta en el intervalo correcto.");
                System.out.println("");
                bandera=false;
            }
            inspec.setDia(dia);
        }        
    }

    public static void setMesInspeccion(Inspeccion inspec){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int mes=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el mes de la inspeccion.");
                System.out.println("");
                mes=in.nextInt();
                if(mes>0 && mes<13){
                    bandera=true;
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("El dato ingresado no corresponde el tipo correcto o no esta en el intervalo correcto.");
                System.out.println("");
                bandera=false;
            }
            inspec.setMes(mes);
        }        
    }    

    public static void setComentarios(Inspeccion inspec){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor ingrese los comentarios de la inspeccion.");
        String coment = in.nextLine();
        inspec.setComentarios(coment);
    }

    public static void setResultadoInspeccion(Inspeccion inspec){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int resultado=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese 1 si la inspeccion fue aprobada o 0 si fue rechazada.");
                System.out.println("");
                resultado=in.nextInt();
                if(resultado>-1 && resultado<2){
                    bandera=true;
                }
                else{
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;
                }
            }
            catch(InputMismatchException exception)
            {
                in.nextLine();
                System.out.println("El dato ingresado no corresponde el tipo correcto o no esta en el intervalo correcto.");
                System.out.println("");
                bandera=false;
            }
            inspec.setResultado(resultado); 
        }        
    }   
    
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al sistema de control de procesos.");
        System.out.println("");
        System.out.println("A continuacion se definiran dos actividades y un inspector.");
        System.out.println("");
        
//CREACION INSPECTOR
        
        System.out.println("Por favor ingrese los datos correspondientes al inspector.");
        System.out.println("");
        Inspector inspectorUno = new Inspector();
        setEdadInspector(inspectorUno);
        System.out.println("");
        setNombreInspector(inspectorUno);
        setCedulaInspector(inspectorUno);
        System.out.println("");

//CREACION ACTIVIDADES

        System.out.println("A continuacion se ingresaran las dos primeras actividades.");
        System.out.println("");
        Actividad actividadUno = new Actividad();
        Actividad actividadDos = new Actividad();
        System.out.println("Actividad UNO");
        setSeccionActividad(actividadUno);
        setDescripcionActividad(actividadUno);
        setDuracionActividad(actividadUno);
        setTipoDeRiesgoPrincipal(actividadUno);
        setTipoDeRiesgoSecundario(actividadUno);
        System.out.println(actividadUno);
        System.out.println("");
        System.out.println("Actividad DOS");
        setSeccionActividad(actividadDos);
        setDescripcionActividad(actividadDos);
        setDuracionActividad(actividadDos);
        setTipoDeRiesgoPrincipal(actividadDos);
        setTipoDeRiesgoSecundario(actividadDos);
        System.out.println(actividadDos);
        System.out.println("");
        
// CREACION INSPECCIONES

        Inspeccion inspeccionUno;
        Inspeccion inspeccionDos;
        inspeccionUno = new Inspeccion();
        inspeccionDos = new Inspeccion();
        inspeccionUno.setInspector(inspectorUno);
        inspeccionDos.setInspector(inspectorUno);
        inspeccionUno.setActividad(actividadUno);
        inspeccionDos.setActividad(actividadDos);
        System.out.println("");

        
        Scanner in = new Scanner(System.in);
        int seleccion = -1;
        
        while(seleccion != 0 && seleccion!=6){
            
            try{
                    
                System.out.println("╔════════════╗\n"+ 
                                   "║ Elige una opción  ║\n"+
                                   "║                   ╚═════════════╗\n"+ 
                                   "║1 - Actualizar datos del Inspector       ║\n"+
                                   "║2 - Actualizar actividad UNO             ║\n"+
                                   "║3 - Actualizar actividad DOS             ║\n"+
                                   "║4 - Mostrar las actividades              ║\n"+
                                   "║5 - Registrar las inspecciones           ║\n"+
                                   "║6 - Terminar                             ║\n"+                        
                                   "╚══════════════════════════╝");
                
                seleccion = in.nextInt();
                	
                switch(seleccion){
                case 1: 
			System.out.println("Actualizar los datos del Inspector");
                        setEdadInspector(inspectorUno);
                        System.out.println("");
                        setNombreInspector(inspectorUno);
                        setCedulaInspector(inspectorUno);
                        System.out.println("");
		break;
                case 2: 
			System.out.println("Actualizar los datos de la actividad UNO");
                        setSeccionActividad(actividadUno);
                        setDescripcionActividad(actividadUno);
                        setDuracionActividad(actividadUno);
                        setTipoDeRiesgoPrincipal(actividadUno);
                        setTipoDeRiesgoSecundario(actividadUno);
                        System.out.println(actividadUno);
                        System.out.println("");
		break;
                case 3: 
			System.out.println("Actualizar los datos de la actividad DOS");
                        setSeccionActividad(actividadDos);
                        setDescripcionActividad(actividadDos);
                        setDuracionActividad(actividadDos);
                        setTipoDeRiesgoPrincipal(actividadDos);
                        setTipoDeRiesgoSecundario(actividadDos);
                        System.out.println(actividadDos);                        
                        System.out.println("");
		break;
                case 4: 
			System.out.println("Mostrar las actividades");                       
                        System.out.println("");
                        if(actividadUno.getTipoDeRiesgoPrincipal()>actividadDos.getTipoDeRiesgoPrincipal()){
                            System.out.println("Actividad UNO");
                            System.out.println(actividadUno);
                            System.out.println("Actividad DOS");
                            System.out.println(actividadDos);
                        }
                        else if (actividadUno.getTipoDeRiesgoPrincipal()<actividadDos.getTipoDeRiesgoPrincipal()){
                            System.out.println("Actividad DOS");
                            System.out.println(actividadDos);
                            System.out.println("Actividad UNO");
                            System.out.println(actividadUno);
                        }
                        else if (actividadUno.getTipoDeRiesgoSecundario()>actividadDos.getTipoDeRiesgoSecundario()){
                            System.out.println("Actividad UNO");
                            System.out.println(actividadUno);
                            System.out.println("Actividad DOS");
                            System.out.println(actividadDos);
                        }
                        else if (actividadUno.getTipoDeRiesgoSecundario()<actividadDos.getTipoDeRiesgoSecundario()){
                            System.out.println("Actividad DOS");
                            System.out.println(actividadDos);
                            System.out.println("Actividad UNO");
                            System.out.println(actividadUno);                        
                        } 
                        else {
                            System.out.println("Actividad UNO");
                            System.out.println(actividadUno);
                            System.out.println("Actividad DOS");
                            System.out.println(actividadDos);
                        }      
		break;
                case 5: 
			System.out.println("Registrar las inspecciones");
                        System.out.println("");
                        System.out.println("Inspeccion UNO");
                        System.out.println("");
                        setHoraInspeccion(inspeccionUno);
                        System.out.println("");
                        setDiaInspeccion(inspeccionUno);
                        System.out.println("");
                        setMesInspeccion(inspeccionUno);
                        setComentarios(inspeccionUno);
                        setResultadoInspeccion(inspeccionUno);
                        System.out.println("");
                        System.out.println(inspeccionUno);
                        System.out.println("");
                        System.out.println("Inspeccion DOS");
                        setHoraInspeccion(inspeccionDos);
                        setDiaInspeccion(inspeccionDos);
                        setMesInspeccion(inspeccionDos);
                        setComentarios(inspeccionDos);
                        setResultadoInspeccion(inspeccionDos);
                        System.out.println(inspeccionDos);
                        System.out.println("");
                        if (inspeccionUno.getResultado()==true && inspeccionDos.getResultado()==true){
                            System.out.println("El grado de rechazo es bajo");
                        }
                        else if (inspeccionUno.getResultado()==false && inspeccionDos.getResultado()==false){
                            System.out.println("El grado de rechazo es alto");
                        }
                        else {
                            System.out.println("El grado de rechazo es medio");
                        }
                        System.out.println("");
                break;
                case 6:
                        System.out.println("Hasta luego!");
                break;
                default:
                        System.out.println("La opción elegida no es correcta");
                break;
                }
				
                System.out.println("\n");
            
            }catch(Exception e){
                in.nextLine();
            System.out.println("¡Error!");
            }
        }
    }
    
}
