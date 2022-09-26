
package com.operaciones.modelo;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author brezhnev castro
 */

@Entity
@Table(name="envio_terrestre")
public class envioTerrestre
{
    /************ [ Declaración de Variables Privadas ] ******************/
        /*
            En esta parte se crearan las mismas variablaes tal como están
            definidas en la base de datos, pero serán de tipo PRIVATE.
        */
    
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id_guia")
        private int id_guia;
        
        @Column(name="nro_guia")
        private String  nro_guia;
        
        @Column(name="id_cliente")
        private double  id_cliente;
        
        @Column(name="precio")
        private int     precio;
        
        @Column(name="id_prod_terr")
        private int     id_prod_terr;
        
        @Column(name="fecha_registro")
        private Date    fecha_registro;
        
        @Column(name="fecha_entrega")
        private Date    fecha_entrega;
        
        @Column(name="placa_vehiculo")
        private String  placa_vehiculo;
        
        @Column(name="id_bodega_ent")
        private int     id_bodega_ent;
    
        /*****************************************************************/

            /************ [ Creación de constructores ] ******************/
        
        /*
            A continuación creamos los constructores, el primero
            será el definido por el aplicativo y el segundo será
            el creado con los parámetros necesarios de las bodegas
        
        */   
        
        public envioTerrestre(){}

        public envioTerrestre(int id_guia, String nro_guia, double id_cliente, int precio, int id_prod_terr, Date fecha_registro, Date fecha_entrega, String placa_vehiculo, int id_bodega_ent)
        {
            this.id_guia = id_guia;
            this.nro_guia = nro_guia;
            this.id_cliente = id_cliente;
            this.precio = precio;
            this.id_prod_terr = id_prod_terr;
            this.fecha_registro = fecha_registro;
            this.fecha_entrega = fecha_entrega;
            this.placa_vehiculo = placa_vehiculo;
            this.id_bodega_ent = id_bodega_ent;
        }

    
        
        /*************************************************************/
        
    /***************** [ Creación de los métodos SET y GET ] ***********************/
        
        public int getId_guia(){return id_guia;}
        public void setId_guia(int id_guia){this.id_guia = id_guia;}
        public String getNro_guia() {return nro_guia;}
        public void setNro_guia(String nro_guia) {this.nro_guia = nro_guia;}
        public double getId_cliente() {return id_cliente;}
        public void setId_cliente(double id_cliente) {this.id_cliente = id_cliente;}
        public int getPrecio() {return precio;}
        public void setPrecio(int precio) {this.precio = precio;}
        public int getId_prod_terr() {return id_prod_terr;}
        public void setId_prod_terr(int id_prod_terr) {this.id_prod_terr = id_prod_terr;}
        public Date getFecha_registro() {return fecha_registro;}
        public void setFecha_registro(Date fecha_registro) {this.fecha_registro = fecha_registro;}
        public Date getFecha_entrega() {return fecha_entrega;}
        public void setFecha_entrega(Date fecha_entrega) {this.fecha_entrega = fecha_entrega;}
        public String getPlaca_vehiculo() {return placa_vehiculo;}
        public void setPlaca_vehiculo(String placa_vehiculo) {this.placa_vehiculo = placa_vehiculo;}
        public int getId_bodega_ent() {return id_bodega_ent;}
        public void setId_bodega_ent(int id_bodega_ent) {this.id_bodega_ent = id_bodega_ent;}
     
    /***************************************************************************/        
}
