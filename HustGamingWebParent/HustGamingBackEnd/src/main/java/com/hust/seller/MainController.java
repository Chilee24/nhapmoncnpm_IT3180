package com.hust.seller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
    public class MainController {
    @GetMapping("/")
    public String Viewindex(){
        return "index";
    }
    @GetMapping("/login")
    public String viewLoginPage() {
            return "login";
    }
}