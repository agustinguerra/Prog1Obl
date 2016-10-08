
package obligatorio; 

import java.util.Scanner;


public class Inspector {
    private String nombre;
    private int edad;
    private String cedula;
    
  
    
    public void setNombre(String nomb){
        this.nombre=nomb;
    }
    public void setEdad(int anios){
        this.edad=anios;
    }
    public void setCedula(){
        boolean bandera=false;
        Scanner in= new Scanner(System.in);
        System.out.println("Por favor ingrese la cedula del inspector.");
        System.out.println("");
        while(!bandera){
            String ced=in.nextLine();
            if (ced.matches("[0-9]+") && ((ced.length()==8)||(ced.length()==7))){
                this.cedula=ced;
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
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getCedula(){
        return this.cedula;
    }

    public Inspector(){
        
    }
    
}
