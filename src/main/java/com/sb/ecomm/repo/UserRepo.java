package com.sb.ecomm.repo;

import org.springframework.data.repository.CrudRepository;

import com.sb.ecomm.entity.User;

public interface UserRepo extends CrudRepository<User,Integer>{
    
}
