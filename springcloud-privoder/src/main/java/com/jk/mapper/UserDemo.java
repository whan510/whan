package com.jk.mapper;

import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDemo {
    @Select("select * from w_user")
    List<UserBean> querylist();
}
