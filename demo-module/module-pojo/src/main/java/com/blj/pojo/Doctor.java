package com.blj.pojo;

/**
 * Created by blj on 2017/10/31.
 */
public class Doctor {
    private String id;
    private String Initial;
    private String hosp_code;
    private String doct_code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitial() {
        return Initial;
    }

    public void setInitial(String initial) {
        Initial = initial;
    }

    public String getDoct_code() {
        return doct_code;
    }

    public void setDoct_code(String doct_code) {
        this.doct_code = doct_code;
    }

    public String getHosp_code() {
        return hosp_code;
    }

    public void setHosp_code(String hosp_code) {
        this.hosp_code = hosp_code;
    }
}
