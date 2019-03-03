/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleaditos;

/**
 *
 * @author cenef
 */
public class Emple {
    private String nombre,direccion; 
    private int edad; 
    private long numero; 
    
    
    public Emple(String nombre, String direccion, int edad, long numero){
        this.direccion=direccion; 
        this.nombre=nombre; 
        this.edad=edad; 
        this.numero=numero; 
        
    
    
    
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
    
    
    

    
}
