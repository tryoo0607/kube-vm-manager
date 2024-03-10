package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import io.swagger.v3.oas.annotations.Parameter;

public class DataVolumeSourceImageIO {

    private String certConfigMap;

    @Parameter(required = true)
    private String diskId;

    private String secretRef;

    @Parameter(required = true)
    private String url;
}
