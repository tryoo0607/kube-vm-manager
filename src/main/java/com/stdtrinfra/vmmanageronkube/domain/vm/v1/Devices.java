package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import java.util.List;

public class Devices {

    private boolean autoattachGraphicsDevice;

    private boolean autoattachInputDevice;

    private boolean autoattachMemBalloon;

    private boolean autoattachPodInterface;

    private boolean autoattachSerialConsole;

    private boolean autoattachVSOCK;

    private boolean blockMultiQueue;

    private ClientPassthroughDevices clientPassthrough;

    private boolean disableHotplug;

    private List<Disk> disks;

    private DownwardMetrics downwardMetrics;

    private List<Filesystem> filesystems;

    private List<GPU> gpus;

    private List<HostDevice> hostDevices;

    private List<Input> inputs;

    private List<Interface> interfaces;

    private boolean logSerialConsole;

    private boolean networkInterfaceMultiqueue;

    private Rng rng;

    private SoundDevice sound;

    private TPMDevice tpm;

    private boolean useVirtioTransitional;

    private Watchdog watchdog;
}
