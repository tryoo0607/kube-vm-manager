package com.stdtrinfra.kubevmmanager.global.api.config;

import com.stdtrinfra.kubevmmanager.domain.kubeclient.service.KubeClientService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostConstructConfig {

    @Autowired
    private KubeClientService kubeClientService;

    @PostConstruct
    public void init() {
        kubeClientService.setKubeConfig();
    }
}
