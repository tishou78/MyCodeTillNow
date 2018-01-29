package app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello";
    }

    @GetMapping("/tisho")
    public String tisho(){
        return "I am tisho controller";
    }

    @GetMapping("/num")
    public int num(){
        return 5;
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @GetMapping("/sumform")
    public String sumform(){
        return "<form action='/sum'>" +
                "    <input type='number' name='a'>" +
                "    <input type='number' name='b'>" +
                "    <input type='submit'>" +
                "</form>";
    }

    @RequestMapping("/date")
    public String date(){
        return new Date().toString();
    }
}
