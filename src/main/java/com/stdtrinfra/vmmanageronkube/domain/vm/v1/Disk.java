package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

public class Disk {

    private BlockSize blockSize;

    private int bootOrder;

    private String cache;

    private CDRomTarget cdrom;

    private boolean dedicatedIOThread;

    private DiskTarget disk;

    private String errorPolicy;

    private String io;

    private LunTarget lun;

    @Parameter(required = true)
    private String name;

    private String serial;

    private boolean shareable;

    private String tag;
}
