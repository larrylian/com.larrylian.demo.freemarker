package com.larrylian.demo.controller;

import com.larrylian.demo.utils.FreemarkerUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lianjw22529 on 2017/8/30
 */
@Controller
public class FreemarkerController {
    @RequestMapping("/freemarker/simple")
    @ResponseBody
    public String getFreemarkerSimple(String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        String msg = FreemarkerUtils.instance.autoFreeMarker("freemarker/simple.ftl", map);
        return msg;
    }
}
