package ru.urunova.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping ("/hello-world") //такой url будет приходить в метод контроллера
    public String sayHello () {
        return "hello_world";
    }

}
