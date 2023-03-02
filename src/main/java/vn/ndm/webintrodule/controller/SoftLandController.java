package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/soft-land")
public class SoftLandController {

    private static final String SOFT_LAND = "soft-land/";

    @GetMapping("/index")
    public String homeSoftLand(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return SOFT_LAND + "index";
    }

    @GetMapping("/features")
    public String features(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return SOFT_LAND + "features";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return SOFT_LAND + "contact";
    }

    @GetMapping("/pricing")
    public String pricing(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return SOFT_LAND + "pricing";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return SOFT_LAND + "blog";
    }

    @GetMapping("/blog-single")
    public String blogSingle(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return SOFT_LAND + "blog-single";
    }
}
