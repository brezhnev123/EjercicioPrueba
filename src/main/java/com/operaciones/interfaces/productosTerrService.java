package com.operaciones.interfaces;
import com.operaciones.modelo.productosTerr;
import java.util.List;

/**
 *
 * @author brezhnev castro
 */
public interface productosTerrService
{
     /*** [ Funciones CRUD para los Productos Terrestres ] ***/
    
        public List<productosTerr> findAll(); //--> Listar todos los productos Terrestres
        public productosTerr save (productosTerr productoTerr); //--> Grabar productos Terrestres
        public productosTerr findById (Integer id_producto); //--> Encontrar productos Terrestres con Identificación
        public void delete(Integer id_producto); //--> Borrar productos Terrestres con Identificación
    
    /************************************/    
}
