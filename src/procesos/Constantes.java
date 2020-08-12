package procesos;

import java.util.ArrayList;

//clase para manejar las constantes y tablas de distribuciones ingresadas de las demandas, esperas y entregas
public class Constantes {
    
    public static ArrayList<Distribucion> demandas = new ArrayList();
    public static ArrayList<Distribucion> esperas = new ArrayList();
    public static ArrayList<Distribucion> entregas = new ArrayList();
    public static ArrayList<EstructuraResultados> resultados = new ArrayList();
    public static double costoInventario;
    public static double costoOrden;
    public static double costoCompra;
    public static double costoFaltanteSinEspera;
    public static double costoFaltanteConEspera;
    public static int inventarioInicial;
    public static int numeroDias;
    public static String unidadTiempo;
    
    public Constantes() {
       
    }
    
    /*public static void insertarDatosPrueba() {
        System.out.println("insertando datos de prueba...");
        
        //se demandan 10 unidades el 4% de las veces y asi...
        demandas.add(new Distribucion(25, 4));
        demandas.add(new Distribucion(26, 6));
        demandas.add(new Distribucion(27, 20));
        demandas.add(new Distribucion(28, 25));
        demandas.add(new Distribucion(29, 25));
        demandas.add(new Distribucion(30, 20));
        
        //el tiempo de entrega es de 1dia el 20% de las veces y asi...
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
    }
    
    public static void insertarDatosPruebaOxigeno() {
        System.out.println("insertando datos de prueba para la empresa...");
        
        demandas.add(new Distribucion(10, 4.17));
        demandas.add(new Distribucion(11, 2.08));
        demandas.add(new Distribucion(15, 6.25));
        demandas.add(new Distribucion(16, 2.08));
        demandas.add(new Distribucion(17, 6.25));
        demandas.add(new Distribucion(18, 2.08));
        demandas.add(new Distribucion(19, 6.25));
        demandas.add(new Distribucion(20, 4.17));
        demandas.add(new Distribucion(21, 2.08));
        demandas.add(new Distribucion(22, 2.08));
        demandas.add(new Distribucion(23, 2.08));
        demandas.add(new Distribucion(25, 4.17));
        demandas.add(new Distribucion(26, 2.08));
        demandas.add(new Distribucion(30, 2.08));
        demandas.add(new Distribucion(33, 2.08));
        demandas.add(new Distribucion(34, 2.08));
        demandas.add(new Distribucion(35, 2.08));
        demandas.add(new Distribucion(37, 2.08));
        demandas.add(new Distribucion(39, 2.08));
        demandas.add(new Distribucion(40, 4.17));
        demandas.add(new Distribucion(41, 4.17));
        demandas.add(new Distribucion(43, 2.08));
        demandas.add(new Distribucion(46, 2.08));
        demandas.add(new Distribucion(51, 4.17));
        demandas.add(new Distribucion(52, 10.42));
        demandas.add(new Distribucion(53, 4.17));
        demandas.add(new Distribucion(55, 2.08));
        demandas.add(new Distribucion(57, 8.33));
       
        entregas.add(new Distribucion(10, 8.34));
        entregas.add(new Distribucion(11, 14.58));
        entregas.add(new Distribucion(12, 12.5));
        entregas.add(new Distribucion(13, 10.42));
        entregas.add(new Distribucion(14, 2.08));
        entregas.add(new Distribucion(15, 14.58));
        entregas.add(new Distribucion(16, 4.17));
        entregas.add(new Distribucion(17, 16.67));
        entregas.add(new Distribucion(18, 2.08));
        entregas.add(new Distribucion(19, 8.33));
        entregas.add(new Distribucion(20, 6.25));
        
        esperas.add(new Distribucion(0, 56.25));
        esperas.add(new Distribucion(1, 16.67));
        esperas.add(new Distribucion(2, 6.25));
        esperas.add(new Distribucion(3, 6.25));
        esperas.add(new Distribucion(4, 6.25));
        esperas.add(new Distribucion(5, 8.33));
    }*/
}
