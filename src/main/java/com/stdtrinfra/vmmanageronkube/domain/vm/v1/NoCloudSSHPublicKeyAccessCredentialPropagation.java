package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;
import java.util.Map;

public class NoCloudSSHPublicKeyAccessCredentialPropagation {

    private List<String> mediateDeviceTypes;

    @Parameter(required = true)
    private Map<String, String> nodeSelector;
}
