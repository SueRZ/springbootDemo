package com.su.demo.mapper;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.su.demo.model.User;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    int insertJson(JSONObject JSONObject);
}