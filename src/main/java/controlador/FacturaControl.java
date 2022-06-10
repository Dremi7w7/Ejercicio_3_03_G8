/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.List;
import modelo.Factura;
import servicio.FacturaServicio;

/**
 *
 * @author Dremi7w7
 */
public class FacturaControl {
    
    private final FacturaServicio facturaServicio = new FacturaServicio();
    
    public Factura crear(String [] params){
        var factura = new Factura(Integer.valueOf(params[0]),params[1],Integer.valueOf(params[2]),params[3],params[4]); 
              
        this.facturaServicio.crear(factura);
        return factura;
    }
        public List<Factura> listar(){
        return this.facturaServicio.listar();
    }
    
}
