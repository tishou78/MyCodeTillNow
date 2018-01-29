package app.controllers;

import app.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        List<Student> students = loadStudents();
        model.addAttribute("title","This is head of the page");
        model.addAttribute("students",students);
        return "hello";
    }

    private List<Student> loadStudents() {
        return Arrays.asList(
                new Student("Peter", 22),
                new Student("Mariq", 19),
                new Student("Gosho", 45),
                new Student("Ivan", 23)
        );
    }
}
