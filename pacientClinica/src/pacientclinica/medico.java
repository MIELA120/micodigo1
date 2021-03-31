/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacientclinica;

/**
 *
 * @author MILENA HERNANDEZ
 */
public class medico extends paciente{
    

    // constructor de medico//
    public medico(String codigo, String nombre,String apellidos,String sexo,String direcc,String fecha, String lugarAtend,String motivo){
       
        super(codigo,nombre,apellidos,sexo,direcc,fecha,lugarAtend, motivo);
        
    }
    @Override
    void mostrarDatos(){
        System.out.println("codigo"+codigo);
         System.out.println("nombre"+nombre);
         System.out.println("apellidos"+apellidos);
         System.out.println("sexo"+sexo);
         System.out.println("direccion"+direcc);
         System.out.println("fecha"+fecha);
         System.out.println("lugar atendido"+lugarAtend);
         System.out.println("motivo"+motivo);
         
         
         
         
    }
    
}
