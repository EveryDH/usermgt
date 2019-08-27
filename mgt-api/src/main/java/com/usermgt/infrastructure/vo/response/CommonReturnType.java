package com.usermgt.infrastructure.vo.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author hao.dai
 * @date 2019/8/18
 */
@Data
@ApiModel
public class CommonReturnType <T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private T status;

    private T data;

    private String message;

    private boolean success = false;

    public CommonReturnType() {
    }

    public CommonReturnType (boolean success, String message) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public CommonReturnType (boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
}
