/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author cubas
 */
public class Banco {
    private String ruc;
    private String nombre;
    private String direccion;
    private Cuenta[] cuentas;
    private Cajero[] cajeros;

    
    public Banco(String ruc, String nombre, String direccion) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new Cuenta[0];
        this.cajeros = new Cajero[0];

        
    }
    public boolean registrarCliente(Cliente cliente){
        boolean result =false;
        
        return result;
    }  
   /* public Cuenta getCuentasporcliente(Cliente cliente){
        Cuenta[] cuentas;
        cuentas = new Cuenta[];
        
        return cuentas;
    }    */
    
    
    public boolean validarTarjeta(String numtarjeta, String dni, String clave){
        boolean result =false;
        
        return result;
    }  
    
    
    
    
    public void agregarCajero(Cajero cajero){
        
        
     
        
        Cajero nuevoscajeros[] = new Cajero[this.cajeros.length+1];
        
        
         nuevoscajeros[this.cajeros.length] = cajero;
         for(int i =0 ; i< this.cajeros.length;i++){
            nuevoscajeros[i]= this.cajeros[i];
         }
         this.cajeros = nuevoscajeros;
       
         System.out.println("\nSe agrego el cajero con exito");
    }
    
    
    
    
    public void agregarCuenta(Cuenta cuenta){

        Cuenta nuevascuentas[] = new Cuenta[this.cuentas.length+1];

         nuevascuentas[this.cuentas.length] = cuenta;
         for(int i =0 ; i< this.cuentas.length;i++){
            nuevascuentas[i]= this.cuentas[i];
         }
         this.cuentas= nuevascuentas;
       
         System.out.println("\nSe agrego la ceunta con exito");
    }
    
    
    
   
    @Override
    public String toString() {
        String cajeroz ="\t";
        String cuentaz = "\t";
        
        for(int i =0 ; i<this.cajeros.length;i++){
            
             cajeroz = cajeroz + this.cajeros[i].toString()+"\n\n-------------------------------\n\n\t";
         }
        for(int i =0 ; i<this.cuentas.length;i++){
             cuentaz = cuentaz + this.cuentas[i].toString()+"\n\n-------------------------------\n\n\t";
         }
        return  "\n--------------------------------------------------------------LOS DATOS DE ESTE BANCO SON--------------------------------------------------------------\n\n"+"ruc=" + ruc + 
                "\tnombre: " + nombre + 
                "\tdireccion: " + direccion + 
                "\n\nLas cuentas son:\n" + cuentaz+
                "\nLos cajeros son:\n" + cajeroz;
                
    }
    

 
    
    

    
}
