/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author Dremi7w7
 */
public class Factura {
    private int cedula;
    private int telefono; 
    private String fecha; 
    private String nombre;
    private String direccion; 
    
    
    public Factura(int cedula, int telefono, String fecha, String nombre, String direccion){
        this.cedula = cedula;
        this.telefono = telefono;
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccion = direccion; 
     
    }




    public Factura(Integer cedula, String nombre, Integer telefono, String direccion, String fecha) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.fecha = fecha; 
        this.nombre = nombre;
        this.direccion = direccion; 
    }
    
    public int getCedula() {
        return cedula;
    }
    public int getTelefono() {
        return telefono;
    }
  

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }
    public String getfecha() {
        return fecha;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setfecha(String fecha) {
        this.fecha = fecha;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Factura{" + "cedula=" + cedula + ", telefono=" + telefono + ", fecha=" + fecha + 
               ", nombre=" + nombre + ", direccion=" + direccion + '}';
        
    }
    
    
    
    
    
}
