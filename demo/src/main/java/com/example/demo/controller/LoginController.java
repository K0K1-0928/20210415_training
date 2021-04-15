package com.example.demo.controller;

import com.example.demo.model.Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
	public String loginForm(Model model, @RequestParam(name = "url", required = false) String url) {
        model.addAttribute("login", new Login());
        model.addAttribute("url", url);
		return "login";
	}
    
    @PostMapping
    public String loginSubmit(Model model, @RequestParam(name = "url", required = false) String url, @ModelAttribute Login login) {
        if (StringUtils.isEmpty(url)) {
            return "result";
        }
        model.addAttribute("url", url);
        return "cushion";
    }
}
