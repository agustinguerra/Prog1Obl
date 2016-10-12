
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

    public String getTipoDeRiesgoSecundario() {
        String tipoRiesgoSecundario = null;
        switch (this.tipoDeRiesgoSecundario) {
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

    public String getTipoDeRiesgoPrincipal() {
        String tipoRiesgoPrincipal = null;
        switch (this.tipoDeRiesgoPrincipal) {
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

    public void setTipoDeRiesgoPrincipal(int tipoDeRiesgo) {
        this.tipoDeRiesgoPrincipal = tipoDeRiesgo;
    }

    public Actividad() {
    }
    
}
