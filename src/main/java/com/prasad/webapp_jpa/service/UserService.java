package com.prasad.webapp_jpa.service;

import com.prasad.webapp_jpa.model.Users;
import com.prasad.webapp_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
        private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

        //Create operation
        public Users create(String username, String email, String message) {
            return userRepository.save(new Users(username, email, message));
        }
        //Retrieve operation
        public List<Users> getAll(){
            return userRepository.findAll();
        }
//
//        //Update operation
//        public Users update(String username, String email, String message) {
//            Users p = userRepository.findByUsername(username);
//            p.setemail(email);
//            p.setmessage(message);
//            return userRepository.save(p);
//        }
//
//        //Delete operation
//        public void deleteAll() {
//            userRepository.deleteAll();
//        }
//
//        public void delete(String username) {
//            Users p = userRepository.findByUsername(username);
//            userRepository.delete(p);
//        }

    public void saveto(Users users) {
        userRepository.save(users);
    }

    public List<Users> findAllto() {
        return userRepository.findAll();
    }

    public Optional<Users> findByIdto(String id) {
        return userRepository.findById(id);
    }

    public void deleteByIdto(String id) {
        userRepository.deleteById(id);
    }
}