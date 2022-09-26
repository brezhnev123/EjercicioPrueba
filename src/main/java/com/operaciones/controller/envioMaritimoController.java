package com.operaciones.controller;
import com.operaciones.modelo.envioMaritimo;
import com.operaciones.service.envioMaritimoService;
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
public class envioMaritimoController
{
    @Autowired
    
    /******* [ Creamos las variables privadas ] *******/
        
        private envioMaritimoService  emService;
    
    /*************************************************/
    
    /******* [ Funciones para los Envios Marítimos ] *******/
    
        // [ Listar los Envios Marítimos ]
    
        @GetMapping("/envioMaritimos")
        public List<envioMaritimo> listarEnviosMaritimos()
        {
            return emService.findAll();
        }
        
        // ***********************************************
        
        // [ Guardar los Envios Terrestres ]
        
        @PostMapping("/envioMaritimos")
        public envioMaritimo save (@RequestBody envioMaritimo envioMar)
        {
            return emService.save(envioMar);  
        }
        
        // ***********************************************
        
        // [ Listar Envios Maritimos por Identificación ]
        
        @GetMapping("/envioMaritimo/(id_guia)")
        public envioMaritimo getConsultaEnvioMaritimo(@PathVariable Integer id_guia) //--> Regresa como tipo JSON
        {
            return emService.findById(id_guia);
        }
        
        // ***********************************************
        
        /* [ Modificación datos del Envio Terrestre ]
        
        @PutMapping("/envioTerrestre/(id_guia)")
        public envioMaritimo modificarEnvioMaritimo(@RequestBody envioMaritimo envioMar, @PathVariable Integer id_guia)
        {
            // [ Datos de la Guia Marítima, todos los de la tabla ]
            
                envioMaritimo envioMari = emService.findById(id_guia);
                envioMari.setId_cliente(envioMari.getId_cliente());
                envioMari.setPrecio(envioMari.getPrecio());
                envioMari.setId_prod_mar(envioMari.getId_prod_mar());
                envioMari.setFecha_registro(envioMari.getFecha_registro());
                envioMari.setFecha_entrega(envioMari.getFecha_entrega());
                envioMari.setNro_flota(envioMari.getNro_flota());
                envioMari.setId_bodega_ent(envioMari.getId_bodega_ent());
                envioMari.setNro_guia(envioMari.getNro_guia());
                
                return emService.save(envioMari);
            
        }*/
        
        // ***********************************************
        
        // [ Eliminar el Envio Marítimo de la Base de Datos ]
        
        @DeleteMapping("/envioMaritimo/(id_guia)")
        public void eliminarEnvioTerrestre(@PathVariable String nro_guia)
        {
            emService.delete(nro_guia);
        }
        
        
}
 