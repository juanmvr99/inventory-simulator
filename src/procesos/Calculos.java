package procesos;

import java.util.ArrayList;
import java.util.Random;


/*Clase para manejar calculos generales del modelo*/
public class Calculos {

    public Calculos() {
    }

    //funcion para calcular el pedido optimo dado D, K, H, s
    public static int calcularQ(int demanda, double costoPedido, double costoAlmacenamiento, double costoEscasez) {

        double result = Math.sqrt((2 * costoPedido * demanda * (costoAlmacenamiento + costoEscasez)) / (costoAlmacenamiento * costoEscasez));
        return (int)result;
    }

    //funcion para calcular el punto de retorno dado D, L y Q
    public static int calcularR(int demanda, double tEntrega, double Q) {
        double t0 = Q / demanda;
        int N = 0;

        if (tEntrega >= t0) {
            N = (int) (tEntrega / t0);
            tEntrega = tEntrega - (N * t0);
        }

        return (int) (tEntrega * demanda);
    }
    
    //funcion para asignar las probabilidades acumuladas a cada valor de las distribuciones
    public static void calcularProbAcumulada() {
        double acum = 0;
        
        for (Distribucion i : Constantes.demandas) {
            acum = acum + i.getProbabilidad();
            i.setProbAcumulada(acum);
        }
        
        acum = 0;  
        
        for (Distribucion i : Constantes.entregas) {
            acum = acum + i.getProbabilidad();
            i.setProbAcumulada(acum);
        }
        
        acum = 0;
        
        for (Distribucion i : Constantes.esperas) {
            acum = acum + i.getProbabilidad();
            i.setProbAcumulada(acum);
        }
    }
    
    //funcion para decidir el mejor resultado de las simulaciones (menor costo total)
    public static EstructuraResultados determinarMejorCaso() {
        EstructuraResultados aux = new EstructuraResultados();
        
        for (EstructuraResultados i : Constantes.resultados) {
            if (i.getCostoTotal() < aux.getCostoTotal()) {
                aux = i;
            }
        }
        
        System.out.println("El mejor resultado fue:");
        System.out.println(aux);
        return(aux);
    }

    //funcion para determinar la demanda/entrega/espera aleatoriamente
    public static int obtenerValor(ArrayList<Distribucion> distrib) {
        int random = generarAleatorio();
        
        for (Distribucion i : distrib) {
            if (random <= i.getProbAcumulada()) {
                return i.getValor();
            }
        }

        //si hubo algun error
        return -1;
    }

    //funcion para generar el numero aleatorio de 1 a 100
    public static int generarAleatorio() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }
}
