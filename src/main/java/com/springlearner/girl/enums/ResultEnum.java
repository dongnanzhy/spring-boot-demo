package com.springlearner.girl.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    COLLEDGE(100, "你可能还在上大学"),
    NEW_TO_WORK(101, "你可能刚工作"),

    ;

    private Integer code;

    private String mes;

    ResultEnum(Integer code, String mes) {
        this.code = code;
        this.mes = mes;
    }

    public Integer getCode() {
        return code;
    }

    public String getMes() {
        return mes;
    }
}
