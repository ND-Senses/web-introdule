package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String knightOne(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "knight-one/index";
    }
}
