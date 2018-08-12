package com.blj.service;

import com.blj.dao.DoctorMapper;
import com.blj.pojo.DoctorVO;
import com.blj.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by blj on 2017/12/7.
 */
@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public DoctorVO queryById(Integer id) {
        return doctorMapper.selectById(id);
    }
}
