
package com.operaciones.interfaces;

import com.operaciones.modelo.registroBodegas;
import java.util.List;

/**
 *
 * @author brezhnev Castro
 */
public interface registroBodegasService
{
    /*** [ Funciones CRUD para Usuarios ] ***/
    
        public List<registroBodegas> findAll(); //--> Listar todas las Bodegas
        public registroBodegas save (registroBodegas registroBodega); //--> Grabar una bodega nueva
        public registroBodegas findById (Integer id_bodega); //--> Encontrar una bodega a través de su identificadcor
        public void delete(Integer id_bodega); //--> Borrar una Bodega a través de su identificador
    
    /************************************/    
    
}
