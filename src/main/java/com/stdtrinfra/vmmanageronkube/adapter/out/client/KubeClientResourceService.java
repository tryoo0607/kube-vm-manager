package com.stdtrinfra.vmmanageronkube.adapter.out.client;

import com.stdtrinfra.vmmanageronkube.application.common.out.KubeClientResourcePort;
import com.stdtrinfra.vmmanageronkube.application.common.out.SandboxPort;
import io.fabric8.kubernetes.client.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KubeClientResourceService implements SandboxPort, KubeClientResourcePort {

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
