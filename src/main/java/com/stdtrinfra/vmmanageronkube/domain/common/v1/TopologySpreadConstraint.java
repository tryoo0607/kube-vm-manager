package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.PolicyEnum;
import com.stdtrinfra.vmmanageronkube.domain.common.ScheduleEnum;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

public class TopologySpreadConstraint {

    private LabelSelector labelSelector;

    private List<String> matchLabelKeys;

    @Parameter(required = true)
    private int maxSkew;

    private int minDomains;

    private PolicyEnum nodeAffinityPolicy;

    private PolicyEnum nodeTaintsPolicy;

    private String topologyKey;

    private ScheduleEnum whenUnsatisfiable;
}
