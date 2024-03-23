package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class PreferredSchedulingTerm {

    @Parameter(required = true)
    private NodeSelectorTerm preference;

    @Parameter(required = true)
    private int weight;
}
