package com.blj.dao;

import com.blj.pojo.DoctorVO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by blj on 2017/12/7.
 */
public interface DoctorMapper extends Mapper<DoctorVO> {

    DoctorVO selectById(@Param("id") Integer id);
}
