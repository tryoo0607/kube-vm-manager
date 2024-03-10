package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.Quantity;

public class ResourceRequirements {

    private ResourceClaim claims;

    private Quantity limits;

    private Quantity requests;
}
