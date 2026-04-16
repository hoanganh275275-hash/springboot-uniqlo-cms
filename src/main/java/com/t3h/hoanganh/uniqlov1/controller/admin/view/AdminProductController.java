package com.t3h.hoanganh.uniqlov1.controller.admin.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cms/products")
public class AdminProductController {

    @GetMapping
    public String products() {
        return "cms_products";
    }

}
