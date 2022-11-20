package ru.skypro.homework.controller;

import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.User;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class UserController {
    @PatchMapping("/me")
    public User updateUser( @RequestBody User user){
        System.out.println("hello");
        return new User();
    }

}
