package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import java.util.List;

public class DHCPOptions {

    private String bootFileName;

    private List<String> ntpServers;

    private List<DHCPPrivateOptions> privateOptions;

    private String tftpServerName;
}
