package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import java.util.List;
import java.util.Map;

public class LabelSelector {

    private List<LabelSelectorRequirement> matchExpressions;

    private Map<String, String> machLabels;
}
