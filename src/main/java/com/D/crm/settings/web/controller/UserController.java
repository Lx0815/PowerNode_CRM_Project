package com.D.crm.settings.web.controller;

import com.D.crm.settings.mapper.UserMapper;
import com.D.crm.settings.model.User;
import com.D.crm.settings.service.UserService;
import com.D.crm.settings.web.model.ResponseCode;
import com.D.crm.settings.web.model.ResponseObj;
import javafx.util.Pair;
import org.apache.poi.ss.usermodel.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Ding
 * @date: 2022/9/25 12:57
 * @description:
 * @modify:
 */

@Controller
@RequestMapping("/settings/qx/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin.do")
    public String toLogIn() {
        return "settings/qx/user/login";
    }


    @PostMapping("/login.do")
    @ResponseBody
    public Object login(String loginAct, String loginPwd, String isRemPwd,
                        HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("loginAct", loginAct);
        map.put("loginPwd", loginPwd);
        map.put("isRemPwd", isRemPwd);

        User user = userService.login(map);

        Pair<Boolean, String> result = userService.checkUser(user, request.getRemoteAddr());
        if (result.getKey()) {
            // 账号没问题
            return new ResponseObj(ResponseCode.SUCCESS_CODE, user, "登录成功");
        } else {
            return new ResponseObj(ResponseCode.FAIL_CODE, result.getValue());
        }
    }
}

