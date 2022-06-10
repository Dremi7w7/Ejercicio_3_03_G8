/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Factura;

/**
 *
 * @author Dremi7w7
 */
public class FacturaServicio implements IFacturaServicio {
    
    private final List<Factura> facturaList = new ArrayList<>();
    
    

    @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }
    
}
