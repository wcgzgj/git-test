package top.faroz.service.impl;

import top.faroz.dao.UserDao;
import top.faroz.dao.impl.UserDaoImpl;
import top.faroz.pojo.User;
import top.faroz.service.UserService;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/13 下午11:43
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean login(User user) {
        List<User> users = userDao.selectByName(user.getName());
        //查无此人
        if (users==null || users.size()==0) {
            return false;
        }
        User daoUser = users.get(0);
        //密码不匹配
        if (!Objects.equals(user.getPassword(),daoUser.getPassword())) {
            return false;
        }
        //匹配成功
        return true;
    }

    @Override
    public User selectByName(String name) {
        List<User> users = userDao.selectByName(name);
        if (users==null || users.size()==0) {
            return null;
        }
        return users.get(0);
    }

    @Override
    public List<User> queryAll() {
        List<User> users = userDao.queryAll();
        return users;
    }
}
