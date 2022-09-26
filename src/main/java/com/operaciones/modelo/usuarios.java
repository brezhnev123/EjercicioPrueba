/*
 *  Se crea la clase USUARIOS igual que en la base de datos, 
    esto con el fin de poder obtener la inforamción de los usuarios.
 *
 */
package com.operaciones.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author brezhnev castro
 */
@Entity
@Table(name="usuarios")
public class usuarios 
{
    /************ [ Declaración de Variables Privadas ] ******************/
        /*
            En esta parte se crearan las mismas variablaes tal como están
            definidas en la base de datos, pero serán de tipo PRIVATE.
        */
        
        @Id
        @Column(name="id")
        private double  id;
        
        @Column(name="nombres")
        private String  nombres;
        
        @Column(name="apellidos")
        private String  apellidos;
        
        @Column(name="direccion")
        private String  direccion;
        
        @Column(name="telefono")
        private double  telefono;
        
        @Column(name="movil")
        private double  movil;
        
        @Column(name="tipoPersona")
        private String  tipoPersona;
        
     /*****************************************************************/
        
     /************ [ Creación de constructores ] ******************/
        
        /*
            A continuación creamos los constructores, el primero
            será el definido por el aplicativo y el segundo será
            el creado con los parámetros necesarios del usuario.
        
        */
        public usuarios(){}

        public usuarios(double id, String nombres, String apellidos, String direccion, double telefono, double movil, String tipoPersona)
        {
            this.id = id;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.direccion = direccion;
            this.telefono = telefono;
            this.movil = movil;
            this.tipoPersona = tipoPersona;
        }

     /*****************************************************************/
        
     /***************** [ Creación de los métodos SET y GET ] ***********************/
        
        public double getId(){return id;}
        public void setId(double id) {this.id = id;}
        public String getNombres() {return nombres;}
        public void setNombres(String nombres) {this.nombres = nombres;}
        public String getApellidos() {return apellidos;}
        public void setApellidos(String apellidos) {this.apellidos = apellidos;}
        public String getDireccion() {return direccion;}
        public void setDireccion(String direccion) {this.direccion = direccion;}
        public double getTelefono() {return telefono;}
        public void setTelefono(double telefono) {this.telefono = telefono;}
        public double getMovil() {return movil;}
        public void setMovil(double movil) {this.movil = movil;}
        public String getTipoPersona() {return tipoPersona;}
        public void setTipoPersona(String tipoPersona) {this.tipoPersona = tipoPersona;}
    
    /*****************************************************************************/
      
     
             
         
}
