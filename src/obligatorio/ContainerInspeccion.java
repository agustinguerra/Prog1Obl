
package obligatorio;

import java.util.ArrayList;


public class ContainerInspeccion {

    private ArrayList<Inspeccion> inspecciones;
    
    public ContainerInspeccion(){
        inspecciones= new ArrayList<>();
    }
    
    public boolean agregarInspeccion(Inspeccion inspec){
        inspecciones.add(inspec);
        return true;
    }
    
    public ArrayList<Inspeccion> getInspecciones(){
        return this.inspecciones;
    }
    
    public Inspeccion buscarInspeccion(Inspeccion unaInspeccionBuscada)
    {
        int posicion = this.getInspecciones().indexOf(unaInspeccionBuscada);
        Inspeccion retorno = null;        
        if(posicion >= 0)
        {
            retorno = this.getInspecciones().get(posicion);
        }
        
        return retorno;
    }    
    
    
}
