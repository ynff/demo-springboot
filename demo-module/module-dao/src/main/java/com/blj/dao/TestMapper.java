package com.blj.dao;

import com.blj.pojo.Doctor;
import com.blj.pojo.User;

import java.util.List;

/**
 * Created by blj on 2017/10/31.
 */
public interface TestMapper {
    List<Doctor> selectDoctor();

    void updateBatch(List<Doctor> doctors);

    void updateDoctor(Doctor doctor);

    List<User> selectUsers();

    void updateBatchUsers(List<User> users);
}
