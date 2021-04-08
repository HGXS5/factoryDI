package cn.example.ssh.demo.service;


import cn.example.ssh.demo.dao.UserDao;
import cn.example.ssh.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Transactional(readOnly = false)
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Transactional(readOnly = false)
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }
}