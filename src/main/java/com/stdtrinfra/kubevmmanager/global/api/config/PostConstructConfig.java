package com.stdtrinfra.kubevmmanager.global.api.config;

import com.stdtrinfra.kubevmmanager.domain.kubeclient.service.KubeClientService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PostConstructConfig {

    @Autowired
    private KubeClientService kubeClientService;

    @Value("${kube-vm-manager.url}")
    private String KUBE_URL;

    @Value("${kube-vm-manager.token}")
    private String KUBE_TOKEN;

    @PostConstruct
    public void init() {
        kubeClientService.setKubeConfig(KUBE_URL, KUBE_TOKEN);
    }
}
