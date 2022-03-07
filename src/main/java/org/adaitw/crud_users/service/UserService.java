package org.adaitw.crud_users.service;

import org.adaitw.crud_users.modelo.dto.Usuario;

public interface UserService {

    String updateUser(Usuario usuarioNuevo);

    String crearUsuario(Usuario usuario);

    String delete (Usuario usuario);
}
