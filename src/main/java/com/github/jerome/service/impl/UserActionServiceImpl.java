package com.github.jerome.service.impl;

import com.github.jerome.entity.UserAction;
import com.github.jerome.mapper.UserActionMapper;
import com.github.jerome.service.UserActionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 公众号：java思维导图
 * @since 2020-05-14
 */
@Service
public class UserActionServiceImpl extends ServiceImpl<UserActionMapper, UserAction> implements UserActionService {
    @Autowired
    UserActionMapper userActionMapper;
}
