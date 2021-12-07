/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Date;

/**
 *
 * @author cubas
 */
public class Tarjeta {
    private String numero;
    private String nombre;
    private int cvv;
    private Date fechaVenc;
    private String clave;
    private Cuenta cuenta;

    public Tarjeta(String numero, String nombre, int cvv, Date fechaVenc, String clave, Cuenta cuenta) {
        this.numero = numero;
        this.nombre = nombre;
        this.cvv = cvv;
        this.fechaVenc = fechaVenc;
        this.clave = clave;
        this.cuenta = cuenta;
    }
    public boolean validar(String clave){
        boolean result = false;
        
        
        return result;
    }
    

    public boolean depositar(Cuenta cuenta, float monto ){
        boolean result = false;
        
        
        return result;
    }
    public boolean retirar(Cuenta cuenta, float monto ){
        boolean result = false;
        
        
        return result;
    }
    
    public boolean transferir(Cuenta cuenta, float monto ){
        boolean result = false;
        
        
        return result;
    }
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", nombre=" + nombre + ", cvv=" + cvv + ", fechaVenc=" + fechaVenc + ", clave=" + clave + ", cuenta=" + cuenta + '}';
    }
    
    

        
    
}
