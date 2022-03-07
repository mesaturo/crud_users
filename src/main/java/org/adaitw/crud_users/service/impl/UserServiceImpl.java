package org.adaitw.crud_users.service.impl;

import org.adaitw.crud_users.modelo.dto.Usuario;
import org.adaitw.crud_users.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String updateUser(Usuario usuarioNuevo) {
        System.out.println("updateUser" + usuarioNuevo.toString());
        return "Usted ha actualizado correctamente un usuario";
    }

    @Override
    public String crearUsuario(Usuario usuario) {
        System.out.println("crearUsuario" + usuario.toString());
        return "Usted a creado correctamente un usuario";
    }

    @Override
    public String delete(Usuario usuario) {
        System.out.println("delete" + usuario.toString());
        return "Usted a eliminado correctamente un usuario";
    }
}
