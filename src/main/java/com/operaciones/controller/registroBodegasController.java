package com.operaciones.controller;
import com.operaciones.modelo.registroBodegas;
import com.operaciones.interfaces.registroBodegasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author brezhnev castro
 */
@RestController
@CrossOrigin(origins="*") //--> Nos permite conectar desde cualquier parte.
@RequestMapping("/api")//--> indica la ruta de acceso
public class registroBodegasController
{
    @Autowired
    
    /******* [ Creamos las variables privadas ] *******/
        
        private registroBodegasService  rbService;
    
    /*************************************************/
    
    /******* [ Funciones para Registro Bodegas ] *******/
    
        // [ Listar Bodegas ]
    
        @GetMapping("/bodegas")
        public List<registroBodegas> listarBodegas()
        {
            return rbService.findAll();
        }
        
        // ***********************************************
        
        // [ Guardar Bodegas]
        
        @PostMapping("/bodegas")
        public registroBodegas save (@RequestBody registroBodegas registroBodega)
        {
            return rbService.save(registroBodega);  
        }
        
        // ***********************************************
        
        // [ Listar Bodegas por Identificación ]
        
        @GetMapping("/bodegas/(id_bodega)")
        public registroBodegas getConsultaBodegas(@PathVariable Integer id_bodega) //--> Regresa como tipo JSON
        {
            return rbService.findById(id_bodega);
        }
        
        // ***********************************************
        
        // [ Modificación datos de las Bodegas ]
        
        @PutMapping("/bodegas/(id)")
        public registroBodegas modificarDatosBodega(@RequestBody registroBodegas registroBodega, @PathVariable Integer id_bodega)
        {
            // [ Datos de los registros de las Bodegas, todos los de la tabla ]
                registroBodegas rBodegas = rbService.findById(id_bodega);
                rBodegas.setDireccion(rBodegas.getDireccion());
                rBodegas.setTipoBodega(rBodegas.getTipoBodega());
                rBodegas.setPais(rBodegas.getPais());
                rBodegas.setProvincia(rBodegas.getProvincia());
                rBodegas.setCiudad(rBodegas.getCiudad());
                                
                return rbService.save(rBodegas);
            
        }
        
        // ***********************************************
        
        // [ Eliminar las Bodegas de la Base de Datos ]
        
        @DeleteMapping("/bodegas/(id_bodegas)")
        public void eliminarUsuario(@PathVariable Integer id_bodega)
        {
            rbService.delete(id_bodega);
        }
        
        
}
