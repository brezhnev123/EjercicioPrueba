
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
@Table(name="registro_bodegas")
public class registroBodegas
{
    /************ [ Declaración de Variables Privadas ] ******************/
        /*
            En esta parte se crearan las mismas variablaes tal como están
            definidas en la base de datos, pero serán de tipo PRIVATE.
        */
        
        @Id
        @Column(name="id_bodega")
        private double  id_bodega;
        
        @Column(name="direccion")
        private String direccion;
        
        @Column(name="tipo_bodega")
        private String tipoBodega;
        
        @Column(name="pais")
        private String pais;
        
        @Column(name="provincia")
        private String provincia;
        
        @Column(name="ciudad")
        private String ciudad;
     
    /*****************************************************************/
        
    /************ [ Creación de constructores ] ******************/
        
        /*
            A continuación creamos los constructores, el primero
            será el definido por el aplicativo y el segundo será
            el creado con los parámetros necesarios de las bodegas
        
        */
        
        public registroBodegas(){}

        public registroBodegas(double id_bodega, String direccion, String tipoBodega, String pais, String provincia, String ciudad)
        {
            this.id_bodega = id_bodega;
            this.direccion = direccion;
            this.tipoBodega = tipoBodega;
            this.pais = pais;
            this.provincia = provincia;
            this.ciudad = ciudad;
        }

    
        
    /*************************************************************/
        
    /***************** [ Creación de los métodos SET y GET ] ***********************/
        
        public double getId_bodega() {return id_bodega;}
        public void setId_bodega(double id_bodega) {this.id_bodega = id_bodega;}
        public String getDireccion() {return direccion;}
        public void setDireccion(String direccion) {this.direccion = direccion;}
        public String getTipoBodega() {return tipoBodega;}
        public void setTipoBodega(String tipoBodega) {this.tipoBodega = tipoBodega;}
        public String getPais() {return pais;}
        public void setPais(String pais) {this.pais = pais;}
        public String getProvincia() {return provincia;}
        public void setProvincia(String provincia) {this.provincia = provincia;}
        public String getCiudad() {return ciudad;}
        public void setCiudad(String ciudad) {this.ciudad = ciudad;}
        
    /***************************************************************************/
}
