package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import java.util.List;

public class NodeSelectorTerm {

    private List<NodeSelectorRequirement> matchExpressions;

    private List<NodeSelectorRequirement> matchFields;
}
