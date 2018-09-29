package com.springlearner.girl.exception;

import com.springlearner.girl.enums.ResultEnum;

public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnume) {
        super(resultEnume.getMes());
        this.code = resultEnume.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
