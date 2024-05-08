package com.sb.ecomm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.ecomm.entity.User;
import com.sb.ecomm.repo.UserRepo;
import com.sb.ecomm.contract.UserContract;;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    public List<UserContract> getAllUsers(){
        List<UserContract> result=new ArrayList();
        for(User u:repo.findAll()){
            result.add(new UserContract(u.getId(), u.getName(),u.getEmail()));
        }
        return result;
    }

    public void save(UserContract uc){
        User user;
        if(uc.getId()>0){
            user=repo.findById(uc.getId()).get();
        }else{
            user=new User();
        }
        user.setName(uc.getName());
        user.setEmail(uc.getEmail());
        repo.save(user);

    }

    public void removeUser(int id){
        repo.deleteById(id);
    }
}
