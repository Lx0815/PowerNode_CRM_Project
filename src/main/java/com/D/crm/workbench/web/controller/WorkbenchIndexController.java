package com.D.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Ding
 * @date: 2022/9/26 10:39
 * @description:
 * @modify:
 */

@Controller
public class WorkbenchIndexController {

    @RequestMapping("/workbench/index.do")
    public String toIndex() {
        return "workbench/index";
    }
}
