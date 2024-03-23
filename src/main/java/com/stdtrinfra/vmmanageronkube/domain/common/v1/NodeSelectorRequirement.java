package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.OperatorEnum;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

public class NodeSelectorRequirement {

    @Parameter(required = true)
    private String key;

    @Parameter(required = true)
    private OperatorEnum operator;

    private List<String> values;
}
