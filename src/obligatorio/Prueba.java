
package obligatorio; 

import java.util.Collections;
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

    public static void setEdadEncargado(Encargado enc){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int edad=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese la edad del encargado.");
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
            enc.setEdad(edad);
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

    public static void setCedulaEncargado(Encargado enc){
        boolean bandera=false;
        Scanner in= new Scanner(System.in);
        System.out.println("");
        System.out.println("Por favor ingrese la cedula del encargado.");
        while(!bandera){
            String ced=in.nextLine();
            if (ced.matches("[0-9]+") && ((ced.length()==8)||(ced.length()==7))){
                enc.setCedula(ced);
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
                if (nombre.length()>0){
                    bandera=true;
                }
                else {
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;                       
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto, o no ha ingresado nombre.");
                System.out.println("");
                bandera=false;
            }
            inspec.setNombre(nombre);
        }        
    }  

    public static void setNombreEncargado(Encargado enc){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        String nombre="";
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el nombre del encargado.");
                nombre=in.nextLine();
                if (nombre.length()>0){
                    bandera=true;
                }
                else {
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;                       
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto, o no ha ingresado nombre.");
                System.out.println("");
                bandera=false;
            }
            enc.setNombre(nombre);
        }        
    }     

    public static void setDireccionEncargado(Encargado enc){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        String direccion="";
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese la direccion del encargado.");
                direccion=in.nextLine();
                if (direccion.length()>0){
                    bandera=true;
                }
                else {
                    InputMismatchException exception = new InputMismatchException();
                    throw exception;                       
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("El dato ingresado no corresponde el tipo correcto, o no ha ingresado direccion.");
                System.out.println("");
                bandera=false;
            }
            enc.setNombre(direccion);
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

    public static int setEncargadoActividad(Actividad activ, Integer numEnc){
        Scanner in = new Scanner (System.in);
        boolean bandera = false;
        System.out.println("");
        int encarg;
        int elegido=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente al encargado.");
                encarg=in.nextInt();
                if (0<=encarg && encarg<numEnc){
                    bandera=true;
                    elegido=encarg;
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
                System.out.println("El dato ingresado no corresponde a un encargado.");
                System.out.println("");
                bandera=false;
            }
        }
        return elegido;
    }    

    public static int setInspectorInspeccion(Inspeccion activ, Integer numIns){
        Scanner in = new Scanner (System.in);
        boolean bandera = false;
        System.out.println("");
        int insp;
        int elegido=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente al encargado.");
                insp=in.nextInt();
                if (0<=insp && insp<numIns){
                    bandera=true;
                    elegido=insp;
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
                System.out.println("El dato ingresado no corresponde a un inspector.");
                System.out.println("");
                bandera=false;
            }
        }
        return elegido;
    }  
    
    public static int setActividadInspeccion(Inspeccion inspec, Integer numAct){
        Scanner in = new Scanner (System.in);
        boolean bandera = false;
        System.out.println("");
        int activ;
        int elegido=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el numero correspondiente a la actividad.");
                activ=in.nextInt();
                if (0<=activ && activ<numAct){
                    bandera=true;
                    elegido=activ;
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
                System.out.println("El dato ingresado no corresponde a una actividad.");
                System.out.println("");
                bandera=false;
            }
        }
        return elegido;
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

    public static void setComentariosInspeccion(Inspeccion inspec){
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


    public static void setRiesgoEvaluado(Inspeccion inspec){
        Scanner in = new Scanner(System.in);
        boolean bandera=false;
        int riesgo=0;
        while(!bandera){
            try
            {
                System.out.println("Por favor ingrese el riesgo a evaluar.");
                System.out.println("");
                riesgo=in.nextInt();
                if(riesgo==(inspec.getActividad()).getTipoDeRiesgoPrincipal()  ||  (inspec.getActividad()).getTipoDeRiesgoSecundario()==riesgo){
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
                System.out.println("El dato ingresado no corresponde el tipo correcto o no concide con el riesgo principal/secundario de la actividad.");
                System.out.println("");
                bandera=false;
            }
            inspec.setRiesgoEvaluado(riesgo); 
        }        
    }   

    
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al sistema de control de procesos.");
        System.out.println("");     
        Scanner in = new Scanner(System.in);
        int seleccion = -1;
        ContainerInspector inspectores = new ContainerInspector();
        ContainerEncargado encargados = new ContainerEncargado();
        ContainerActividad actividades = new ContainerActividad();
        ContainerInspeccion inspecciones = new ContainerInspeccion();
        while(seleccion!=9){
            
            try{
                    
                System.out.println("╔════════════╗\n"+ 
                                   "║ Elige una opción  ║\n"+
                                   "║                   ╚═════════════╗\n"+ 
                                   "║1 - Registrar inspector                  ║\n"+
                                   "║2 - Registrar encargado                  ║\n"+
                                   "║3 - Registrar actividad                  ║\n"+
                                   "║4 - Registrar inspeccion                 ║\n"+
                                   "║5 - Listado de inspecciones              ║\n"+
                                   "║6 - Listado de actividades con problemas ║\n"+ 
                                   "║7 - Consulta por seccion                 ║\n"+
                                   "║8 - Baja de inspector                    ║\n"+
                                   "║9 - Terminar                             ║\n"+                         
                                   "╚══════════════════════════╝");
                
                seleccion = in.nextInt();
                	
                switch(seleccion){
                case 1: 
			System.out.println("Registro de inspector, recuerde que no puede ingresar mas de un inspector con la misma cedula.");
                        System.out.println("");
                        Inspector insp1 = new Inspector();
                        setNombreInspector(insp1);
                        System.out.println("");
                        setEdadInspector(insp1);
                        setCedulaInspector(insp1);
                        int listSizeIns = inspectores.getInspectores().size();
                        boolean existe = false;
                        for (int i = 0;i<listSizeIns;i++){
                            if (insp1.equals(inspectores.getInspectores().get(i))){
                                existe=true;
                            }
                        }
                        if (existe==false){
                            inspectores.agregarInspector(insp1);
                        }
                        else{
                            System.out.println("Un inspector con esa cedula ya existe. Por favor vuelva a realizar el proceso.");
                        }
		break;
                case 2: 
			System.out.println("Registro de encargado");
                        System.out.println("");
                        Encargado enc1 = new Encargado();
                        setNombreEncargado(enc1);
                        System.out.println("");
                        setEdadEncargado(enc1);
                        System.out.println("");
                        setCedulaEncargado(enc1);
                        System.out.println("");
                        setDireccionEncargado(enc1);
                        encargados.agregarEncargado(enc1);
		break;
                case 3: 
			System.out.println("Registro de actividad");
                        System.out.println("");
                        Actividad activ1 = new Actividad();
                        setSeccionActividad(activ1);
                        setDescripcionActividad(activ1);
                        setDuracionActividad(activ1);
                        setTipoDeRiesgoPrincipal(activ1);
                        setTipoDeRiesgoSecundario(activ1);
                        if ((encargados.getEncargados()).size()>0){
                            System.out.println("Listado de encargados, por favor ingrese el numero del encargado.");
                            System.out.println("");
                            int listSize = encargados.getEncargados().size();
                            for (int i = 0; i<listSize; i++){
                                System.out.println("Encargado numero "+i);
                                System.out.println(encargados.getEncargados().get(i));
                            }
                            int encElegido = setEncargadoActividad(activ1,encargados.getEncargados().size());
                            activ1.setEncargado(encargados.getEncargados().get(encElegido));
                            }
                        else{
                            System.out.println("No hay ningun encargado ingresado al sistema, por favor a continuacion cree uno.");
                            System.out.println("");
                            System.out.println("Registro de encargado");
                            System.out.println("");
                            Encargado enc2 = new Encargado();
                            setNombreEncargado(enc2);
                            System.out.println("");
                            setEdadEncargado(enc2); 
                            setCedulaEncargado(enc2);
                            System.out.println("");
                            setDireccionEncargado(enc2);
                            encargados.agregarEncargado(enc2);
                            activ1.setEncargado(enc2);
                        }
                        actividades.agregarActividad(activ1);
		break;
                case 4: 
			System.out.println("Registro de inspecciones");
                        Inspeccion inspec1 = new Inspeccion();
                        boolean inspectorFueAgregado=false;
                        setDiaInspeccion(inspec1);
                        setMesInspeccion(inspec1);
                        setComentariosInspeccion(inspec1);
                        setHoraInspeccion(inspec1);
                        setResultadoInspeccion(inspec1);
                        if ((inspectores.getInspectores()).size()>0){
                            inspectorFueAgregado=true;
                            int listSizeIn = inspectores.getInspectores().size();
                            for (int i = 0; i<listSizeIn;i++){
                                System.out.println("Inspector numero "+i);
                                System.out.println(inspectores.getInspectores().get(i));
                            }
                            int insElg=setInspectorInspeccion(inspec1,inspecciones.getInspecciones().size());
                            inspec1.setInspector(inspectores.getInspectores().get(insElg));
                        }
                        else{
                            System.out.println("No hay ningun inspector ingresado al sistema, por favor a continuacion cree uno.");
                            System.out.println("");
                            System.out.println("Registro de inspector");
                            System.out.println("");
                            Inspector insp3 = new Inspector();
                            setNombreInspector(insp3);
                            System.out.println("");
                            setEdadInspector(insp3);
                            System.out.println("");
                            setCedulaInspector(insp3);
                            System.out.println("");                            
                            int listSizeInsInsp = inspectores.getInspectores().size();
                            boolean existeInsp = false;
                            for (int i = 0;i<listSizeInsInsp;i++){
                                if (insp3.equals(inspectores.getInspectores().get(i))){
                                    existeInsp=true;
                                }
                            }
                            if (existeInsp==false){
                                inspectores.agregarInspector(insp3);
                                inspec1.setInspector(insp3);
                                inspectorFueAgregado=true;
                            }
                            else{
                                System.out.println("Un inspector con esa cedula ya existe. Por favor vuelva a realizar el proceso.");
                            }
                        }
                        if (inspectorFueAgregado==true){
                            if ((actividades.getActividades()).size()>0){
                                int listSizeAct=actividades.getActividades().size();
                                for (int i=0;i<listSizeAct;i++){
                                    System.out.println("Actividad numero "+i);
                                    System.out.println(actividades.getActividades().get(i));
                                }
                                int actElg=setActividadInspeccion(inspec1,actividades.getActividades().size());
                                inspec1.setActividad(actividades.getActividades().get(actElg));
                            }
                            else{
                                System.out.println("No hay ninguna actividad ingresado al sistema, por favor a continuacion cree una.");
                                System.out.println("");
                                System.out.println("Registro de actividad");
                                System.out.println("");
                                Actividad activ4 = new Actividad();
                                setSeccionActividad(activ4);
                                setDescripcionActividad(activ4);
                                setDuracionActividad(activ4);
                                setTipoDeRiesgoPrincipal(activ4);
                                setTipoDeRiesgoSecundario(activ4);
                                if ((encargados.getEncargados()).size()>0){
                                    //MOSTRAR LOS ENCARGADOS Y PEDIR ELEGIR UNO
                                }
                                else{
                                    System.out.println("No hay ningun encargado ingresado al sistema, por favor a continuacion cree uno.");
                                    System.out.println("");
                                    System.out.println("Registro de encargado");
                                    System.out.println("");
                                    Encargado enc2 = new Encargado();
                                    setNombreEncargado(enc2);
                                    setEdadEncargado(enc2); 
                                    setCedulaEncargado(enc2);
                                    setDireccionEncargado(enc2);
                                    encargados.agregarEncargado(enc2);
                                    activ4.setEncargado(enc2);
                                }
                                actividades.agregarActividad(activ4);
                                inspec1.setActividad(activ4);
                            }
                            setRiesgoEvaluado(inspec1);
                            inspecciones.agregarInspeccion(inspec1);
                        }
		break;
                case 5: 
			System.out.println("Listado de inspecciones");
                        System.out.println("");
                        Collections.sort(inspecciones.getInspecciones());
                        int listSize = inspecciones.getInspecciones().size();
                        for (int i = 0; i<listSize; i++){
                            System.out.println("Inspeccion numero "+i);
                            System.out.println(inspecciones.getInspecciones().get(i));
                        }
                break;
                case 6:
                        System.out.println("Listado de actividades con problemas");
                break;
                case 7:
                        System.out.println("Consulta por seccion");
                break;
                case 8:
                        System.out.println("Baja de inspector");
                break;
                case 9:
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
