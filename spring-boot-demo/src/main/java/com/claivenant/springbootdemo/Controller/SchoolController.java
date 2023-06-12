package com.claivenant.springbootdemo.Controller;

import com.claivenant.springbootdemo.Model2.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    @GetMapping("/{id}/{age}/{name}")
    public Student getStudent(@PathVariable("name") String studentName,
                              @PathVariable("id") int StudentId, @PathVariable ("age")int studentAge){
        Student student = new Student();
        student.setId(2);
        student.setAge(21);
        student.setName("Aili");
        return student;
    }
    @GetMapping("/name1")
    public String getStudent(@RequestParam(required = false,defaultValue = "Kananga") String name , @RequestParam int age){
        return "student name is :" +name+ " and age  is : " +age;
    }
}
