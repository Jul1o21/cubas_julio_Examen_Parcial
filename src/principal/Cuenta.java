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
public class Cuenta {
    private String numero;
    private Date fechaApertura;
    private float saldo;
    private Cliente cliente;
    private Tarjeta tarjeta;

    public Cuenta(String numero, Date fechaApertura, float saldo, Cliente cliente) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public Cuenta(String numero, Date fechaApertura, float saldo, Cliente cliente, Tarjeta tarjeta) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.cliente = cliente;
        this.tarjeta = tarjeta;
    }
    public String getNumero() {
        return numero;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    
    public boolean depositar(float monto){
        boolean result = false;
        
        
        return result;
    }
    public boolean retirar(float monto){
        boolean result = false;
        
        
        return result;
    }
    public boolean transferir(float monto){
        boolean result = false;
        
        
        return result;
    }
    public float consultarsaldo(){
        
        
        
        return this.saldo;
    }
  
    
    
    
    
    @Override
    public String toString() {
        return "\nCuenta:\n" +
                "\t\nnumero: " + numero + 
                "\t\nfechaApertura: " + fechaApertura + 
                "\t\nsaldo: " + saldo + 
                "\tLa tarjeta de la cuenta: " + tarjeta + 
                "\t\ncliente: " + cliente+"\n\n";
    }
    

   
    
}
