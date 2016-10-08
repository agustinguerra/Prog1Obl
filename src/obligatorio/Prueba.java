
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
                bandera=true;
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
  
   
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de control de procesos.");
        System.out.println("");
        System.out.println("A continuacion se definiran dos actividades y un inspector.");
        System.out.println("");
        System.out.println("Por favor ingrese los datos correspondientes al inspector.");
        System.out.println("");
        Inspector inspector1 = new Inspector();
        setEdadInspector(inspector1);
        System.out.println("");
        setNombreInspector(inspector1);
        inspector1.setCedula();
    }
    
}
