package procesos;

//clase para manejar los resultados finales de una simulacion
public class EstructuraResultados {
    private int Q;
    private int R;
    private double costoInventario;
    private double costoOrden;
    private double costoCompra;
    private double faltantesConEspera;
    private double faltantesSinEspera;
    private double costoFaltante;
    private double costoTotal;

    public EstructuraResultados(int Q, int R, double costoInventario, double costoOrden, double costoCompra, double costoFaltante, double costoTotal, double conEspera, double sinEspera) {
        this.Q = Q;
        this.R = R;
        this.costoInventario = costoInventario;
        this.costoOrden = costoOrden;
        this.costoCompra = costoCompra;
        this.costoFaltante = costoFaltante;
        this.costoTotal = costoTotal;
        this.faltantesConEspera = conEspera;
        this.faltantesSinEspera = sinEspera;
    }

    public EstructuraResultados() {
        this.Q = 0;
        this.R = 0;
        this.costoInventario = 0;
        this.costoOrden = 0;
        this.costoCompra = 0;
        this.costoFaltante = 0;
        this.costoTotal = 99999999;
    }
    
    public String toString() {
        return "Q: "+this.Q+" R: "+this.R+"\n"+
                "costo Inventario: "+this.costoInventario+"\n"+
                "costo Orden: "+this.costoOrden+"\n"+
                "costo Compra: "+this.costoCompra+"\n"+
                "costo Faltantes: "+this.costoFaltante+"\n"+
                "costo Total: "+this.costoTotal+"\n"+
                "------------------------------------\n";
    }

    public double getFaltantesConEspera() {
        return faltantesConEspera;
    }

    public void setFaltantesConEspera(double faltantesConEspera) {
        this.faltantesConEspera = faltantesConEspera;
    }

    public double getFaltantesSinEspera() {
        return faltantesSinEspera;
    }

    public void setFaltantesSinEspera(double faltantesSinEspera) {
        this.faltantesSinEspera = faltantesSinEspera;
    }

    public int getQ() {
        return Q;
    }

    public void setQ(int Q) {
        this.Q = Q;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public double getCostoInventario() {
        return costoInventario;
    }

    public void setCostoInventario(double costoInventario) {
        this.costoInventario = costoInventario;
    }

    public double getCostoOrden() {
        return costoOrden;
    }

    public void setCostoOrden(double costoOrden) {
        this.costoOrden = costoOrden;
    }

    public double getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(double costoCompra) {
        this.costoCompra = costoCompra;
    }

    public double getCostoFaltante() {
        return costoFaltante;
    }

    public void setCostoFaltante(double costoFaltante) {
        this.costoFaltante = costoFaltante;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
}
