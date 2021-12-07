/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author cubas
 */
public class Cajero {
    private String nombre;
    private String direccion;

    public Cajero(String nombre, String dirección) {
        this.nombre = nombre;
        this.direccion = dirección;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDirección() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Los datos del cajero son:\n"
                + " Cajero(" + "nombre:" + nombre + ", direccion:" + direccion + ')';
    }


    
    
    
    
}
