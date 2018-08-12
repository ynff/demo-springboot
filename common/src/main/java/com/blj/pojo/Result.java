package com.blj.pojo;

import com.blj.common.constants.CommonCodeConstants;
import com.blj.common.constants.LocalMessageConstants;

import java.util.HashMap;
import java.util.Optional;

/**
 * 返回结果实体类
 */
public class Result {

    private Integer code;

    private String msg;

    private Object data;

    public Result() {
    }

    public Result(Object data) {
        this.code = CommonCodeConstants.SUCCESS_CODE;
        this.msg = LocalMessageConstants.SUCCESS;
        this.data = data;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * code 20000
     * msg "Success"
     *
     * @param data
     * @return
     */
    public static Result ok(Object data) {
        return new Result(data);
    }

    public static Result ok() {
        return new Result(10000, LocalMessageConstants.SUCCESS, true);
    }

    /**
     * code 50000
     * data null
     *
     * @param msg
     * @return
     */
    public static Result error(String msg) {
        return new Result(CommonCodeConstants.ERROR_CODE, msg, false);
    }

    /**
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static Result build(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        Optional<Object> optional = Optional.ofNullable(this.data);
        Object obj = optional.orElse(new HashMap<>());
        return obj;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
