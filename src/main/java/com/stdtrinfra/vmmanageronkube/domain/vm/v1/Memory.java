package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.Quantity;

public class Memory {

    private Quantity guest;

    private Hugepages hugepages;

    private Quantity maxGuest;
}
