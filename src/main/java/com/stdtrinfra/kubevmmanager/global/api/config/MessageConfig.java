package com.stdtrinfra.kubevmmanager.global.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfig {

    @Value("${spring.messages.basename}")
    private String MESSAGE_BASENAME;

    @Value("${spring.messages.encoding}")
    private String MESSAGE_ENCODING;

    @Bean
    public MessageSource customMessageSource() {
        ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();

        ms.setBasename("classpath:"+MESSAGE_BASENAME);
        ms.setDefaultEncoding(MESSAGE_ENCODING);
        ms.setAlwaysUseMessageFormat(true);
        ms.setUseCodeAsDefaultMessage(true);
        ms.setFallbackToSystemLocale(true);

        return ms;
    }

}
