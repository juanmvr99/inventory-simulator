package procesos;

public class Espera {
    private int tiempoEspera;
    private float probabilidad;
    private float probAcumulada;

    public Espera() {
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public float getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(float probabilidad) {
        this.probabilidad = probabilidad;
    }

    public float getProbAcumulada() {
        return probAcumulada;
    }

    public void setProbAcumulada(float probAcumulada) {
        this.probAcumulada = probAcumulada;
    }
  
    
}
