package com.momento.valorativo.jacoboh.services;

import com.momento.valorativo.jacoboh.models.UserModel;
import com.momento.valorativo.jacoboh.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }

    public UserModel updateByID(UserModel request, Long id ){
        UserModel userModel = userRepository.findById(id).get();
        userModel.setName(request.getName());
        userModel.setEmail(request.getEmail());
        userModel.setPassword(request.getPassword());
        userRepository.save(userModel);
        return userModel;
    }

    public Boolean deleteUser (Long id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }

}
