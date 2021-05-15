package top.faroz.dao;

import top.faroz.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 根据姓名，查询用户列表
     * @param name
     * @return
     */
    List<User> selectByName(String name);

    /**
     * 根据Id，查询用户
     * @param id
     * @return
     */
    User selectById(Integer id);

    List<User> queryAll();
}
