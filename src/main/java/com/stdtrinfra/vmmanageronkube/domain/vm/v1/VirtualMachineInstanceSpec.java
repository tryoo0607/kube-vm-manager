package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.v1.Affinity;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.PodDNSConfig;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.Toleration;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.TopologySpreadConstraint;
import com.stdtrinfra.vmmanageronkube.domain.vm.DNSEnum;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;
import java.util.Map;

public class VirtualMachineInstanceSpec {

    private List<AccessCredential> accessCredentials;

    private Affinity affinity;

    private String architecture;

    private PodDNSConfig dnsConfig;

    private DNSEnum dnsPolicy;

    @Parameter(required = true)
    private DomainSpec domain;

    private String evictionsStrategy;

    private String hostname;

    private Probe livenessProbe;

    private List<Network> networks;

    private Map<String, String> nodeSelector;

    private String priorityClassName;

    private Probe readnessProbe;

    private String schedulerName;

    private String startStrategy;

    private String subdomain;

    private int terminationGracePeriodSeconds;

    private List<Toleration> tolerations;

    private List<TopologySpreadConstraint> topologySpreadConstraints;

    private List<Volume> volumes;
}
