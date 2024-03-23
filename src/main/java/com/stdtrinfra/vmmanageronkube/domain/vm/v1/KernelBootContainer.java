package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.vm.ImagePullPolicyEnum;
import io.swagger.v3.oas.annotations.Parameter;

public class KernelBootContainer {

    @Parameter(required = true)
    private String image;

    private ImagePullPolicyEnum imagePullPolicy;

    private String imagePullSecret;

    private String initrdPath;

    private String kernelPath;
}
