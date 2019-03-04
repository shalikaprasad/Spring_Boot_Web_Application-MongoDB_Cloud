package com.prasad.webapp_jpa.controller;

import com.prasad.webapp_jpa.model.Users;
import com.prasad.webapp_jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

     @Autowired
     private UserService userService;


    @RequestMapping("/saveuser")
    public String create(@RequestParam String username, @RequestParam String email, @RequestParam String message) {
        Users p = userService.create(username, email, message);
        return p.toString();
    }

    @RequestMapping("/getAll")
    public List<Users> getAll(){
        return userService.getAll();
    }
//    @RequestMapping("/update")
//    public String update(@RequestParam String username, @RequestParam String email, @RequestParam String message) {
//        Users p = userService.update(username, email, message);
//        return p.toString();
//    }
//    @RequestMapping("/delete")
//    public String delete(@RequestParam String username) {
//        userService.delete(username);
//        return "Deleted "+username;
//    }
//    @RequestMapping ("/deleteAll")
//    public String deleteAll() {
//        userService.deleteAll();
//        return "Deleted all records";
//    }

    @PostMapping("/addUsers")
    public String saveUsers(@RequestBody Users users) {
        userService.saveto(users);
        return "Added Users with id : " + users.getId();
    }

    @GetMapping("/findAllUsers")
    public List<Users> getUserss() {
        return userService.findAllto();
    }

    @GetMapping("/findAllUsers/{id}")
    public Optional<Users> getUsers(@PathVariable String id) {
        return userService.findByIdto(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUsers(@PathVariable String id) {
        userService.deleteByIdto(id);
        return "Users deleted with id : " + id;
    }

}