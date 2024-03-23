package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class DomainSpec {

    private Chassis chassis;

    private Clock clock;

    private CPU cpu;

    @Parameter(required = true)
    private Devices devices;

    private Features features;

    private Firmware firmware;

    private String ioThreadsPolicy;

    private LaunchSecurity launchSecurity;

    private Machine machine;

    private Memory memory;

    private ResourceRequirements resources;
}
