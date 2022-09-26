package com.operaciones.service;
import com.operaciones.interfaces.productosMaritService;
import com.operaciones.modelo.productosMarit;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.operaciones.Dao.productosMaritDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author brezhnev castro
 */

@Service
public class productosMaritServiceImplement implements productosMaritService
{
    /******** [ Inyectamos las dependencias ] *******/
    
        @Autowired
        private productosMaritDao productoMaritDao;
        
    /***********************************************/
    
    /******** [ Usamos las tareas de la Clase productosTerrService ]
     * @return  *******/
        
        @Override
        @Transactional(readOnly=true)
        public List<productosMarit> findAll()
        {
            return (List <productosMarit>) productoMaritDao.findAll();
        }
        
        @Override
        @Transactional(readOnly=false)
        public productosMarit save (productosMarit productoMarit)
        {
            return productoMaritDao.save(productoMarit);
        }
        
        @Override
        @Transactional(readOnly=true)
        public productosMarit findById(Integer id_producto)
        {
            return productoMaritDao.findById(id_producto).orElse(null); 
        }
        
        @Override
        @Transactional(readOnly=false)
        public void delete (Integer id_producto)
        {
            productoMaritDao.deleteById(id_producto);
        }
    
    /***************************************************************/
}