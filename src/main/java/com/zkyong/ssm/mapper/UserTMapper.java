package com.zkyong.ssm.mapper;

import com.zkyong.ssm.model.UserT;

public interface UserTMapper {
    UserT selectByPrimaryKey(Integer id);
}