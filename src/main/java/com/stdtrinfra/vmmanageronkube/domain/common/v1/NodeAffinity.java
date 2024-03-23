package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import java.util.List;

public class NodeAffinity {

    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;

    private NodeSelector requiredDuringSchedulingIgnoredDuringExecution;
}
