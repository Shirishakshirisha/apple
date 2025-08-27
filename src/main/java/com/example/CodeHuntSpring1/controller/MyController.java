package com.example.CodeHuntSpring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


    @GetMapping("/index")
    public String indexpage(){
        return "index";
    }


    @GetMapping("/admin")
    public String adminpage(){
        return "admin";
    }



    @GetMapping("/error")
    public String errorpage(){
        return "error";
    }



    @GetMapping("/member")
    public String memberpage(){
        return "member";
    }


    


}
