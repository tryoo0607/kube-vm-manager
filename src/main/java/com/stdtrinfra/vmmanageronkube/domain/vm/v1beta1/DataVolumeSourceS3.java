package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import io.swagger.v3.oas.annotations.Parameter;

public class DataVolumeSourceS3 {

    private String certConfigMap;

    private String secretRef;

    @Parameter(required = true)
    private String url;
}
