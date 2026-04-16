package com.t3h.hoanganh.uniqlov1.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/api/users")
public class UserController {

    @GetMapping
    public String userList() {
        return "user_list";
    }

    @PostMapping
    public String userAdd() {
        return "user_form";
    }

}
