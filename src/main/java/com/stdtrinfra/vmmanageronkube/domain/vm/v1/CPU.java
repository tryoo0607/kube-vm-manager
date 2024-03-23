package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import java.util.List;

public class CPU {

    private int cores;

    private boolean dedicatedCpuPlacement;

    private List<CPUFeature> features;

    private boolean isolateEmulatorThread;

    private int maxSockets;

    private String model;

    private NUMA numa;

    private Realtime realtime;

    private int sockets;

    private int threads;
}
