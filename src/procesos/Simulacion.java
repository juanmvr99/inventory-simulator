
package procesos;

//En esta clase se hara la simulacion durante tantos dias se indique

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Simulacion {
    private int Q;
    private int R;
    private double costoTotalFaltantes;
    private double faltantesConEspera;
    private double faltantesSinEspera;
    
    public Simulacion(){
        Q = 0;
        R = 0;
    }
    
    public Simulacion(int _q, int _r) {
        this.Q = _q;
        this.R = _r;
        this.costoTotalFaltantes = 0; 
        this.faltantesConEspera = 0;
        this.faltantesSinEspera = 0;
        iniciarSimulacion();
    }
    
    //aqui se va iterando dia a dia generando la tabla de eventos
    private void iniciarSimulacion() {
        int dia = 1; 
        int diaEntrega = 0, nroOrden = 0;
        int invInicial = Constantes.inventarioInicial;
        int invFinal = Constantes.inventarioInicial;
        int faltante = 0;
        int demanda, tEntrega, tEspera, diaLimiteEspera;
        double invPromedio = 0, acumInvPromedio = 0;
        boolean hayFaltante = false;
        boolean hayOrdenPendiente = false;
        //cola de los faltantes con sus esperas asociadas
        Queue<EstructuraFaltantes> listaFaltantes = new LinkedList();
        
        while (dia <= Constantes.numeroDias) {
            
            //determinar el inventario Inicial  
            invInicial = invFinal; // = al invFinal del dia anterior
            if (dia == diaEntrega) {
                invInicial += this.Q;
                hayOrdenPendiente = false;
            }
            
            //revisar los faltantes pendientes y actualizar costos
            if (!listaFaltantes.isEmpty()) 
                invInicial = manejarFaltantes(listaFaltantes, dia, invInicial);
            
            //determinar demanda del dia
            demanda = Calculos.obtenerValor(Constantes.demandas);
            
            //realizar las ventas posibles
            if (demanda <= invInicial) {
                hayFaltante = false;
                faltante = 0;
                invFinal = invInicial - demanda;
                invPromedio = (double)(invInicial + invFinal) / 2;
            } else {
                hayFaltante = true;
                invFinal = 0;
                invPromedio = (double)invInicial / 2;
                faltante = demanda - invInicial;
            }
            
            //Sumar el inventario promedio al acumulador
            acumInvPromedio += invPromedio;
            
             //manejar la espera existente con las colas
             if (hayFaltante) {
                tEspera = Calculos.obtenerValor(Constantes.esperas);
                 //System.out.println("hay "+faltante+" faltantes que esperaran "+tEspera);
                if (tEspera > 0) {
                    diaLimiteEspera = dia + tEspera;
                    EstructuraFaltantes f = new EstructuraFaltantes(faltante, tEspera, diaLimiteEspera);
                    listaFaltantes.add(f);
                } else {
//                    this.costoTotalFaltantes += faltante * Constantes.costoFaltanteSinEspera;
                    this.faltantesSinEspera += faltante;
                    //System.out.println("costoFaltantes += "+faltante+"*"+Constantes.costoFaltanteSinEspera);
                    faltante = 0;
                }
             }
            
            //determinar si se necesita pedir una orden
            if (invFinal <= this.R && !hayOrdenPendiente) {
                hayOrdenPendiente = true;
                nroOrden++;
                tEntrega = Calculos.obtenerValor(Constantes.entregas);
                diaEntrega = dia + tEntrega + 1;
                //System.out.println("se pidio la orden "+nroOrden+ " que tardara "+tEntrega);
            }
            
            hayFaltante = false;
            dia++;
        }
        guardarResultados(acumInvPromedio, nroOrden);
    }
    
    public String[][] simulacionFinal(int q, int r) {
        this.Q = q;
        this.R = r;
        
        int dia = 1; 
        int diaEntrega = 0, nroOrden = 0;
        int invInicial = Constantes.inventarioInicial;
        int invFinal = Constantes.inventarioInicial;
        int faltante = 0;
        int tEntrega = 0;
        int tEspera = 0;
        int demanda, diaLimiteEspera;
        double invPromedio = 0, acumInvPromedio = 0;
        boolean hayFaltante = false;
        boolean hayOrdenPendiente = false;
        
        String tabla[][] = new String[Constantes.numeroDias][9]; 
        
        //cola de los faltantes con sus esperas asociadas
        Queue<EstructuraFaltantes> listaFaltantes = new LinkedList();
        
        //ciclo de iteracion (tabla de eventos)
        while (dia <= Constantes.numeroDias) {
            
            //determinar el inventario Inicial  
            invInicial = invFinal; // = al invFinal del dia anterior
            if (dia == diaEntrega) {
                invInicial += this.Q;
                hayOrdenPendiente = false;
            }
            
            //revisar los faltantes pendientes y actualizar costos
            if (!listaFaltantes.isEmpty()) 
                invInicial = manejarFaltantes(listaFaltantes, dia, invInicial);
            
            //determinar demanda del dia
            demanda = Calculos.obtenerValor(Constantes.demandas);
            
            //realizar las ventas posibles
            if (demanda <= invInicial) {
                hayFaltante = false;
                faltante = 0;
                invFinal = invInicial - demanda;
                invPromedio = (double)(invInicial + invFinal) / 2;
            } else {
                hayFaltante = true;
                invFinal = 0;
                invPromedio = (double)invInicial / 2;
                faltante = demanda - invInicial;
            }
            
            //Sumar el inventario promedio al acumulador
            acumInvPromedio += invPromedio;
            
             //manejar la espera existente con las colas
             if (hayFaltante) {
                tEspera = Calculos.obtenerValor(Constantes.esperas);
                tabla[dia-1][5] = String.valueOf(faltante);
                tabla[dia-1][8] = String.valueOf(tEspera);
                if (tEspera > 0) {
                    diaLimiteEspera = dia + tEspera;
                    EstructuraFaltantes f = new EstructuraFaltantes(faltante, tEspera, diaLimiteEspera);
                    listaFaltantes.add(f);
                } else {
//                    this.costoTotalFaltantes += faltante * Constantes.costoFaltanteSinEspera;
                    this.faltantesSinEspera += faltante;
                    faltante = 0;
                }
            }else{
                tabla[dia-1][5] = " ";
                tabla[dia-1][8] = " ";
             }
            
            //determinar si se necesita pedir una orden
            if (invFinal <= this.R && !hayOrdenPendiente) {
                hayOrdenPendiente = true;
                nroOrden++;
                tEntrega = Calculos.obtenerValor(Constantes.entregas);
                diaEntrega = dia + tEntrega + 1;
                tabla[dia-1][6] = String.valueOf(nroOrden);
                tabla[dia-1][7] = String.valueOf(tEntrega);
            }else{
                tabla[dia-1][6] = " ";
                tabla[dia-1][7] = " ";
            }
            tabla[dia-1][0] = String.valueOf(dia);
            tabla[dia-1][1] = String.valueOf(invInicial);
            tabla[dia-1][2] = String.valueOf(demanda);
            tabla[dia-1][3] = String.valueOf(invFinal);
            tabla[dia-1][4] = String.valueOf(invPromedio);
            hayFaltante = false;
            dia++;
        }
        guardarResultados(acumInvPromedio, nroOrden);
        return(tabla);
    }
   
    //funcion para revisar y manipular la cola de faltantes al inicio de cada dia, retorna el inventario inicial del dia despues de satisfechas todas las ventas atrasadas
    private int manejarFaltantes(Queue<EstructuraFaltantes> listaFaltantes, int dia, int invInicial) {
        Iterator<EstructuraFaltantes> iter = listaFaltantes.iterator();

        while (iter.hasNext()) {
            EstructuraFaltantes cur = iter.next();
            
            if (dia > cur.getDiaLimite()) {
                //se canso de esperar y perdio la venta
//                this.costoTotalFaltantes += cur.getFaltante() * Constantes.costoFaltanteSinEspera;
                this.faltantesSinEspera += cur.getFaltante();
                iter.remove();
            } else {
                if (invInicial >= cur.getFaltante()) {
                    //se satisface la venta tardia completa
                    invInicial -= cur.getFaltante();
//                    this.costoTotalFaltantes += cur.getFaltante() * Constantes.costoFaltanteConEspera;
                    this.faltantesConEspera += cur.getFaltante();
                    iter.remove();
                } else {
                    //se satisface parcialmente la venta tardia o no hay inventario
                    int cantSobrante = cur.getFaltante() - invInicial;
                    int cantVendida = cur.getFaltante() - cantSobrante;
                    invInicial = 0;
                    cur.setFaltante(cantSobrante);
//                    this.costoTotalFaltantes +=  cantVendida * Constantes.costoFaltanteConEspera;
                    this.faltantesConEspera += cantVendida;
                }
            }
        }
        return invInicial; //lo que quedo para la demanda del dia
    }
    
    //funcion para registrar los resultados finales de la simualcion
    private void guardarResultados(double totalInvPromedio, int totalOrdenes) {
        double costoTotalInventario = 0, costoTotalCompra = 0, costoTotalOrden = 0, costoTotal = 0;
        
        //pasar el costo de inventario anual al equivalente de unidad de tiempo de la simulacion
        if (Constantes.unidadTiempo.equals("Dias")) {
            costoTotalInventario = totalInvPromedio * (Constantes.costoInventario/360);
        } else if (Constantes.unidadTiempo.equals("Semanas")) {
            costoTotalInventario = totalInvPromedio * (Constantes.costoInventario/52);
        } else if (Constantes.unidadTiempo.equals("Meses")) {
            costoTotalInventario = totalInvPromedio * (Constantes.costoInventario/12);
        } else if (Constantes.unidadTiempo.equals("Bimestres")) {
            costoTotalInventario = totalInvPromedio * (Constantes.costoInventario/6);
        } else if (Constantes.unidadTiempo.equals("Trimestres")) {
            costoTotalInventario = totalInvPromedio * (Constantes.costoInventario/4);
        }
        
        costoTotalCompra = Constantes.costoCompra * this.Q * totalOrdenes;
        
        costoTotalOrden = Constantes.costoOrden * totalOrdenes;
        
        double totalConEspera = this.faltantesConEspera * Constantes.costoFaltanteConEspera;
        double totalSinEspera = this.faltantesSinEspera * Constantes.costoFaltanteSinEspera;
        double totalFaltantes = totalConEspera + totalSinEspera;
        
        costoTotal = costoTotalInventario + costoTotalCompra + costoTotalOrden + totalFaltantes;
        
        //guardar el resultado de la simulacion
        EstructuraResultados salida = new EstructuraResultados(this.Q, this.R, costoTotalInventario, costoTotalOrden, costoTotalCompra, totalFaltantes, costoTotal, totalConEspera, totalSinEspera);
        Constantes.resultados.add(salida);
    }
}
