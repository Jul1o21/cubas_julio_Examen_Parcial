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
public class TipoOperacion {
    private String nombre;
    private int codigo;

    public TipoOperacion(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    
    
    @Override
    public String toString() {
        return "TipoOperacion{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
           
}
