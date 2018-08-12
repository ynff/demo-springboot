package com.blj.service;


import com.blj.pojo.Doctor;
import com.blj.pojo.User;

import java.util.List;

/**
 * Created by blj on 2017/10/31.
 */
public interface ITestService {
    void addUser(User user);

    List<Doctor> queryDoctor();

    List<User> updateUsers();
}
