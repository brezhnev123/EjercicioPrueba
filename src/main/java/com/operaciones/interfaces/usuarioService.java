package com.operaciones.interfaces;
import com.operaciones.modelo.usuarios;
import java.util.List;

/**
 *
 * @author brezhnev castro
 */
public interface usuarioService
{
    /*** [ Funciones CRUD para Usuarios ] ***/
    
        public List<usuarios> findAll(); //--> Listar todos los usuarios
        public usuarios save (usuarios usuarios); //--> Grabar usuarios
        public usuarios findById (Integer id); //--> Encontrar usuario con Identificación
        public void delete(Integer id); //--> Borrar usuario con Identificación
    
    /************************************/    
    
}
