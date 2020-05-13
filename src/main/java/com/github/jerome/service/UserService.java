package com.github.jerome.service;

import com.github.jerome.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 公众号：java思维导图
 * @since 2020-05-14
 */
public interface UserService extends IService<User> {
    List<User> selectUserById(Long id);
}
