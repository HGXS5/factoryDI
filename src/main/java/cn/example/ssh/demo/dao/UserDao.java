package cn.example.ssh.demo.dao;


import cn.example.ssh.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    public Integer addUser(User user) {
        Integer id = (Integer) hibernateTemplate.save(user);
        return id;
    }

    public List<User> getAllUser() {
        List<User> users = hibernateTemplate.findByExample(new User());
        return users;
    }

    public void deleteUser(Integer id) {
        User user = new User();
        user.setId(id);
        hibernateTemplate.delete(user);
    }
}