package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

public class Timer {

    private HPETTimer hpet;

    private HypervTimer hyperv;

    private KVMTimer kvm;

    private PITTimer pit;

    private RTCTimer rtc;
}
