package com.D.crm.workbench.web.controller;

import com.D.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Ding
 * @date: 2022/9/26 10:39
 * @description:
 * @modify:
 */

@Controller
public class WorkbenchIndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/workbench/index.do")
    public String toIndex() {
        return "workbench/index";
    }
}
