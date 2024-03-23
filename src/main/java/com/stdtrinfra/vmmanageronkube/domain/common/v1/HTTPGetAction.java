package com.stdtrinfra.vmmanageronkube.domain.common.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.SchemeEnum;

import java.util.List;

public class HTTPGetAction {

    private String host;

    private List<HTTPHeader> httpHeaders;

    private String path;

    private SchemeEnum scheme;
}
