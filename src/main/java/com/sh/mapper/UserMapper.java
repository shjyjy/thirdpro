package com.sh.mapper;

import com.sh.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * g根据登陆名查询用户信息
     * @param loginName
     * @return
     */
    public User loadUserByLoginName(String loginName);
}
