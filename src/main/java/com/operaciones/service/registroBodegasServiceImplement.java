package com.operaciones.service;

import com.operaciones.interfaces.registroBodegasService;
import com.operaciones.modelo.registroBodegas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.operaciones.Dao.registroBodegasDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author brezhnev castro
 */

@Service
public class registroBodegasServiceImplement implements registroBodegasService
{
     /******** [ Inyectamos las dependencias ] *******/
    
        @Autowired
        private registroBodegasDao registroBodegaDao;
        
    /***********************************************/
        
    /******** [ Usamos las tareas de la Clase registroBodegasService ]
     * @return  *******/
        
        @Override
        @Transactional(readOnly=true)
        public List<registroBodegas> findAll()
        {
            return (List <registroBodegas>) registroBodegaDao.findAll();
        }
        
        @Override
        @Transactional(readOnly=false)
        public registroBodegas save (registroBodegas registroBodega)
        {
            return registroBodegaDao.save(registroBodega);
        }
        
        @Override
        @Transactional(readOnly=true)
        public registroBodegas findById(Integer id)
        {
            return registroBodegaDao.findById(id).orElse(null); 
        }
        
        @Override
        @Transactional(readOnly=false)
        public void delete (Integer id)
        {
            registroBodegaDao.deleteById(id);
        }
    
    /***************************************************************/
}
