package com.D.crm.settings.service;

import com.D.crm.settings.model.User;
import javafx.util.Pair;

import java.util.Map;

/**
 * @author: Ding
 * @date: 2022/7/18 14:36
 * @description:
 * @modify:
 */


public interface UserService {

    User login(Map<String, Object> map);

    Pair<Boolean, String> checkUser(User user, String ip);

    User getUserById(String id);
}
