package com.operaciones.interfaces;
import com.operaciones.modelo.envioTerrestre;
import java.util.List;

/**
 *
 * @author brezhnev castro
 */
public interface envioTerrestreService
{
     /*** [ Funciones CRUD para los Productos Terrestres ] ***/
    
        public List<envioTerrestre> findAll(); //--> Listar todos los envios Terrestres
        public envioTerrestre save (envioTerrestre envioTerr); //--> Grabar los envíos Terrestres
        public envioTerrestre findById (int id_guia); //--> Encontrar los envíos terrestres con Nro de la Guía
        public void delete(String nro_guia); //--> Borrar productos Terrestres con Nro. de la guía
    
    /************************************/    
}
