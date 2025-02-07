package com.korit.springboot_study.repository;

import com.korit.springboot_study.entity.study.UserRole;
import com.korit.springboot_study.mapper.UserRoleMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRolePrepository {

    private UserRoleMapper userRoleMapper;

    public Optional<UserRole> save(UserRole userRole) {
        return userRoleMapper.insert(userRole) < 1 ? Optional.empty() : Optional.of(userRole);
    }

    public Optional<Boolean> saveSelective(int userId, String roleName) {
        return Optional.of(userRoleMapper.insertSelective(userId, roleName) < 1);
    }
}
