package com.meganar.smarthrms.UserAccountAuthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginPage {
	@GetMapping("/login")
	public String showLoginPage() {
		return "loginpage";
	}
	@PostMapping("/login")
	public String showDashboard(){
		return "dashboard";
	}
}
