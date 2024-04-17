package com.john.crudProgramcion.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long idUser;
    private String name;
    private String email;
    private Date birthdate;
}
