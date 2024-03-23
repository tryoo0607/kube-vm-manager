package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class Filesystem {

    @Parameter(required = true)
    private String name;

    @Parameter(required = true)
    private FilesystemVirtiofs virtiofs;
}
