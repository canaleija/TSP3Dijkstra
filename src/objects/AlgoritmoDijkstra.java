/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.LinkedList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AlgoritmoDijkstra {
    
    private LinkedList<Integer> ciudadesDisponibles;
    private int numCiudades;

    public AlgoritmoDijkstra(int numCiudades) {
        this.numCiudades = numCiudades;
        this.ciudadesDisponibles = new LinkedList<>();
        // creamos la ciudades disponibles 
        for(int x= 0 ; x < numCiudades;x++ )
            this.ciudadesDisponibles.add(x);
        /// contruimos la Matrix (distancias)
        Camino.md = Herramientas.generarMatrixDeDistancias(numCiudades);
        
    }
    
    public Camino buscarCamino (int ciudadInicial){
        
        Camino caminoSolucion = new Camino();
        caminoSolucion.agregarCiudad(ciudadInicial);
        // generar un proceso iterativo 
        // donde estaremos agregando ciudades 
        // al caminoSolucion 
        
        while (this.ciudadesDisponibles.size()!=0){
          
         //definir un proceso itertivo donde agreguemos 
         // ciudades con el argumento de distancia minima 
         
         for (int x = 0; x < this.ciudadesDisponibles.size();x++){
         
         
         }
        
        
        }
        
        
        
        
     
        
        
        
        
    
    }
    
    
    
    
    
}
