package com.operaciones.controller;
import com.operaciones.modelo.productosTerr;
import com.operaciones.interfaces.productosTerrService;
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
public class productosTerrController
{
    @Autowired
    
    /******* [ Creamos las variables privadas ] *******/
        
        private productosTerrService  ptService;
    
    /*************************************************/
    
    /******* [ Funciones para Registro Productos Terrestres ] *******/
    
        // [ Listar Productos Terrestres ]
    
        @GetMapping("/productosTerrestres")
        public List<productosTerr> listarProductosTerrestres()
        {
            return ptService.findAll();
        }
        
        // ***********************************************
        
        // [ Guardar Productos Terrestres ]
        
        @PostMapping("/productosTerrestres")
        public productosTerr save (@RequestBody productosTerr prodTerr)
        {
            return ptService.save(prodTerr);  
        }
        
        // ***********************************************
        
        // [ Listar Productos Terrestres por identificación ]
        
        @GetMapping("/productosTerrestres/(id_producto)")
        public productosTerr getConsultaProductosTerr(@PathVariable Integer id_producto) //--> Regresa como tipo JSON
        {
            return ptService.findById(id_producto);
        }
        
        // ***********************************************
        
        // [ Modificación datos del Producto Terrestre ]
        
        @PutMapping("/productosTerrestres/(id_producto)")
        public productosTerr modificarProductosTerrestres(@RequestBody productosTerr productosTerr, @PathVariable Integer id_producto)
        {
            // [ Datos de los registros de los productos Terrestres, todos los de la tabla ]
            
                productosTerr pTerrestre = ptService.findById(id_producto);
                pTerrestre.setId_cliente(pTerrestre.getId_cliente());
                pTerrestre.setDescripción(pTerrestre.getDescripción());
                pTerrestre.setCantidad(pTerrestre.getCantidad());
                pTerrestre.setPeso(pTerrestre.getPeso());
                pTerrestre.setId_bodega(pTerrestre.getId_bodega());
                                
                return ptService.save(pTerrestre);
            
        }
        
        // ***********************************************
        
        // [ Eliminar el producto terrestre de la Base de Datos ]
        
        @DeleteMapping("/productosTerrestres/(id_producto)")
        public void eliminarProductosTerrestres(@PathVariable Integer id_producto)
        {
            ptService.delete(id_producto);
        }
        
        
}