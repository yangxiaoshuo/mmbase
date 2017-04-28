package com.t.Impl;


import com.t.IDao.UserTMapper;
import com.t.Model.UserT;
import com.t.Service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by yangxiaoshuo on 2017/4/1.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Resource
    private UserTMapper ut;

    public UserT getUserById(int userId) {
        return this.ut.selectByPrimaryKey(userId);
    }
}
