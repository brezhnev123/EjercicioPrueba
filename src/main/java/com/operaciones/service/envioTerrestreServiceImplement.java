package com.operaciones.service;
import com.operaciones.interfaces.envioTerrestreService;
import com.operaciones.modelo.envioTerrestre;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.operaciones.Dao.envioTerrestreDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author brezhnev castro
 */

@Service
public class envioTerrestreServiceImplement implements envioTerrestreService
{
    /******** [ Inyectamos las dependencias ] *******/
    
        @Autowired
        private envioTerrestreDao envioTerrDao;
        
    /***********************************************/
    
    /******** [ Usamos las tareas de la Clase productosTerrService ] *******/
        @Override
        @Transactional(readOnly=true)
        public List<envioTerrestre> findAll()
        {
            return (List <envioTerrestre>) envioTerrDao.findAll();
        }
        
        @Override
        @Transactional(readOnly=false)
        public envioTerrestre save (envioTerrestre envioTerr)
        {
            return envioTerrDao.save(envioTerr);
        }
        
        @Override
        @Transactional(readOnly=true)
        public envioTerrestre findById(int id_guia)
        {
            return (envioTerrestre) envioTerrDao.findById(id_guia).orElse(null);
        }
        
        @Transactional(readOnly=false)
        public void delete (int id_guia)
        {
            envioTerrDao.deleteById(id_guia);
        }

    @Override
    public void delete(String nro_guia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     
    /***************************************************************/
}
