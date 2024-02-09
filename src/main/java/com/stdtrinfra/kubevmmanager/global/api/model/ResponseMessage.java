package com.stdtrinfra.kubevmmanager.global.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ResponseMessage {
    private String code;
    private String message;
}