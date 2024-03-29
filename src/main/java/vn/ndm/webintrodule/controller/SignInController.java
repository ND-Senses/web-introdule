package vn.ndm.webintrodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.ndm.webintrodule.obj.User;
import vn.ndm.webintrodule.service.UserService;

@Slf4j
@Controller
public class SignInController {
    final UserService service;

    @Autowired
    public SignInController(UserService service) {
        this.service = service;
    }

    @GetMapping("/signin")
    public String signInIndex(Model model) {
        // Thêm các attribute cần thiết cho trang sign-in
        // trỏ đến file index.html
        return "sign-in/index";
    }

    @PostMapping(value = {"/", "/signin"})
    public String signInSubmit(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        // Kiểm tra thông tin đăng nhập
        User user = service.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            log.info("Sign-in success: {}", user.getUsername());
            model.addAttribute("success", "You have successfully registered. Please login to continue.");
            // call sang api /home
            return "redirect:/hero-biz/index";
        }
        // Thêm thông báo lỗi vào mô hình
        model.addAttribute("error", "There was an error while registering. Please try again.");
        // Chuyển hướng người dùng đến trang đăng nhập lại
        return "sign-in/index";
    }
}