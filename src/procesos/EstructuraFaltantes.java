package procesos;

/*Clase para manejar las unidades de inventario faltantes junto con su tiempo de espera*/
public class EstructuraFaltantes {
    private int faltante;
    private int diasEspera;
    private int diaLimite;

    public EstructuraFaltantes(int faltante, int diasEspera, int diaLimite) {
        this.faltante = faltante;
        this.diasEspera = diasEspera;
        this.diaLimite = diaLimite;
    }

    public String toString() {
        return "("+faltante+", "+diaLimite+")";
    }
    
    public int getDiaLimite() {
        return diaLimite;
    }

    public void setDiaLimite(int diaLimite) {
        this.diaLimite = diaLimite;
    }

    public int getFaltante() {
        return faltante;
    }

    public void setFaltante(int faltante) {
        this.faltante = faltante;
    }

    public int getDiasEspera() {
        return diasEspera;
    }

    public void setDiasEspera(int diasEspera) {
        this.diasEspera = diasEspera;
    }
    
}
