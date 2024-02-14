package com.stdtrinfra.vmmanageronkube.application;

import com.stdtrinfra.vmmanageronkube.application.out.KubeClientResourcePort;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PostConstructComponent {

    private final KubeClientResourcePort kubeClientResourcePort;

    @Autowired
    private PostConstructComponent(KubeClientResourcePort kubeClientResourcePort) {
        this.kubeClientResourcePort = kubeClientResourcePort;
    }

    @Value("${vm-manager-on-kube.url}")
    private String KUBE_URL;

    @Value("${vm-manager-on-kube.token}")
    private String KUBE_TOKEN;

    @PostConstruct
    public void init() {
        kubeClientResourcePort.setKubeConfig(KUBE_URL, KUBE_TOKEN);
    }
}
