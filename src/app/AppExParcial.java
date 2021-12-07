/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Date;
import principal.Banco;
import principal.Cajero;
import principal.Cliente;
import principal.Cuenta;
import principal.Operacion;
import principal.Tarjeta;
import principal.TipoOperacion;

/**
 *
 * @author cubas
 */
public class AppExParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        System.out.println("Clases con tarjeta:  \n\n\n\n");
        
        
        Banco banco;
        banco = new Banco("20100130204", "pichincha", "San borja Calle 110");
        
        //Agregamos Cuentas y Cajeros al banco:
        
        Cajero cajerotest;
        cajerotest = new Cajero("Numero 66", "Av Las Palmeras los olivos 15030");
        
        
        Date fechaactual = new Date();
        
        Cuenta cuentatest;
        
        Cliente clientetest;
        
        clientetest = new Cliente("88888", "Jesus Andres Lujan Carrion ", "Los Olivos Av Las palmeras");
     
        
        cuentatest = new Cuenta("322", fechaactual,4000,clientetest);
        banco.agregarCajero(cajerotest);
        banco.agregarCuenta(cuentatest);
        System.out.println(banco);        
  
        System.out.println("\n\nSe creara una tarjeta como ejemplo:\n\n");
        Tarjeta tarjetatest;
        tarjetatest = new Tarjeta("888888", "Jesus Andres", 31627141, fechaactual, "987654321", cuentatest);
        System.out.println(tarjetatest);
        

        System.out.println("\n\nSe creara una operacion como ejemplo:\n\n");
        
        TipoOperacion tipotest;
        tipotest = new TipoOperacion("Tipo generico", 2223);
        
        Operacion operaciontest;
        operaciontest = new Operacion(fechaactual, 1000, tipotest, cuentatest, cajerotest); 
        
        System.out.println(operaciontest);
        
        
        
        
        
       
     
        
    }
    
}

