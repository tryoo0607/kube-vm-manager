package com.stdtrinfra.kubevmmanager.domain.adapter.out.client;

import com.stdtrinfra.kubevmmanager.domain.application.out.KubeClientPort;
import com.stdtrinfra.kubevmmanager.domain.application.out.SandboxPort;
import io.fabric8.kubernetes.client.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KubeClientService implements SandboxPort, KubeClientPort {

    @Override
    public void setKubeConfig(String url, String token) {

        System.setProperty("kubernetes.master", url);
        System.setProperty("kubernetes.auth.token", token);
        System.setProperty("kubernetes.trust.certificates", "true");
        System.setProperty("kubernetes.disable.hostname.verification", "true");

    }

    public String getNamespaceTest() {

        try(KubernetesClient client = new KubernetesClientBuilder().build()) {
            return client.namespaces().list().toString();
        } catch(Exception e) {
            log.error(e.getMessage());
        }

        return null;
    }

}
