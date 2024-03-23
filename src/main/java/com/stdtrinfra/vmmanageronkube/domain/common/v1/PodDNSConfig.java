package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import java.util.List;

public class PodDNSConfig {

    private List<String> nameservers;

    private List<PodDNSConfigOption> options;

    private List<String> searches;
}
