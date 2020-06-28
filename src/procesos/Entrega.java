package procesos;

public class Entrega {
    private int tiempoEntrega;
    private float probabilidad;
    private float probAcumulada;

    public int getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(int tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
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
