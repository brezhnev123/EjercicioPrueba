package com.operaciones.service;
import com.operaciones.modelo.envioMaritimo;
import java.util.List;

/**
 *
 * @author brezhnev castro
 */
public interface envioMaritimoService
{
     /*** [ Funciones CRUD para los Productos Terrestres ] ***/
    
        public List<envioMaritimo> findAll(); //--> Listar todos los envios Maritimos
        public envioMaritimo save (envioMaritimo envioMarit); //--> Grabar los envíos Marítimos
        public envioMaritimo findById (int id_guia); //--> Encontrar los envíos Marítimos con Nro de la guía
        public void delete(String nro_guia); //--> Borrar productos Maritimo con Nro de la guia
    
    /************************************/    
}