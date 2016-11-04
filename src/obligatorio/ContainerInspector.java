
package obligatorio;

import java.util.ArrayList;


public class ContainerInspector {
    
    private ArrayList<Inspector> inspectores;
    
    public ContainerInspector(){
        inspectores= new ArrayList<>();
    }
    
    public boolean agregarInspector(Inspector inspec){
        inspectores.add(inspec);
        return true;
    }
    
    public ArrayList<Inspector> getInspectores(){
        return this.inspectores;
    }
    
    public Inspector buscarInspector(Inspector unInspectorBuscado)
    {
        int posicion = this.getInspectores().indexOf(unInspectorBuscado);
        Inspector retorno = null;
        
        if(posicion >= 0)
        {
            retorno = this.getInspectores().get(posicion);
        }
        
        return retorno;
    }    
    
}
