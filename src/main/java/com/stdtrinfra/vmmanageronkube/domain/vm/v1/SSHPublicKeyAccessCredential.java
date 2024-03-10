package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class SSHPublicKeyAccessCredential {

    @Parameter(required = true)
    private SSHPublicKeyAccessCredentialPropagationMethod propagationMethod;

    @Parameter(required = true)
    private SSHPublicKeyAccessCredentialSource source;
}
