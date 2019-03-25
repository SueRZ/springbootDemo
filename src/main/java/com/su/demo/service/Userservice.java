package com.su.demo.service;

import com.su.demo.mapper.UserMapper;
import com.su.demo.model.User;
import com.su.demo.service.impl.UserServiceImpl;
import com.su.demo.util.JSONUtil;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Userservice implements UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String insert(User user) {

        try {

                JSONUtil.objectToJson(user);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int result=   userMapper.insert(user);
        if(result>=1){
            System.out.println(122);
            System.out.println(11);
            return "保存成功";
        }else{
            return "失败";
        }
    }

    @Override
    public String insertJson(JSONObject jsonObject) {
//        try {
//           Object object=jsonObject.get("name");
//            System.out.println(object);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
      User  user= (User) JSONUtil.JSONToObj(jsonObject.toString(),User.class);

//        int result=   userMapper.insertJson(jsonObject);
        int result= userMapper.insert(user);
        if(result>=1){
            System.out.println(11);
            return "保存成功";
        }else{
            return "失败";
        }
    }
}
