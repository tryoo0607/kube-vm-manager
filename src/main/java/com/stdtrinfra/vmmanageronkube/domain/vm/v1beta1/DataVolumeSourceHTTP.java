package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

public class DataVolumeSourceHTTP {

    private String certConfigMap;

    private List<String> extraHeaders;

    private List<String> secretExtraHeaders;

    private String secretRef;

    @Parameter(required = true)
    private String url;
}
