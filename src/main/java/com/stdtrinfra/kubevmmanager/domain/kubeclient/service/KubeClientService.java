package com.stdtrinfra.kubevmmanager.domain.kubeclient.service;

import io.fabric8.kubernetes.client.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KubeClientService {

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
