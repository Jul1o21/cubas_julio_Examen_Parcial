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
public class Operacion {
    private Date fecha;
    private float monto;
    private TipoOperacion tipoop;
    private Cuenta cuenta;
    private Cajero cajero;

    public Operacion(Date fecha, float monto, TipoOperacion tipoop, Cuenta cuenta, Cajero cajero) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipoop = tipoop;
        this.cuenta = cuenta;
        this.cajero = cajero;
    }

    @Override
    public String toString() {
        return "Operacion{" + "fecha=" + fecha + ", monto=" + monto + ", tipoop=" + tipoop + ", cuenta=" + cuenta + ", cajero=" + cajero + '}';
    }
    
    
    

    
    
}
