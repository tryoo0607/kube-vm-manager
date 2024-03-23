package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import com.stdtrinfra.vmmanageronkube.domain.common.v1.ExecAction;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.HTTPGetAction;
import com.stdtrinfra.vmmanageronkube.domain.common.v1.TCPSocketAction;

public class Probe {

    private ExecAction exec;

    private int failureThreshold;

    private GuestAgentPing guestAgentPing;

    private HTTPGetAction httpGet;

    private int initialDelaySeconds;

    private int periodSeconds;

    private int successThreshold;

    private TCPSocketAction tcpSocket;

    private int timeoutSeconds;
}
