package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class NodeSelector {

    @Parameter(required = true)
    private NodeSelectorTerm nodeSelectorTerms;
}
