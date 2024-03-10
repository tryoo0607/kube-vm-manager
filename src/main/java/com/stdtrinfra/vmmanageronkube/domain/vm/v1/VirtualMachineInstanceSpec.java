package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

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
