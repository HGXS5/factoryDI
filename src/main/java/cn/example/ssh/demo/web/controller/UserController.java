package cn.example.ssh.demo.web.controller;


import cn.example.ssh.demo.entity.User;
import cn.example.ssh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/user";
    }

    @GetMapping
    public String users(Model model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "/user/list";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(null);
    }


    @GetMapping("/add")
    public String toAdd() {
        return "/user/add";
    }
}