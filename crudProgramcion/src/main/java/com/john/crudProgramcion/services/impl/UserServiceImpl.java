package com.john.crudProgramcion.services.impl;

import com.john.crudProgramcion.dto.UserDTO;
import com.john.crudProgramcion.entity.UserEntity;
import com.john.crudProgramcion.repositorio.UserDAO;
import com.john.crudProgramcion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public UserDTO saveUser(UserDTO UserDTO) {
        UserEntity userEntity = UserEntity.builder()
                .idUser(UserDTO.getIdUser())
                .name(UserDTO.getName())
                .email(UserDTO.getEmail())
                .birthdate(UserDTO.getBirthdate())
                .build();
    }
    @Override
    public List<UserDTO> getUsers() {
        List<UserEntity> userEntities = userDAO.findAll();
        return userEntities.stream()
                .map
                .idUser(saveUser.getIdUser())
                .name(saveUser.getName())
                .email(saveUser.getEmail())
                .birthdate(saveUser.getBirthdate())
                .build()
                .toList();
    }
}
