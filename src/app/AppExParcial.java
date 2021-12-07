/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import principal.Banco;
import principal.Cajero;
import principal.Cliente;

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
        
        
        Banco banco;
        banco = new Banco("comas", "pichincha", "Calle 80", new Cliente("2777", "Julio", "Calle 23 nro 110"));
        
        
        
        
    /*    banco.agregarCajero(new Cajero("A001", "Calle 50"));
        banco.agregarCajero(new Cajero("interbank", "Calle 200"));
        
        Cajero cajer2 = new Cajero("TEst1", "Testdirec");
        System.out.println(cajer2);*/
                
        System.out.println(banco);        
        
    }
    
}
