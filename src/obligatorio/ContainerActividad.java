
package obligatorio;

import java.util.ArrayList;


public class ContainerActividad {

    private ArrayList<Actividad> actividades;
    
    public ContainerActividad(){
        actividades= new ArrayList<>();
    }
    
    public boolean agregarActividad(Actividad activ){
        actividades.add(activ);
        return true;
    }
    
    public ArrayList<Actividad> getActividades(){
        return this.actividades;
    }
    
    public Actividad buscarActividad(Actividad unaActividadBuscada)
    {
        int posicion = this.getActividades().indexOf(unaActividadBuscada);
        Actividad retorno = null;        
        if(posicion >= 0)
        {
            retorno = this.getActividades().get(posicion);
        }
        
        return retorno;
    }    
    
}
