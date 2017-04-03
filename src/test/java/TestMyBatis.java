import com.alibaba.fastjson.JSON;
import com.t.IDao.UserTMapper;
import com.t.Model.UserT;
import com.t.ServiceInterface.IUserService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by yangxiaoshuo on 2017/4/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestMyBatis {

    @Resource
    private IUserService userService;

    @Test
    public void test1()
    {
        System.out.print(userService);
        UserT ut = userService.getUserById(1);
        System.out.println(JSON.toJSONString(ut));
    }

}
