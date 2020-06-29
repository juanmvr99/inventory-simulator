package procesos;

import java.util.ArrayList;

public class Tiempos {
    //esta clase maneja las tablas de distribuciones de las demandas, esperas y entregas
    
    public final static ArrayList<Distribucion> demandas = new ArrayList();
    public final static ArrayList<Distribucion> esperas = new ArrayList();
    public final static ArrayList<Distribucion> entregas = new ArrayList();
   
    //en este bloque por ahora se inicializan todas las tablas de distrubuciones con valores hardcodeados
    static {
        System.out.println("entrando al bloque estatico...");
        
        //se demandan 10 unidades el 4% de las veces y asi...
        demandas.add(new Distribucion(10, 4));
        demandas.add(new Distribucion(20, 6));
        demandas.add(new Distribucion(30, 20));
        demandas.add(new Distribucion(40, 25));
        demandas.add(new Distribucion(50, 25));
        demandas.add(new Distribucion(60, 20));
        
        //el tiempo de entrega es de 1 dia el 20% de las veces y asi...
        entregas.add(new Distribucion(1, 20));
        entregas.add(new Distribucion(2, 30));
        entregas.add(new Distribucion(3, 25));
        entregas.add(new Distribucion(4, 25));
        
        //el cliente espera 0 dias el 40% de las veces...
        esperas.add(new Distribucion(0, 40));
        esperas.add(new Distribucion(1, 20));
        esperas.add(new Distribucion(2, 15));
        esperas.add(new Distribucion(3, 15));
        esperas.add(new Distribucion(4, 10));
        
        calcularProbAcumulada();
    }
    
    public Tiempos() {
       
    }
    
    private static void calcularProbAcumulada() {
        float acum = 0;
        
        //recorrer los arraylists e ir asignando las probabilidades acumuladas de cada valor
        for (Distribucion i : demandas) {
            acum = acum + i.getProbabilidad();
            i.setProbAcumulada(acum);
        }
        
        acum = 0;  
        
        for (Distribucion i : entregas) {
            acum = acum + i.getProbabilidad();
            i.setProbAcumulada(acum);
        }
        
        acum = 0;
        
        for (Distribucion i : esperas) {
            acum = acum + i.getProbabilidad();
            i.setProbAcumulada(acum);
        }
    }
    
}
