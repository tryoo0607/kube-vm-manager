package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

public class LabelSelectorRequirement {

    @Parameter(required = true)
    private String key;

    @Parameter(required = true)
    private String operator;

    private List<String> values;
}
