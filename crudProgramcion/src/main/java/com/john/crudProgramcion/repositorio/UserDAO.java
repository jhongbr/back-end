package com.john.crudProgramcion.repositorio;

import com.john.crudProgramcion.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository <UserEntity, Long> {

}
