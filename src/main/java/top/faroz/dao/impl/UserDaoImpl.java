package top.faroz.dao.impl;

import top.faroz.dao.UserDao;
import top.faroz.pojo.User;
import top.faroz.util.ResultSetUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/13 下午11:43
 * @Version 1.0
 **/
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public List<User> selectByName(String name) {
        String sql = "select * from user where name =?";
        ArrayList params = new ArrayList();
        params.add(name);
        ResultSet rs = this.query(sql, params);
        List<User> users = ResultSetUtil.ResultSetToBean(rs, User.class);
        close();
        return users;
    }

    @Override
    public User selectById(Integer id) {
        String sql = "select * from user where id =?";
        ArrayList params = new ArrayList();
        params.add(id);
        ResultSet rs = this.query(sql, params);
        List<User> users = ResultSetUtil.ResultSetToBean(rs, User.class);
        if (users!=null && users.size()>0) {
            return users.get(0);
        }
        close();
        return null;
    }

    @Override
    public List<User> queryAll() {
        String sql = "select * from user";
        ResultSet res = query(sql, null);
        List<User> users = ResultSetUtil.ResultSetToBean(res, User.class);
        close();
        return users;
    }
}
