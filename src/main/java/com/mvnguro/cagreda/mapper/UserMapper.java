package com.mvnguro.cagreda.mapper;

import com.mvnguro.cagreda.domain.User;
import com.mvnguro.cagreda.model.UsuerCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UsuerCommand userToUserCommand(User user);

    User userCommandToUser (UsuerCommand userCommand);
}
