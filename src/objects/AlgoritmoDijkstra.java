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
        this.ciudadesDisponibles.remove(ciudadInicial);
        // generar un proceso iterativo 
        // donde estaremos agregando ciudades 
        // al caminoSolucion 
        while (!this.ciudadesDisponibles.isEmpty()){
          
        //definir un proceso iterativo donde agreguemos 
        // ciudades con el argumento de distancia minima 
        int ciudadUltima =  caminoSolucion.getCamino().getLast();
        int distMenor = Camino.md[ciudadUltima][this.ciudadesDisponibles.getFirst()]; 
        int iM = 0;
        for (int x = 1; x < this.ciudadesDisponibles.size();x++){
           // buscar un menor 
           if (Camino.md[this.ciudadesDisponibles.get(x)][ciudadUltima]<distMenor){
           distMenor = Camino.md[this.ciudadesDisponibles.get(x)][ciudadUltima];
           // guardar el indice 
           iM = x;
           }
         
         }
        // agregmos al camino la ciudad con distancia menor 
        caminoSolucion.agregarCiudad(this.ciudadesDisponibles.get(iM));
        // eliminamos de las ciudades disponibles 
        this.ciudadesDisponibles.remove(iM);
        
        }
        
        // agregar la distancia entre la primera y la ultima 
        caminoSolucion.agregarCiudad(ciudadInicial);
       
        
        return caminoSolucion;
    
    }
    
    
    
    
    
}
