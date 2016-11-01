
package obligatorio; 


public class Inspector extends Persona {

    
    @Override
    public String toString(){
        return "Nombre: "+this.getNombre()+"\n"+"Edad: "+this.getEdad()+"\n"
                +"Cedula: "+this.getCedula()+"\n";
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

    public Inspector(){
        
    }
    
}
