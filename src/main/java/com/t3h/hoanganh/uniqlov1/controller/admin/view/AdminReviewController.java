package com.t3h.hoanganh.uniqlov1.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/reviews")
public class AdminReviewController {

    @GetMapping
    public String reviews() {
        return "cms_reviews";
    }
}
