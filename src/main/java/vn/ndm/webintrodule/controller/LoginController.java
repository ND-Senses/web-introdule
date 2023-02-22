package vn.ndm.webintrodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.ndm.webintrodule.obj.User;
import vn.ndm.webintrodule.service.UserService;

@Slf4j
@Controller
public class LoginController {
    @Autowired
    UserService service;

    @GetMapping("/login")
    public String login(Model model) {
        // Thêm các attribute cần thiết cho trang login
        // trỏ đến file index.html
        return "login/index";
    }

    @PostMapping(value = {"/", "/login"})
    public String loginSubmit(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        // Kiểm tra thông tin đăng nhập
        log.info("#Username {}, password: {}", username, password);
        User user = service.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            log.info("Login success: {}", user.toString());
            // call sang api /home
            return "redirect:home";
        }
        // Thêm thông báo lỗi vào mô hình
        model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng");
        // Chuyển hướng người dùng đến trang đăng nhập lại
        return "login/index";
    }

    @GetMapping("/sign-up")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup/index";
    }


    // POST request for signup form
    @PostMapping("/sign-up")
    public String processSignupForm(Model model, @ModelAttribute("user") User user) {
        // Check if the username already exists in the database
        User u = service.findByUsername(user.getUsername());
        if (u != null) {
            model.addAttribute("error", "Username already exists!");
            return "signup/index";
        }
        model.addAttribute("success", "Sign up Success!");
        // Save the user to the database
        service.saveUser(user);
        return "signup/index";
    }
}