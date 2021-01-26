package com.taiji.spring;

import org.springframework.stereotype.Service;

@Service
public class UserService {


    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public  void save(){

        userDao.save();
    }

}
