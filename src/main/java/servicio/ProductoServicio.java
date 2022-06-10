/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Dremi7w7
 */
public class ProductoServicio implements IProductoServicio {
    
    private final List<Producto> productoList = new ArrayList<>();

    @Override
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
        return producto;
    }

    @Override
    public List<Producto> listar() {
        return this.productoList;
    }
    
}
