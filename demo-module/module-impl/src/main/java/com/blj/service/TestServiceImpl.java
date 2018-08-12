package com.blj.service;

import com.blj.dao.TestMapper;
import com.blj.pojo.Doctor;
import com.blj.pojo.User;
import com.blj.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * Created by blj on 2017/10/31.
 */
@Service
public class TestServiceImpl implements ITestService {
    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    @Autowired
    private TestMapper mapper;

    @Override
    public void addUser(User user) {

    }

    @Override
    public List<Doctor> queryDoctor() {
        List<Doctor> doctors = mapper.selectDoctor();
        doctors.forEach(doctor -> {
            logger.info(doctor.getDoct_code());
            if (doctor.getDoct_code()==null||("").equals(doctor.getDoct_code())){
                doctor.setDoct_code(random(3));
                mapper.updateDoctor(doctor);
            }

        });
        //mapper.updateBatch(doctors);
        return doctors;
    }

    @Override
    public List<User> updateUsers() {
        List<User> users = mapper.selectUsers();
        users.forEach(user -> {
            user.setName("王武");
            user.setAge(122);
        });
        mapper.updateBatchUsers(users);
        return null;
    }

    public  String random(int length){
        int end = (int)(Math.random()*(9999-1000+1))+1000;
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        sb.append("-"+end);

        return "h-"+sb.toString();
    }

}
