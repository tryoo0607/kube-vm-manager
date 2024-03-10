package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.KubeResource;
import com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1.DataVolumeSpec;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataVolumeTemplateSpec implements KubeResource {

    private DataVolumeSpec spec;
    private DataVolumeTemplateDummyStatus status;
}
