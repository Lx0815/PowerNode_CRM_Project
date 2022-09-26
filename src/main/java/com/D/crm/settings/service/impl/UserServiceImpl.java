package com.D.crm.settings.service.impl;

import com.D.crm.commond.utils.DateFormatUtils;
import com.D.crm.settings.mapper.UserMapper;
import com.D.crm.settings.model.User;
import com.D.crm.settings.model.UserExample;
import com.D.crm.settings.service.UserService;
import javafx.util.Pair;
import logger.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: Ding
 * @date: 2022/9/25 19:31
 * @description:
 * @modify:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(Map<String, Object> map) {
        String loginAct = (String) map.get("loginAct");
        String loginPwd = (String) map.get("loginPwd");


        UserExample loginExample = new UserExample();
        loginExample.createCriteria()
                        .andLoginActEqualTo(loginAct)
                        .andLoginPwdEqualTo(loginPwd);
        List<User> userList = userMapper.selectByExample(loginExample);

        if (ObjectUtils.isEmpty(userList)) {
            return null;
        }
        return userList.get(0);
    }

    @Override
    public Pair<Boolean, String> checkUser(User user, String ip) {
        // 用户是否存在
        if (ObjectUtils.isEmpty(user)) {
            // 失败
            LoggerUtils.logInfo("账号不存在");
            return new Pair<>(false, "账号不存在");
        }
        // 账号是否过期
        String now = DateFormatUtils.getNowDateTimeString();
        if (now.compareTo(user.getExpireTime()) > 0) {
            // 过期
            LoggerUtils.logInfo("账号 " + user.getLoginAct() + " 已过期");
            return new Pair<>(false, "账号已过期");
        }
        // 判断用户是否被锁定
        if ("0".equals(user.getLockState())) {
            // 被锁定
            LoggerUtils.logInfo("账号 " + user.getLoginAct() + " 已锁定");
            return new Pair<>(false, "账号已锁定");
        }
        // 判断 IP 是否被封禁
        String allowIps = user.getAllowIps();
        if (! allowIps.contains("0:0:0:0:0:0:0:1") && ! allowIps.contains(ip)) {
            // IP 被封禁
            LoggerUtils.logInfo("账号 " + user.getLoginAct() + " 不允许 IP 为" + ip + " 的用户访问");
            return new Pair<>(false, "该 IP 禁止访问");
        }
        LoggerUtils.logInfo("账号 " + user.getLoginAct() + "登录成功");
        return new Pair<>(true, null);
    }
}
