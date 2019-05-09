package com.brr.mapper;

import com.brr.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: hxp
 * @date: 2019/5/8 14:07
 * @description:
 */
@Mapper
public interface UserMapper {

     User selectUser();
}
