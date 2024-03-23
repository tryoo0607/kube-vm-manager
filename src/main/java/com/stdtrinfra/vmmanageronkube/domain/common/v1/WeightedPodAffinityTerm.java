package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class WeightedPodAffinityTerm {

    @Parameter(required = true)
    private PodAffinityTerm podAffinityTerm;

    @Parameter(required = true)
    private int weight;
}
