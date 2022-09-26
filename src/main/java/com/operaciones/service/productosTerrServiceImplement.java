package com.operaciones.service;
import com.operaciones.interfaces.productosTerrService;
import com.operaciones.modelo.productosTerr;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.operaciones.Dao.productosTerrDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author brezhnev castro
 */

@Service
public class productosTerrServiceImplement implements productosTerrService
{
    /******** [ Inyectamos las dependencias ] *******/
    
        @Autowired
        private productosTerrDao productoTerrDao;
        
    /***********************************************/
    
    /******** [ Usamos las tareas de la Clase productosTerrService ]
     * @return  *******/
        @Override
        @Transactional(readOnly=true)
        public List<productosTerr> findAll()
        {
            return (List <productosTerr>) productoTerrDao.findAll();
        }
        
        @Override
        @Transactional(readOnly=false)
        public productosTerr save (productosTerr productoTerr)
        {
            return productoTerrDao.save(productoTerr);
        }
        
        @Override
        @Transactional(readOnly=true)
        public productosTerr findById(Integer id_producto)
        {
            return productoTerrDao.findById(id_producto).orElse(null); 
        }
        
        @Override
        @Transactional(readOnly=false)
        public void delete (Integer id_producto)
        {
            productoTerrDao.deleteById(id_producto);
        }
    
    /***************************************************************/
}