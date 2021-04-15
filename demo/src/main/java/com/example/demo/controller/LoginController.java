package com.example.demo.controller;

import com.example.demo.model.Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
	public String loginForm(Model model) {
        model.addAttribute("login", new Login());
		return "login";
	}
    
    @PostMapping
    public String loginSubmit(@ModelAttribute Login login) {
        return "result";
    }
}
