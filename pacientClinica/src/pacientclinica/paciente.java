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
public class paciente {
    
//constructor normalito//
    final String codigo;
    final String nombre;
    final String apellidos;
    final String sexo;
    final String direcc;
    final String fecha;
    final String lugarAtend;
    final String motivo;
    final String nomMedic;
    
    //constructor superargado//
    
    public paciente(String codigo,String nombre,String apellidos,String sexo, String direcc,String fecha, String lugarAtend,String motivo){
        this.codigo=codigo;
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.sexo= sexo;
        this.direcc= direcc;
        this.fecha=fecha;
        this.lugarAtend=lugarAtend;
        this.motivo=motivo;
        
        
    }
      public String getCodigo(){
          return codigo;
      }
      public String getNmobre(){
          return nombre;
          
      }
      
      public String getApellidos(){
          return apellidos;
          
      }
      public String getsexo(){
          return apellidos;
      }
      public String getdirecc(){
          return direcc;
          
      }
      public String getfecha(){
          return fecha;
          
      }
      public String getlugrAtend(){
          return lugarAtend;
          
      }
      public String getmotivo(){
          return motivo;
      }
      
   
          
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



		



