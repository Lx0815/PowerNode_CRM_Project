package com.D.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Ding
 * @date: 2022/9/25 12:25
 * @description:
 * @modify:
 */

@Controller
public class SettingsIndexController {

    @RequestMapping("/")
    public String index() {
        // 请求转发
        return "index";
    }

}
