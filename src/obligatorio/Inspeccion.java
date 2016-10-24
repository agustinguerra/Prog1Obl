
package obligatorio; 


public class Inspeccion {
    private Inspector inspec;
    private Actividad activ;
    private int dia;
    private int mes;
    private int horas;
    private int riesgoEvaluado;
    private boolean resultado;
    private String comentarios;
    
    @Override
    public String toString(){
        return "Inspector: "+this.getInspector()+"\n"+"Actividad"+"\n"+this.getActividad()+"\n"
                +"Dia: "+this.getDia()+"\n"+"Mes: "+this.getMes()+"\n"+"Horas: "+this.getHoras()+"\n"
                +"Riesgo Evaluado: "+this.getRiesgoEvaluado()+"\n"+"Resultado: "+this.resultadoAString()+"\n"
                +"Comentarios: "+this.getComentarios()+"\n";
    }
    

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Inspector getInspector() {
        return inspec;
    }

    public void setInspector(Inspector inspec) {
        this.inspec = inspec;
    }

    public Actividad getActividad() {
        return activ;
    }

    public void setActividad(Actividad activ) {
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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getRiesgoEvaluado() {
        return riesgoEvaluado;
    }

    public void setRiesgoEvaluado(int riesgoEvaluado) {
        this.riesgoEvaluado = riesgoEvaluado;
    }

    public boolean getResultado() {
        return resultado;
    }

    public String resultadoAString(){
        if (this.resultado==true){
            return "Aprobada";
        }
        else{
            return "No aprobada";
        }
    }

    public void setResultado(int resultado){
        this.resultado = resultado==1;
    }
    
    public Inspeccion() {
    }
}
