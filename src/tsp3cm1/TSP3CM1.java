/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp3cm1;

import objects.AlgoritmoDijkstra;
import objects.Camino;

/**
 *
 * @author Roberto Cruz Leija
 */
public class TSP3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmoDijkstra aux;
        for (int x=0 ; x < 5;x++){
        aux = new AlgoritmoDijkstra(5);
        Camino c = aux.buscarCamino(x);
        System.out.println("Ci= "+x+" Distancia Total: "+c.getDistanciaRecorrida());
        }
        
        
    }
    
}
