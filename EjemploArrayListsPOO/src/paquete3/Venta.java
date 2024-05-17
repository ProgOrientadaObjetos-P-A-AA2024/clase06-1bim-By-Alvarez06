/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {
    private double valorVenta;
    private ArrayList<Computador> computadoras; 
    
    public Venta(ArrayList<Computador> c){
        computadoras = c;
    }
    
    public void calcularValorVenta(){
        double suma = 0;
        for (int i = 0; i < computadoras.size(); i++) {
            suma = suma + computadoras.get(i).obtenerCostoComputador();
        }
        valorVenta = suma;
    }
    
    public double obtenerValorVenta(){
        return valorVenta;
    }
    
    @Override
    public String toString(){
        String cadena = "\nVenta Total:\n";
        for (int i = 0; i < computadoras.size(); i++) {
            cadena = String.format("""
                               %sComputadora #%d: %s
                               Procesador: %s
                               Costo Procesador: %.2f$    
                               Memoria: %s
                               Costo Memoria: %.2f$
                               Costo Computador: %.2f$\n
                               """, 
                    cadena, (i + 1),
                    computadoras.get(i).obtenerMarca(), 
                    computadoras.get(i).obtenerProcesador().obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerCosto(),
                    computadoras.get(i).obtenerMemoria().obtenerMarca(),
                    computadoras.get(i).obtenerMemoria().obtenerCosto(),
                    computadoras.get(i).obtenerCostoComputador());
            
        }
        
        cadena = String.format("%sCosto Total de Venta: %.2f$", cadena, valorVenta);
        return cadena;
    }

}
