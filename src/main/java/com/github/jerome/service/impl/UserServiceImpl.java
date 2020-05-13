package com.github.jerome.service.impl;

import com.github.jerome.entity.User;
import com.github.jerome.mapper.UserMapper;
import com.github.jerome.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 公众号：java思维导图
 * @since 2020-05-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserById(Long id) {
        return userMapper.selectUserById(id);
    }
}
