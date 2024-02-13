package com.stdtrinfra.kubevmmanager.domain.adapter.in.web;

import com.stdtrinfra.kubevmmanager.domain.application.in.SandboxUseCase;
import com.stdtrinfra.kubevmmanager.global.model.ResponseMessage;
import com.stdtrinfra.kubevmmanager.global.utils.MessageUtils;
import com.stdtrinfra.kubevmmanager.global.model.ResponseData;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sandbox")
public class SandBoxController {
    private final SandboxUseCase sandboxUseCase;

    @Autowired
    private SandBoxController(SandboxUseCase sandboxUseCase) {
        this.sandboxUseCase = sandboxUseCase;
    }

    @GetMapping("")
    @Operation(summary="backup 상세 조회", description="backup 상세 조회")
    public ResponseData<String> getBackupDetail() {
        ResponseMessage responseMessage = MessageUtils.getMessage("200");
        String result = sandboxUseCase.getNamespaceTest();

        return new ResponseData<>(result, responseMessage);
    }

}

