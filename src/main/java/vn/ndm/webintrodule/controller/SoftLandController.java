package vn.ndm.webintrodule.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.ndm.webintrodule.obj.User;
import vn.ndm.webintrodule.service.UserService;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/soft-land")
public class SoftLandController {

    private static final String SOFT_LAND = "soft-land/";
    final UserService service;

    @Autowired
    public SoftLandController(UserService service) {
        this.service = service;
    }

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

    @GetMapping("/manager")
    public String getAllEmployees(Model model) {
        List<User> user = service.findAll();
        log.info("users: {}", user);
        model.addAttribute("users", user);
        return SOFT_LAND + "manager";
    }

    // Xử lý yêu cầu sửa user
    @GetMapping("/soft-land/editUser/{userId}")
    public ResponseEntity<User> editUser(@PathVariable Long userId) {
        // Thực hiện lấy thông tin user từ database
        User user = service.getUserById(userId);

        if (user != null) {
            // Trả về thông tin user dưới dạng JSON
            return new ResponseEntity<>(user, HttpStatus.OK);
        }else{
            // Trả về lỗi nếu không tìm thấy user
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    // Xử lý cập nhật thông tin user sau khi sửa
//    @PostMapping("/soft-land/updateUser")
//    public ResponseEntity<Void> updateUser(@RequestBody User user) {
//        // Thực hiện cập nhật thông tin user vào database
//        service.updateUser(user);
//        // Trả về thành công nếu cập nhật thành công
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
