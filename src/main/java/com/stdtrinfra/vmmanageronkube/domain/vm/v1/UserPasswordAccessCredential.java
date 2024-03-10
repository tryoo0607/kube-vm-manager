package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class UserPasswordAccessCredential {

    @Parameter(required = true)
    private UserPasswordAccessCredentialPropagationMethod propagationMethod;

    @Parameter(required = true)
    private UserPasswordAccessCredentialSource source;
}
