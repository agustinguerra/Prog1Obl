
package obligatorio; 


public class Inspector extends Persona implements Comparable<Inspector> {

    private boolean ocupado;

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.getNombre()+"\n"+"Edad: "+this.getEdad()+"\n"
                +"Cedula: "+this.getCedula()+"\n";
    }
    
    @Override
    public boolean equals(Object o)
    {
        Inspector unInspector = (Inspector)o;
        return this.getCedula().equals(unInspector.getCedula());
    }
    
    @Override
    public int compareTo(Inspector o) 
    {
        int resultado = this.getCedula().compareTo(o.getCedula());
        return resultado;
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
        this.ocupado=false;
    }

    
}
