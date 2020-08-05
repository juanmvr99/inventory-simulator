/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

//Clase para manejo de archivos
public class ManejoArchivos {
    private File archivoEntrada;
    private File archivoSalida;
    private String salida;
    private DecimalFormat formato = new DecimalFormat("#,###,###.####");
    
    
    public ManejoArchivos(){
        this.archivoEntrada = new File("archivos/Entrada.txt");
        this.archivoSalida =  new File("archivos/Salida.txt");
        if(!this.archivoEntrada.exists()){
            try{
               this.archivoEntrada.createNewFile();
            }catch(IOException ex){
                System.out.println("Error entrada");
            }
            
        }
        if(!this.archivoSalida.exists()){
            try{
               this.archivoSalida.createNewFile();
            }catch(IOException ex){
                System.out.println("Error entrada");
            }
            
        }
    }
    
    //Retorna el archivo en un array list para su procesamiento
    public ArrayList<String> leerArchivo(){
        ArrayList<String> lista = new ArrayList<String>();
        try{
            BufferedReader bf = new BufferedReader(new FileReader(this.archivoEntrada));
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                lista.add(bfRead);
            }
        }catch(IOException e){
        }
        return (lista);
    }
    
    public void escribirArchivo(){
        this.salida = "----------------------Datos de entrada---------------------------\n \n" 
                + "Costo de inventario: " + Constantes.costoInventario
                + "\nCosto de orden: " + Constantes.costoOrden
                + "\nCosto de compra: " + Constantes.costoCompra
                + "\nCosto de faltantes con espera: " + Constantes.costoFaltanteConEspera
                + "\nCosto de faltantes sin espera: " + Constantes.costoFaltanteSinEspera
                + "\nInventario inicial: " + Constantes.inventarioInicial
                + "\nTiempo: " + Constantes.numeroDias + " " + Constantes.unidadTiempo
                + "\nDemandas: \n" + Constantes.demandas
                + "\nEntregas: \n" + Constantes.entregas
                + "\nEsperas: \n" + Constantes.esperas
                + "\n \n----------------Resultados de la simulacion-------------------- \n";
        EstructuraResultados aux;
        for(int i = 0; i < Constantes.resultados.size(); i++){
            aux = Constantes.resultados.get(i);
            this.salida = this.salida + "\nQ: " + aux.getQ()
                    + "   R: " + aux.getR() + "\n"
                    + "\nCosto de inventario: " + formato.format(aux.getCostoInventario()) + "\n"
                    + "Costo de orden: " + formato.format(aux.getCostoOrden()) + "\n"
                    + "Costo de compra: " + formato.format(aux.getCostoCompra()) + "\n"
                    + "Costo de faltantes: " + formato.format(aux.getCostoFaltante())+ "\n"
                    + "Costo total: " + formato.format(aux.getCostoTotal()) + "\n";
        }
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivoSalida));
            PrintWriter pw = new PrintWriter(bw);
            pw.write(this.salida);
            pw.close();
            bw.close();
        }catch(IOException e){
             System.out.println("Error escritura");
        }
    }
}
