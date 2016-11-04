
package obligatorio;

import java.util.ArrayList;

public class ContainerEncargado {

    private ArrayList<Encargado> encargados;
    
    public ContainerEncargado(){
        encargados= new ArrayList<>();
    }
    
    public boolean agregarEncargado(Encargado enc){
        encargados.add(enc);
        return true;
    }
    
    public ArrayList<Encargado> getEncargados(){
        return this.encargados;
    }
    
    public Encargado buscarInspector(Inspector unEncargadoBuscado)
    {
        int posicion = this.getEncargados().indexOf(unEncargadoBuscado);
        Encargado retorno = null;
        if(posicion >= 0)
        {
            retorno = this.getEncargados().get(posicion);
        }
        return retorno;
    }    
    
}
