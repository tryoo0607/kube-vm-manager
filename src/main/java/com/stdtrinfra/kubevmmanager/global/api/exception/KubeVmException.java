package com.stdtrinfra.kubevmmanager.global.api.exception;
import com.stdtrinfra.kubevmmanager.global.api.model.ResponseMessage;
import com.stdtrinfra.kubevmmanager.global.api.utils.MessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class KubeVmException extends RuntimeException {
    private final ResponseMessage responseMessage;

    public KubeVmException() {
        this(MessageUtils.getMessage("success"));
    }

    public KubeVmException(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

    public KubeVmException(String code) {
        this.responseMessage = MessageUtils.getMessage(code);
    }

    public KubeVmException(Throwable cause){
        log.error("[kubeVmException] {}", cause.getMessage());
        this.responseMessage = MessageUtils.getMessage("success");
    }
}