
package obligatorio;  


public class Actividad implements Comparable<Actividad> {
    private int seccion;
    private String descripcion;
    private int duracion;
    private int tipoDeRiesgoPrincipal;
    private int tipoDeRiesgoSecundario;
    private Encargado encargado;
    private boolean impreso;

    
    protected String RiesgoPrincipalAString(){
    String tipoRiesgoPrincipal = null;
    switch (this.getTipoDeRiesgoPrincipal()) {
        case 1:
            tipoRiesgoPrincipal="Riesgo fisico";
            break;
        case 2:
            tipoRiesgoPrincipal="Riesgo quimico";
            break;
        case 3:
            tipoRiesgoPrincipal="Riesgo biologico";
            break;
        case 4:
            tipoRiesgoPrincipal="Riesgo sicosocial";
            break;
    }
    return tipoRiesgoPrincipal;    
    } 

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
    
    
    protected String RiesgoSecundarioAString(){
    String tipoRiesgoSecundario = null;
    switch (this.getTipoDeRiesgoSecundario()) {
        case 1:
            tipoRiesgoSecundario="Riesgo fisico";
            break;
        case 2:
            tipoRiesgoSecundario="Riesgo quimico";
            break;
        case 3:
            tipoRiesgoSecundario="Riesgo biologico";
            break;
        case 4:
            tipoRiesgoSecundario="Riesgo sicosocial";
            break;
    }
    return tipoRiesgoSecundario;    
    }
    
    @Override
    public String toString(){
        return "Seccion: "+this.getSeccion()+"\n"+"Descripcion: "+this.getDescripcion()+"\n"
                +"Duracion: "+this.getDuracion()+"\n"+"Tipo de riesgo principal: "
                +this.RiesgoPrincipalAString()+"\n"+"Tipo de riesgo secundario: "
                +this.RiesgoSecundarioAString()+"\n";
    }

    @Override
    public boolean equals(Object o)
    {
        Actividad unaActividad = (Actividad)o;
        return this.getSeccion()==unaActividad.getSeccion();
    }
    
    @Override
    public int compareTo(Actividad o) 
    {
        int resultado = this.getSeccion()-o.getSeccion();
        return resultado;
    }
    
    public int getSeccion() {
        return seccion;
    }

    public int getTipoDeRiesgoSecundario() {
        return this.tipoDeRiesgoSecundario;
    }

    public void setTipoDeRiesgoSecundario(int tipoDeRiesgoSecundario) {
        this.tipoDeRiesgoSecundario = tipoDeRiesgoSecundario;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTipoDeRiesgoPrincipal() {

        return this.tipoDeRiesgoPrincipal;
    }

    public void setTipoDeRiesgoPrincipal(int tipoDeRiesgo) {
        this.tipoDeRiesgoPrincipal = tipoDeRiesgo;
    }

    public Actividad() {
        this.impreso=false;
        this.tipoDeRiesgoPrincipal=-1;
        this.tipoDeRiesgoSecundario=-1;
    }

    public boolean getImpreso() {
        return impreso;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }
    
}
