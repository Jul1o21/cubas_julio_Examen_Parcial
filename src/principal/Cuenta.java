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

    public Cuenta(String numero, Date fechaApertura, float saldo, Cliente cliente) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    

   
    
}
