package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hi")
public class Hello {


    @ResponseBody
    @RequestMapping("/say")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/db")
    public String db(){
        return "hello";
    }
}
