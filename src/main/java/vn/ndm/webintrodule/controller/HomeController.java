package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "home/home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "home/about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "home/contact";
    }

    @GetMapping("/services")
    public String services(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "home/services";
    }

    @GetMapping("/index")
    public String index(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "home/index";
    }
}
