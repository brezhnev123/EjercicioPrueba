
package com.operaciones.controller;
import com.operaciones.modelo.usuarios;
import com.operaciones.interfaces.usuarioService;
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
public class usuarioController
{
    @Autowired
    
    /******* [ Creamos las variables privadas ] *******/
        
        private usuarioService  uService;
    
    /*************************************************/
    
    /******* [ Funciones para Usuarios ] *******/
    
        // [ Listar Usuarios ]
    
        @GetMapping("/usuarios")
        public List<usuarios> listarUsuarios()
        {
            return uService.findAll();
        }
        
        // ***********************************************
        
        // [ Guardar Usuarios ]
        
        @PostMapping("/usuarios")
        public usuarios save (@RequestBody usuarios usuario)
        {
            return uService.save(usuario);  
        }
        
        // ***********************************************
        
        // [ Listar Usuario por Identificación ]
        
        @GetMapping("/usuarios/(id)")
        public usuarios getConsultaUsuario(@PathVariable Integer id) //--> Regresa como tipo JSON
        {
            return uService.findById(id);
        }
        
        // ***********************************************
        
        // [ Modificación datos del Usuario ]
        
        @PutMapping("/usuarios/(id)")
        public usuarios modificarDatosUsuario(@RequestBody usuarios usuario, @PathVariable Integer id)
        {
            // [ Datos del Usuario, todos los de la tabla ]
            
                usuarios usuActual = uService.findById(id);
                usuActual.setNombres(usuario.getNombres());
                usuActual.setApellidos(usuario.getApellidos());
                usuActual.setDireccion(usuario.getApellidos());
                usuActual.setMovil(usuario.getMovil());
                usuActual.setTelefono(usuario.getMovil());
                usuActual.setTipoPersona(usuario.getTipoPersona());
                
                return uService.save(usuActual);
            
        }
        
        // ***********************************************
        
        // [ Eliminar el usuario de la Base de Datos ]
        
        @DeleteMapping("/usuarios/(id)")
        public void eliminarUsuario(@PathVariable Integer id)
        {
            uService.delete(id);
        }
        
        
}
