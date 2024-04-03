package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@SuppressWarnings("unused")
@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
        public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String major){

            User user= new User();
            user.setName("MARK");
            user.setEmail("mark@email.com");
            user.setMajor("Software Engineer");
            userRepository.save(user);
            return "Saved";
        
        }

        @GetMapping(path = "/all")
        public @ResponseBody Iterable<User> getAllUsers(){
            return userRepository.findAll();
        }
        

    
    
    
}
