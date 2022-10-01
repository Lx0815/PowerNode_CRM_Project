package com.D.crm.settings.web.controller;

import com.D.crm.commond.contants.Constants;
import com.D.crm.commond.utils.Base64Utils;
import com.D.crm.commond.utils.CookieBuilder;
import com.D.crm.settings.model.User;
import com.D.crm.settings.service.UserService;
import com.D.crm.settings.web.model.ResponseCode;
import com.D.crm.settings.web.model.ResponseObj;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

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
    public String toLogin(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (Objects.nonNull(cookies)) {
            Arrays.stream(cookies)
                    .filter(cookie -> Objects.nonNull(cookie)
                            && (ObjectUtils.nullSafeEquals(cookie.getName(), Constants.LOGIN_ACT)
                            || ObjectUtils.nullSafeEquals(cookie.getName(), Constants.LOGIN_PWD)))
                    .forEach(cookie -> {
                        if (ObjectUtils.nullSafeEquals(cookie.getName(), Constants.LOGIN_ACT)) {
                            request.setAttribute(Constants.LOGIN_ACT, Base64Utils.decode(cookie.getValue()));
                            request.setAttribute(Constants.IS_REMEMBER_PASSWORD, "true");
                        } else if (ObjectUtils.nullSafeEquals(cookie.getName(), Constants.LOGIN_PWD)) {
                            // 密码不进行解密
                            request.setAttribute(Constants.LOGIN_PWD, cookie.getValue());
                        }
                    });
        }
        return "settings/qx/user/login";
    }


    @PostMapping("/login.do")
    @ResponseBody
    public Object login(String loginAct, String loginPwd, String isRemPwd,
                        HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>();
        map.put("loginAct", loginAct);
        map.put("loginPwd", Base64Utils.decode(loginPwd));

        User user = userService.login(map);

        Pair<Boolean, String> result = userService.checkUser(user, request.getRemoteAddr());
        if (result.getKey()) {
            if (ObjectUtils.nullSafeEquals("true", isRemPwd)) {

                Cookie actCookie = CookieBuilder.createCookie(Constants.LOGIN_ACT, loginAct, true)
                        .setMaxAge(Constants.TEN_DAY)
                        .getCookie();
                Cookie pwdCookie = CookieBuilder.createCookie(Constants.LOGIN_PWD, Base64Utils.decode(loginPwd), true)
                        .setMaxAge(Constants.TEN_DAY)
                        .getCookie();

                response.addCookie(actCookie);
                response.addCookie(pwdCookie);
            } else {
                CookieBuilder.removeCookie(response, Constants.LOGIN_ACT);
                CookieBuilder.removeCookie(response, Constants.LOGIN_PWD);
            }
            // 账号没问题
            session.setAttribute(Constants.SESSION_USER, user);
            return new ResponseObj(ResponseCode.SUCCESS_CODE, "登录成功");
        } else {
            return new ResponseObj(ResponseCode.FAIL_CODE, result.getValue());
        }
    }

    @RequestMapping("/exit.do")
    public String exit(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        Cookie[] cookies = request.getCookies();
        Arrays.stream(cookies).forEach(cookie -> CookieBuilder.removeCookie(response, cookie.getName()));
        session.invalidate();
        return "redirect:/";
    }
}
