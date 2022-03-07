package org.adaitw.crud_users.controller.impl;


import org.adaitw.crud_users.controller.Userscontroller;
import org.adaitw.crud_users.modelo.dto.Usuario;
import org.adaitw.crud_users.service.UserService;
import org.adaitw.crud_users.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsersControllerImpl implements Userscontroller {

    @Autowired
    UserService userService;

    /**
     * ENDPOINTS
     */
    @Override
    @PostMapping("/crear")
    public String crearUsuario(@RequestBody Usuario usuario) {
        System.out.println("crear:" + usuario.toString());
        return userService.crearUsuario(usuario);
    }

    @Override
    @PutMapping("/actualizar")
    public Boolean actualizarUsuario(@RequestBody Usuario usuarioActual) {
        System.out.println("actualizar:" + usuarioActual.toString());
        return true;
    }

    @Override
    @DeleteMapping("/eliminar")
    public String eliminarUsuario(@RequestBody Usuario usuarioAEliminar) {
        System.out.println("Eliminar" + usuarioAEliminar.toString());
        return "Usted ha llamado correctamente a la API";
    }
}
