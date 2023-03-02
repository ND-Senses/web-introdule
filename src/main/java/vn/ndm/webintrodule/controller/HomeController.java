package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/knight-one")
public class HomeController {
    @GetMapping("/index")
    public String knightOne(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "knight-one/index";
    }
}
