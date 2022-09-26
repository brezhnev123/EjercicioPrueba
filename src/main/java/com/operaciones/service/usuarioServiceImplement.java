package com.operaciones.service;

import com.operaciones.interfaces.usuarioService;
import com.operaciones.modelo.usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.operaciones.Dao.usuariosDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author brezhnev castro
 */
@Service
public class usuarioServiceImplement implements usuarioService
{
    /******** [ Inyectamos las dependencias ] *******/
    
        @Autowired
        private usuariosDao usuarioDao;
        
    /***********************************************/
    
    /******** [ Usamos las tareas de la Clase usuarioService ]
     * @return  *******/
        
        @Override
        @Transactional(readOnly=true)
        public List<usuarios> findAll()
        {
            return (List <usuarios>) usuarioDao.findAll();
        }
        
        @Override
        @Transactional(readOnly=false)
        public usuarios save (usuarios usuario)
        {
            return usuarioDao.save(usuario);
        }
        
        @Override
        @Transactional(readOnly=true)
        public usuarios findById(Integer id)
        {
            return usuarioDao.findById(id).orElse(null); 
        }
        
        @Override
        @Transactional(readOnly=false)
        public void delete (Integer id)
        {
            usuarioDao.deleteById(id);
        }
    
    /***************************************************************/
}
