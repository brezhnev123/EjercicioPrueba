
package com.operaciones.controller;
import com.operaciones.modelo.envioTerrestre;
import com.operaciones.interfaces.envioTerrestreService;
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
public class envioTerrestreController
{
    @Autowired
    
    /******* [ Creamos las variables privadas ] *******/
        
        private envioTerrestreService  etService;
    
    /*************************************************/
    
    /******* [ Funciones para los Envios Terrestres ] *******/
    
        // [ Listar los Envios Terrestres ]
    
        @GetMapping("/envioTerrestre")
        public List<envioTerrestre> listarEnviosTerrestres()
        {
            return etService.findAll();
        }
        
        // ***********************************************
        
        // [ Guardar los Envios Terrestres ]
        
        @PostMapping("/envioTerrestre")
        public envioTerrestre save (@RequestBody envioTerrestre envioTerr)
        {
            return etService.save(envioTerr);  
        }
        
        // ***********************************************
        
        // [ Listar Envios Terrestres por Identificación ]
        
        @GetMapping("/envioTerrestre/(id_guia)")
        public envioTerrestre getConsultaEnvioTerrestre(@PathVariable Integer id_guia) //--> Regresa como tipo JSON
        {
            return etService.findById(id_guia);
        }
        
        // ***********************************************
        
        /*[ Modificación datos del Envio Terrestre ]
        
        @PutMapping("/envioTerrestre/(id_guia)")
        public envioTerrestre modificarEnvioTerrestre(@RequestBody envioTerrestre envioTerr, @PathVariable Integer id_guia)
        {
            // [ Datos del envio terrestre, todos los de la tabla ]
                
                envioTerrestre envioTerre = etService.findById(id_guia);
                envioTerre.setId_cliente(envioTerre.getId_cliente());
                envioTerre.setPrecio(envioTerre.getPrecio());
                envioTerre.setId_prod_terr(envioTerre.getId_prod_terr());
                envioTerre.setFecha_registro(envioTerre.getFecha_registro());
                envioTerre.setFecha_entrega(envioTerre.getFecha_entrega());
                envioTerre.setPlaca_vehiculo(envioTerre.getPlaca_vehiculo());
                envioTerre.setId_bodega_ent(envioTerre.getId_bodega_ent());
                envioTerre.setNro_guia(envioTerre.getNro_guia());
                
                return etService.save(envioTerre);
            
        }*/
        
        // ***********************************************
        
        // [ Eliminar el Envio Terrestre de la Base de Datos ]
        
        @DeleteMapping("/envioTerrestre/(id_guia)")
        public void eliminarEnvioTerrestre(@PathVariable String nro_guia)
        {
            etService.delete(nro_guia);
        }
        
        
}
