
package com.operaciones.Dao;
import org.springframework.data.repository.CrudRepository;
import com.operaciones.modelo.usuarios;

/**
 *
 * @author brezhnev castro
 */


public interface usuariosDao extends CrudRepository<usuarios, Integer>
{
    
}
