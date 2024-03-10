package com.stdtrinfra.vmmanageronkube.domain.vm;

import com.stdtrinfra.vmmanageronkube.domain.common.KubeResource;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataVolumeTemplateSpec implements KubeResource {

    private DataVolumeSpec spec;

    private DataVolumeTemplateDummyStatus status;
}
