package org.adaitw.crud_users.modelo.dto;


import lombok.*;
import org.adaitw.crud_users.controller.Userscontroller;

import java.io.Serializable;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString

public class Usuario implements Serializable {
    private String nombre;
    private String contrasenia;
    private String mail;

}
