package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hero-biz")
public class HeroBizController {

    private static final String HERO_BIZ = "hero-biz/";

    @GetMapping("/index")
    public String heroBiz(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return HERO_BIZ + "index";
    }

    @GetMapping("/index2")
    public String heroBizIndex2(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return HERO_BIZ + "index-2";
    }

    @GetMapping("/index3")
    public String heroBizIndex3(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return HERO_BIZ + "index-3";
    }

    @GetMapping("/index4")
    public String heroBizIndex4(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return HERO_BIZ + "index-4";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return HERO_BIZ + "blog";
    }

    @GetMapping("/portfolio-details")
    public String portfolioDetails(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return HERO_BIZ + "portfolio-details";
    }

    @GetMapping("/blog-details")
    public String blogDetails(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return HERO_BIZ + "blog-details";
    }
}
