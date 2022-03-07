package org.adaitw.crud_users.controller;

import org.adaitw.crud_users.modelo.dto.Usuario;

/**
 * Interfaz que provee información y validación de usuarios
 *
 */

public interface Userscontroller {

    /**
     * @param usuario
     * @return true si creó el usuario y
     * retorna false si no lo creó.
     */

    String crearUsuario(Usuario usuario);

    /**
     * @param usuarioActual
     * @return true si actualizó el usuario y
     * retorna false si no lo actualizó.
     */
    Boolean actualizarUsuario(Usuario usuarioActual);

    /**
     * @param usuarioAEliminar
     * @return Exitoso si se eliminó correctamente
     * en caso contrario retorna el texto "No se eliminó"
     */

    String eliminarUsuario(Usuario usuarioAEliminar);

}
