
package obligatorio;  


public class Actividad {
    private int seccion;
    private String descripcion;
    private int duracion;
    private int tipoDeRiesgoPrincipal;
    private int tipoDeRiesgoSecundario;

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
        this.tipoDeRiesgoPrincipal=-1;
        this.tipoDeRiesgoSecundario=-1;
    }
    
}
