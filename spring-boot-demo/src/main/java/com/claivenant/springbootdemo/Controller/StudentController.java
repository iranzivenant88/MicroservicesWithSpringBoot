package com.claivenant.springbootdemo.Controller;

import com.claivenant.springbootdemo.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student();
        student.setId(001);
        student.setName("Wyatt");
        student.setAge(18);
        return student;
    }

    @GetMapping("/student/{id}/{name}")
    public String getStudentDetails(@PathVariable("id") int identity ,@PathVariable String name ){
        return "Your id is  : "+identity+ " and your name is : " +name;

    }

    @GetMapping("/students")
    public String requestParam(@RequestParam String name,
                               @RequestParam(required = false,defaultValue = "Zero") String age){

        return "My name is : " +name+ " and my age is : " +age;

    }
}
