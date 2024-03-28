package com.example.form1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form1.model.User;
import com.example.form1.repository.UserRepository;

import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/form")
	public String getFormPage(User user) {
		return "form2";
	}

	/*@PostMapping("/form")
	public String saveUser(User user, Model model) {
		userRepository.save(user);
		 model.addAttribute("message", "Submitted Sucessfully");
		return "form";
	}
}*/

@PostMapping("/form")
public String submitForm(@ModelAttribute("user") User user) {
    // Additional processing/validation if needed
    userRepository.save(user);
    return "redirect:/success"; // Redirect to a success page or another appropriate endpoint
}
}
/*@GetMapping("/form")
public String getFormPage(User user) {
    return "form";
}

@PostMapping("/form")
public String saveUser(User user, Model model) {

    userRepository.save(user);
    model.addAttribute("message", "Submitted Sucessfully");
    return "form";*/