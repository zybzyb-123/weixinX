package com.qf.service;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qf.base.service.BaseService;
import com.qf.entity.User;

public interface IUserService extends BaseService<User> {
    Integer register(User user);

    User getUserByUsername(String username);
}
