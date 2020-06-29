/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;
import java.util.ArrayList;

/**
 *
 * @author rau_m
 */
public class Calculos {
    //h=  costo de inventario d = costo de orden
    ArrayList<Distribucion> distribucion;
    double q, ed;
    Distribucion aux; 
    public  Calculos() {
        this.distribucion = new ArrayList<Distribucion>();
        this.q = 0;
        this.ed = 0;
        this.aux = null;
    }

    public double getQ() {
        return q;
    }
    
    
    private void esperanza(ArrayList<Distribucion> distribucion){
        this.distribucion = distribucion;
        int t = this.distribucion.size();
        for (int i = 0; i < t; i++){
            aux = this.distribucion.get(i);
            ed = ed + aux.getValor() * aux.getProbabilidad();
            System.out.println(ed);
        }
    };
    
    public double Q(ArrayList<Distribucion> distribucion, float k, float h){
        this.esperanza(distribucion);
        q = Math.sqrt((2 * k * ed) / h);
        System.out.println(q);
        return(q);
    }
}
