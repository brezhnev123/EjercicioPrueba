package com.operaciones.controller;
import com.operaciones.modelo.productosMarit;
import com.operaciones.interfaces.productosMaritService;
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
public class productosMaritController
{
    @Autowired
    
    /******* [ Creamos las variables privadas ] *******/
        
        private productosMaritService  pmService;
    
    /*************************************************/
    
    /******* [ Funciones para Registro Productos Marítimos ] *******/
    
        // [ Listar Productos Marítimos ]
    
        @GetMapping("/productosMaritimos")
        public List<productosMarit> listarProductosMaritimos()
        {
            return pmService.findAll();
        }
        
        // ***********************************************
        
        // [ Guardar Productos Marítimos ]
        
        @PostMapping("/productosMaritimos")
        public productosMarit save (@RequestBody productosMarit prodMar)
        {
            return pmService.save(prodMar);  
        }
        
        // ***********************************************
        
        // [ Listar Productos Marítimos por identificación ]
        
        @GetMapping("/productosMaritimos/(id_producto)")
        public productosMarit getConsultaProductosMarit(@PathVariable Integer id_producto) //--> Regresa como tipo JSON
        {
            return pmService.findById(id_producto);
        }
        
        // ***********************************************
        
        // [ Modificación datos del Producto Marítimos ]
        
        @PutMapping("/productosMaritimos/(id_producto)")
        public productosMarit modificarProductosMarit(@RequestBody productosMarit prodMar, @PathVariable Integer id_producto)
        {
            // [ Datos de los registros de los productos Terrestres, todos los de la tabla ]
            
                productosMarit pMaritimos = pmService.findById(id_producto);
                pMaritimos.setId_cliente(pMaritimos.getId_cliente());
                pMaritimos.setDescripción(pMaritimos.getDescripción());
                pMaritimos.setCantidad(pMaritimos.getCantidad());
                pMaritimos.setPeso(pMaritimos.getPeso());
                pMaritimos.setId_bodega(pMaritimos.getId_bodega());
                                
                return pmService.save(pMaritimos);
            
        }
        
        // ***********************************************
        
        // [ Eliminar el producto maritimo de la Base de Datos ]
        
        @DeleteMapping("/productosMaritimos/(id_producto)")
        public void eliminarProductosTerrestres(@PathVariable Integer id_producto)
        {
            pmService.delete(id_producto);
        }
        
        
}