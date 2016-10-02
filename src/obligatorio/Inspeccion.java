
package obligatorio; 


public class Inspeccion {
    private Inspector inspec;
    private Actividad activ;
    private int dia;
    private int mes;
    private float horas;
    private String riesgoEvaluado;
    private boolean resultado;

    public Inspector getInspec() {
        return inspec;
    }

    public void setInspec(Inspector inspec) {
        this.inspec = inspec;
    }

    public Actividad getActiv() {
        return activ;
    }

    public void setActiv(Actividad activ) {
        this.activ = activ;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public String getRiesgoEvaluado() {
        return riesgoEvaluado;
    }

    public void setRiesgoEvaluado(String riesgoEvaluado) {
        this.riesgoEvaluado = riesgoEvaluado;
    }

    public boolean getResultado() {
        return resultado;
    }



    public void setResultado(String resultado) {
        if (resultado.equals("Aprobada")){
            this.resultado = true;
        }
        else if (resultado.equals("Rechazada")){
            this.resultado = false;
        }
        else{
            System.out.println("No fue ingresada la palabra Aprobada o Rechazada.");
        }
    }
    
    public Inspeccion() {
    }
}
