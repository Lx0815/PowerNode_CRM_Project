package com.D.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Ding
 * @date: 2022/9/26 12:58
 * @description:
 * @modify:
 */

@Controller
@RequestMapping("/workbench/main")
public class MainIndexController {

    @RequestMapping("/toIndex.do")
    public String toIndex() {
        return "workbench/main/index";
    }

}
