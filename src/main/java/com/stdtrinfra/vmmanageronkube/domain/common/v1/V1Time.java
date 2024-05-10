package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.RawExtension;
import io.swagger.v3.oas.annotations.Parameter;

public class V1Time {

    @Parameter(required = true)
    private RawExtension object;

    @Parameter(required = true)
    private String type;

    private V1Time() {

        this.type = "";
    }
}
