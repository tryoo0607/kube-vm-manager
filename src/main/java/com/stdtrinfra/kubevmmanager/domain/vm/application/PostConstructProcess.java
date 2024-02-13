package com.stdtrinfra.kubevmmanager.domain.vm.application;

import com.stdtrinfra.kubevmmanager.domain.vm.application.out.KubeClientPort;
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

    @Value("${kube-vm-manager.url}")
    private String KUBE_URL;

    @Value("${kube-vm-manager.token}")
    private String KUBE_TOKEN;

    @PostConstruct
    public void init() {
        kubeClientPort.setKubeConfig(KUBE_URL, KUBE_TOKEN);
    }
}
