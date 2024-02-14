package com.stdtrinfra.vmmanageronkube.global.utils;

import com.stdtrinfra.vmmanageronkube.global.model.ResponseMessage;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        MessageUtils.applicationContext = applicationContext;
    }

    public static ResponseMessage getMessage(String code){
        MessageSource messageSource = applicationContext.getBean("customMessageSource", MessageSource.class);
        String message = messageSource.getMessage(code, null, Locale.KOREA);

        return ResponseMessage.builder().message(message).code(code).build();
    }

    public static ResponseMessage getMessage(String code, Object[] args){
        MessageSource messageSource = applicationContext.getBean("customMessageSource", MessageSource.class);
        String message = messageSource.getMessage(code, args, Locale.KOREA);

        return ResponseMessage.builder().message(message).code(code).build();
    }
}

