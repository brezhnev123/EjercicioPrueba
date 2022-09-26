package com.operaciones.interfaces;
import com.operaciones.modelo.productosMarit;
import java.util.List;

/**
 *
 * @author brezhnev castro
 */
public interface productosMaritService
{
     /*** [ Funciones CRUD para los Productos Maritimos ] ***/
    
        public List<productosMarit> findAll(); //--> Listar todos los productos Marítimos
        public productosMarit save (productosMarit productoMarit); //--> Grabar productos Marítimos
        public productosMarit findById (Integer id_producto); //--> Encontrar productos Marítimos con Identificación
        public void delete(Integer id_producto); //--> Borrar productos Marítimos con Identificación
    
    /************************************/    
}