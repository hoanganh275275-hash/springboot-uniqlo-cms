package com.t3h.hoanganh.uniqlov1.controller.admin.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cms/stats")
public class AdminStatsController {

    @GetMapping
    public String stats() {
        return "cms_visit_stats";
    }

}
