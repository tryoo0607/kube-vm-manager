package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

public class PodAffinityTerm {

    private LabelSelector labelSelector;

    private LabelSelector namespaceSelector;

    private List<String> namespaces;

    @Parameter(required = true)
    private String topologyKey;
}
