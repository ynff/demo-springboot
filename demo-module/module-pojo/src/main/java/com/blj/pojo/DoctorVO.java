package com.blj.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by blj on 2017/12/7.
 */
@Table(name = "t_cus_doctor")
public class DoctorVO {
    @Id
    private Integer id;
    private String name;
    private String provinceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
