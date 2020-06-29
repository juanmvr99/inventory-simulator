package procesos;

public class Distribucion {
    //clase para manejar las distribuciones de probabilidad de los datos de entrada
    //las probabilidades se ingresan en porcentajes de 1 a 100
    
    private int valor;
    private float probabilidad;
    private float probAcumulada;

    public Distribucion(int valor, float probabilidad) {
        this.valor = valor;
        this.probabilidad = probabilidad;
    }
    
       
    @Override
    public String toString() {
        return String.format(" " + valor + " - " + probabilidad + " - " + probAcumulada + "\n");
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public float getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(float probDemanda) {
        this.probabilidad = probDemanda;
    }

    public float getProbAcumulada() {
        return probAcumulada;
    }

    public void setProbAcumulada(float probAcumulada) {
        this.probAcumulada = probAcumulada;
    }
    
    
}
