package com.su.demo.service.impl;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.su.demo.model.User;
import org.json.JSONObject;

public interface UserServiceImpl {


    String insert(User user);

    String insertJson(JSONObject JSONObject);
}
