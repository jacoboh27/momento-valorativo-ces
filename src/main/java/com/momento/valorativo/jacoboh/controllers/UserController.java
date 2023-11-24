package com.momento.valorativo.jacoboh.controllers;

import com.momento.valorativo.jacoboh.models.UserModel;
import com.momento.valorativo.jacoboh.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @PutMapping(path = "{id}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable Long id){
        return this.userService.updateByID(request, id);
    }

    @DeleteMapping(path = "{id}")
    public String deleteById(@RequestBody UserModel request, @PathVariable Long id){
        boolean ok = this.userService.deleteUser(id);
        if (ok){
            return "Usuario eliminado correctamente";
        } else {
            return "no se pudo eliminar el usuario";
        }
    }







}
