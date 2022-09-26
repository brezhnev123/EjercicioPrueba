
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
@Table(name="productos_terr")
public class productosTerr
{
 
    /************ [ Declaración de Variables Privadas ] ******************/
        /*
            En esta parte se crearan las mismas variablaes tal como están
            definidas en la base de datos, pero serán de tipo PRIVATE.
        */
    
        @Id
        @Column(name="id_producto")
        private int id_producto;

        @Column(name="id_cliente")
        private double id_cliente;

        @Column(name="descripcion")
        private String descripción;

        @Column(name="cantidad")
        private int cantidad;

        @Column(name="peso")
        private int peso;

        @Column(name="id_bodega")
        private int id_bodega;
    
    /*****************************************************************/
        
        /************ [ Creación de constructores ] ******************/
        
        /*
            A continuación creamos los constructores, el primero
            será el definido por el aplicativo y el segundo será
            el creado con los parámetros necesarios de las bodegas
        
        */
        
        public productosTerr(){}

        public productosTerr(int id_producto, double id_cliente, String descripción, int cantidad, int peso, int id_bodega)
        {
            this.id_producto = id_producto;
            this.id_cliente = id_cliente;
            this.descripción = descripción;
            this.cantidad = cantidad;
            this.peso = peso;
            this.id_bodega = id_bodega;
        }

   
        
    /*************************************************************/
        
    /***************** [ Creación de los métodos SET y GET ] ***********************/
    
         public int getId_producto() {return id_producto;}
         public void setId_producto(int id_producto) {this.id_producto = id_producto;}
         public double getId_cliente() {return id_cliente;}
         public void setId_cliente(double id_cliente) {this.id_cliente = id_cliente;}
         public String getDescripción() {return descripción;}
         public void setDescripción(String descripción) {this.descripción = descripción;}
         public int getCantidad() {return cantidad;}
         public void setCantidad(int cantidad) {this.cantidad = cantidad;}
         public int getPeso() {return peso;}
         public void setPeso(int peso) {this.peso = peso;}
         public int getId_bodega() {return id_bodega;}
         public void setId_bodega(int id_bodega) {this.id_bodega = id_bodega;}
         
    /***************************************************************************/
        
                
}
