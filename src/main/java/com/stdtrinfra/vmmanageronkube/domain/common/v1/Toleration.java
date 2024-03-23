package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.EffectEnum;
import com.stdtrinfra.vmmanageronkube.domain.common.OperatorEnum;

public class Toleration {

    private EffectEnum effect;

    private String key;

    private OperatorEnum operator;

    private int tolerationSeconds;

    private String value;
}
