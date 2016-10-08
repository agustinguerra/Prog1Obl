
package obligatorio;  


public class Actividad {
    private int seccion;
    private String descripcion;
    private int duracion;
    private int tipoDeRiesgo;

    public int getSeccion() {
        return seccion;
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

    public String getTipoDeRiesgo() {
        String tipoRiesgo = null;
        switch (this.tipoDeRiesgo) {
            case 1:
                tipoRiesgo="Riesgo fisico";
                break;
            case 2:
                tipoRiesgo="Riesgo quimico";
                break;
            case 3:
                tipoRiesgo="Riesgo biologico";
                break;
            case 4:
                tipoRiesgo="Riesgo sicosocial";
                break;
        }
        return tipoRiesgo;
    }

    public void setTipoDeRiesgo(int tipoDeRiesgo) {
        this.tipoDeRiesgo = tipoDeRiesgo;
    }

    public Actividad() {
    }
    
}
