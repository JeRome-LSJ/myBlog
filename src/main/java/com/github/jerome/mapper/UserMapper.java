package com.github.jerome.mapper;

import com.github.jerome.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author JeRome
 * @date 2020-05-14 00:27
 * @description
 */
@Component
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据id查询用户
     * @param id Long
     * @return List<User>
     */
    List<User> selectUserById(@Param("id")Long id);
}
