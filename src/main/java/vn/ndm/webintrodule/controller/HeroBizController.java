package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroBizController {
    @GetMapping("/index1")
    public String index1(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "hero-biz/index";
    }

    @GetMapping("/index2")
    public String index2(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "hero-biz/index-2";
    }

    @GetMapping("/index3")
    public String index3(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "hero-biz/index-3";
    }

    @GetMapping("/index4")
    public String index4(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "hero-biz/index-4";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "hero-biz/blog";
    }

    @GetMapping("/portfolio-details")
    public String portfolioDetails(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "hero-biz/portfolio-details";
    }

    @GetMapping("/blog-details")
    public String blogDetails(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return "hero-biz/blog-details";
    }
}
