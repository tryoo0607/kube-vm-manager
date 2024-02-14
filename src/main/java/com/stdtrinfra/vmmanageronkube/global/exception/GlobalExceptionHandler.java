package com.stdtrinfra.vmmanageronkube.global.exception;

import com.stdtrinfra.vmmanageronkube.global.model.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    protected ResponseData<String> handleException(Exception e) {
        log.error("Exception", e);

        KubeVmException kubeVmException = new KubeVmException(e);
        return new ResponseData<>(kubeVmException.getResponseMessage());
    }

    @ExceptionHandler(value = {KubeVmException.class})
    protected ResponseData<String> handleGeneralException(KubeVmException kubeVmException) {
        log.error("Exception",kubeVmException);

        return new ResponseData<>(kubeVmException.getResponseMessage());
    }

}
