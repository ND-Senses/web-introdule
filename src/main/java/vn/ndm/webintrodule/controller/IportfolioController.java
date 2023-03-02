package vn.ndm.webintrodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iportfolio")
public class IportfolioController {
    private static final String IPORTFOLIO = "iportfolio/";

    @GetMapping("/index")
    public String homeIPortfolio(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return IPORTFOLIO + "index";
    }

    @GetMapping("/portfolio-details")
    public String portfolioDetails(Model model) {
        // Thêm các attribute cần thiết cho trang home
        return IPORTFOLIO + "portfolio-details";
    }
}
