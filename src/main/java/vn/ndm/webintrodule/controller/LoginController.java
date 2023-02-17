package vn.ndm.webintrodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.ndm.webintrodule.service.User;
import vn.ndm.webintrodule.service.UserRepository;

@Slf4j
@Controller
public class LoginController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public String login(Model model) {
        // Thêm các attribute cần thiết cho trang login
        // trỏ đến file login.html
        return "login/login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {
        // Kiểm tra thông tin đăng nhập
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            log.info("Login success: {}", user.toString());
            // call sang api /home
            return "redirect:/home";
        }
        // Thêm thông báo lỗi vào mô hình
        model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng");
        // Chuyển hướng người dùng đến trang đăng nhập lại
        return "login/login";
    }
}