/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleaditos;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author cenef
 */
public class Aplicacion4 {
    public static void main(String[] args) {
        
        String opc; 
        
        Emple empleado1 = new Emple("Alejandro","cll 1d #1-07", 17, 311464695);
        Emple empleado2 = new Emple("Juan","crr 7 8-02", 25, 321465202);
        Emple empleado3 = new Emple("Sebastian","crr 45 #8-32", 19, 312333696);
        Emple empleado4 = new Emple("Brayan","cll 23 100-45", 21, 320115202);
        Emple empleado5 = new Emple("Lucas","crr 98 23-2", 23, 322489002);
        
        JOptionPane.showMessageDialog(null,"Los posibles nombre de empleados son: \n *Alejandro \n *Juan \n *Sebastian \n *Brayan \n *Lucas ");
        
        
        opc = JOptionPane.showInputDialog("Escriba el nombre del empleado");
        
        switch(opc){
            case "Alejandro":   JOptionPane.showMessageDialog(null,"Los datos son: ");
                                JOptionPane.showMessageDialog(null, "Nombre: "+empleado1.getNombre());
                                JOptionPane.showMessageDialog(null,"Direccion: "+empleado1.getDireccion());
                                JOptionPane.showMessageDialog(null, "Edad: "+empleado1.getEdad());
                                JOptionPane.showMessageDialog(null,"Numero: "+empleado1.getNumero());
            break; 
            case "Juan":        JOptionPane.showMessageDialog(null,"Los datos son: ");
                                JOptionPane.showMessageDialog(null, "Nombre: "+empleado2.getNombre());
                                JOptionPane.showMessageDialog(null,"Direccion: "+empleado2.getDireccion());
                                JOptionPane.showMessageDialog(null, "Edad: "+empleado2.getEdad());
                                JOptionPane.showMessageDialog(null,"Numero: "+empleado2.getNumero());
            break;
            case "Sebastian":   JOptionPane.showMessageDialog(null,"Los datos son: ");
                                JOptionPane.showMessageDialog(null, "Nombre: "+empleado3.getNombre());
                                JOptionPane.showMessageDialog(null,"Direccion: "+empleado3.getDireccion());
                                JOptionPane.showMessageDialog(null, "Edad: "+empleado3.getEdad());
                                JOptionPane.showMessageDialog(null,"Numero: "+empleado3.getNumero());
            break;
            case "Brayan":      JOptionPane.showMessageDialog(null,"Los datos son: ");
                                JOptionPane.showMessageDialog(null, "Nombre: "+empleado4.getNombre());
                                JOptionPane.showMessageDialog(null,"Direccion: "+empleado4.getDireccion());
                                JOptionPane.showMessageDialog(null, "Edad: "+empleado4.getEdad());
                                JOptionPane.showMessageDialog(null,"Numero: "+empleado4.getNumero());
            break;
            case "Lucas":       JOptionPane.showMessageDialog(null,"Los datos son: ");
                                JOptionPane.showMessageDialog(null, "Nombre: "+empleado5.getNombre());
                                JOptionPane.showMessageDialog(null,"Direccion: "+empleado5.getDireccion());
                                JOptionPane.showMessageDialog(null, "Edad: "+empleado5.getEdad());
                                JOptionPane.showMessageDialog(null,"Numero: "+empleado5.getNumero());
            break; 
        }
        
        
        
        
    }
    
    
}
