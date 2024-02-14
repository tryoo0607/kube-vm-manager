package com.stdtrinfra.vmmanageronkube.application.vm;

import com.stdtrinfra.vmmanageronkube.application.vm.out.KubeClientPort;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PostConstructProcess {

    private final KubeClientPort kubeClientPort;

    @Autowired
    private PostConstructProcess(KubeClientPort kubeClientPort) {
        this.kubeClientPort = kubeClientPort;
    }

    @Value("${vm-manager-on-kube.url}")
    private String KUBE_URL;

    @Value("${vm-manager-on-kube.token}")
    private String KUBE_TOKEN;

    @PostConstruct
    public void init() {
        kubeClientPort.setKubeConfig(KUBE_URL, KUBE_TOKEN);
    }
}
