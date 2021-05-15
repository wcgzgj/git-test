package top.faroz.service;

import top.faroz.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 如果查无此人，或者密码不匹配，返回false
     * 否则，返回true
     * @param user
     * @return
     */
    boolean login(User user);

    /**
     * 根据名字查询用户
     * @param name
     * @return
     */
    User selectByName(String name);

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAll();
}
