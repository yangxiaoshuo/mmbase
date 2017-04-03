package com.t.ServiceImpl;

import com.t.IDao.UserTMapper;
import com.t.Model.UserT;
import com.t.ServiceInterface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
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
