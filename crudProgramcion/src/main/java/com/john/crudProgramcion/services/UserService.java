package com.john.crudProgramcion.services;

import com.john.crudProgramcion.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser (UserDTO UserDTO);
    List<UserDTO> getUsers();
}
