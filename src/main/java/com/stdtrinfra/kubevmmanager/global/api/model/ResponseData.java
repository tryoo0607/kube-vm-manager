package com.stdtrinfra.kubevmmanager.global.api.model;

import com.stdtrinfra.kubevmmanager.global.api.model.ResponseMessage;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class ResponseData<T> implements Serializable {
    private ResponseMessage message;
    private T data;

    public ResponseData(T data){
        this.message = ResponseMessage.builder().build();
        this.data = data;
    }

    public ResponseData(T data, ResponseMessage message){
        this.message = message;
        this.data = data;
    }

    public ResponseData(ResponseMessage message){
        this.message = message;
    }
}
