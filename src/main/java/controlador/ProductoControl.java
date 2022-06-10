/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;



import java.util.List;
import modelo.Producto;
import servicio.ProductoServicio;

/**
 *
 * @author Dremi7w7
 */
public class ProductoControl {
    
    private final ProductoServicio productoServicio = new ProductoServicio();
    
        public Producto crear(String [] params){
            
        
            
        var producto = new Producto(params[0],params[1],Integer.valueOf(params[2]),Integer.valueOf(params[3]),params[4],params[5]); 
              
        this.productoServicio.crear(producto);
        return producto;
    }
     
        public List<Producto> listar(){
        return this.productoServicio.listar();
    }
    
    
    
    
}
