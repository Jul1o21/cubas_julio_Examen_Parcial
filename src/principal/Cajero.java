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
    public boolean depositar(Tarjeta tarjeta, Cuenta cuenta, float monto){
        boolean result =false;
        
        return result;
    } 
    public boolean retirar(Tarjeta tarjeta, Cuenta cuenta, float monto){
        boolean result =false;
        
        return result;
    }  
    public boolean transferir(Tarjeta tarjeta, Cuenta cuenta, float monto){
        boolean result =false;
        
        return result;
    }  
    
    public boolean validartarjeta(String rucbanco, String numtarjeta, String dni, String clave){
        boolean result =false;
        
        return result;
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Cajero:\n"
                + " Cajero(" + "nombre:" + nombre + ", direccion:" + direccion + ')';
    }


    
    
    
    
}
