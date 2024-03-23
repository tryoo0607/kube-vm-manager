package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class Watchdog {

    private I6300ESBWatchdog i6300esb;

    @Parameter(required = true)
    private String name;
}
