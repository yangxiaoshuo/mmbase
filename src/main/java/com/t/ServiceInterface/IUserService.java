package com.t.ServiceInterface;

import com.t.Model.UserT;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yangxiaoshuo on 2017/4/1.
 */
public interface IUserService {
    public UserT getUserById(int userId);
}
