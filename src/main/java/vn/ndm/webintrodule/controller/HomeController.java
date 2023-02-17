package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "home/home";
    }

    @GetMapping("/home")
    public String home_v2(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "home/home";
    }

}