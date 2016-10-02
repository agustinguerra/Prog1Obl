/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio; 

/**
 *
 * @author Agustin
 */
public class Inspector {
    private String nombre;
    private int edad;
    private String cedula;
    
    public void errorDatos(){
        System.out.println("Los datos que usted ingreso no son correctos.");
    }
    
    public void setNombre(String nomb){
        this.nombre=nomb;
    }
    public void setEdad(int anios){
        this.edad=anios;
    }
    public void setCedula(String ced){
        this.cedula=ced;
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
    public void corroborarDatosCedula(String ced){                //Metodo para corroborar que la cedula ingresada tenga el formato y largo correcto
        if (ced.matches("[0-9]+") && ((ced.length()==8)||(ced.length()==7))){
            setCedula(ced);
        }
        else
        {
            errorDatos();
        }
    }
    public Inspector(){
        
    }
    
}
