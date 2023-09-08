package vn.ndm.webintrodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.ndm.webintrodule.obj.User;
import vn.ndm.webintrodule.service.UserService;

@Slf4j
@Controller
public class SignUpController {
    private static final String SIGN_UP = "sign-up/";
    @Autowired
    UserService service;

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return SIGN_UP + "index";
    }

    // POST request for signup form
    @PostMapping("/signup")
    public String processSignupForm(Model model, @ModelAttribute("user") User user) {
        // Check if the username already exists in the database
        User u = service.findByUsername(user.getUsername());
        if (u != null) {
            model.addAttribute("error", "Username already exists!");
            return SIGN_UP + "index";
        }
        if (user.getUsername().equals("") || user.getPassword().equals("")) {
            model.addAttribute("error", "Username and password not found!");
            return SIGN_UP + "index";
        }
        model.addAttribute("success", "Sign up Success!");
        // Save the user to the database
        service.saveUser(user);
        return SIGN_UP + "index";
    }
}
