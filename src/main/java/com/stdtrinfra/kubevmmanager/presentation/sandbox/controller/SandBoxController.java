package com.stdtrinfra.kubevmmanager.presentation.sandbox.controller;

import com.stdtrinfra.kubevmmanager.application.sandbox.service.SandboxService;
import com.stdtrinfra.kubevmmanager.global.api.model.ResponseMessage;
import com.stdtrinfra.kubevmmanager.global.api.utils.MessageUtils;
import com.stdtrinfra.kubevmmanager.global.api.model.ResponseData;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sandbox")
public class SandBoxController {

    @Autowired
    private SandboxService sandboxService;

    @GetMapping("")
    @Operation(summary="backup 상세 조회", description="backup 상세 조회")
    public ResponseData<String> getBackupDetail() {
        ResponseMessage responseMessage = MessageUtils.getMessage("200");
        String result = sandboxService.getNamespaceTest();

        return new ResponseData<>(result, responseMessage);
    }

}

