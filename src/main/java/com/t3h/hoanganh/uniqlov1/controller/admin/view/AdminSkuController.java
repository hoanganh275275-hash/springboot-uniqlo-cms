package com.t3h.hoanganh.uniqlov1.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/skus")
public class AdminSkuController {

    @GetMapping
    public String skus() {
        return "cms_skus";
    }

}
