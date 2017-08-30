package com.larrylian.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lianjw22529 on 2017/8/30
 */
@Controller
public class IndexController {
    @RequestMapping({"index", "/", "index.html"})
    public String index() {
        return "index";
    }
}
