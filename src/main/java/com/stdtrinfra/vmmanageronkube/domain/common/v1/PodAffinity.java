package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import java.util.List;

public class PodAffinity {

    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;

    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;
}
