package com.claivenant.springbootdemo.Controller;

import com.claivenant.springbootdemo.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        return "Good Morning  Church";
    }
    @GetMapping( "/user")
    public User handleUser(){
        User user = new User();
        user.setId(1);
        user.setName("Wyatt");
        user.setEmailId("venant@gmail.com");
        return user;

    }
    @GetMapping("/request/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String name){
        return " The path variale is : "+ id +" " +name;
    }

    @GetMapping("/requestParam")
    public String requestParam(@RequestParam(name="fullName",required = false,defaultValue = "N/A") String name ,
    @RequestParam(required = false,defaultValue = "0") int age){
        return "Your name is  "+name+ " and your age is  "+age;
    }
    @GetMapping("/name")
    public String printName(@RequestParam(required = false, defaultValue ="No Name"
    ) String name ,@RequestParam String gender ){
        return "My name is "+name+ " and my gender is "+gender;

    }
}
