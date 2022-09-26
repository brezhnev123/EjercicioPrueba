package com.operaciones.service;
import com.operaciones.Dao.envioMaritimoDao;
import com.operaciones.modelo.envioMaritimo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author brezhnev castro
 */
@Service
public class envioMaritimoServiceImplement implements envioMaritimoService
{
    /******** [ Inyectamos las dependencias ] *******/
    
        @Autowired
        private envioMaritimoDao envioMaritDao;
        
    /***********************************************/
    
    /******** [ Usamos las tareas de la Clase envioMaritimoService ]
     * @return  *******/
        
        @Override
        @Transactional(readOnly=true)
        public List<envioMaritimo> findAll()
        {
            return (List <envioMaritimo>) envioMaritDao.findAll();
        }
        
        @Override
        @Transactional(readOnly=false)
        public envioMaritimo save (envioMaritimo envioMarit)
        {
            return envioMaritDao.save(envioMarit);
        }
        
        @Override
        @Transactional(readOnly=true)
        public envioMaritimo findById(int id_guia)
        {
            return (envioMaritimo) envioMaritDao.findById(id_guia).orElse(null); 
        }
        
        @Transactional(readOnly=false)
        public void delete (int id_guia)
        {
            envioMaritDao.deleteById(id_guia);
        }

    @Override
    public void delete(String nro_guia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /***************************************************************/
}
