package com.maistruk.spring_1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.maistruk.spring_1.beans.BeanPostProcessorExample;

public class InitBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanPostProcessorExample) {
            System.out.println("postProcessBeforeInitialization(Object bean, String beanName)1 " + beanName);
        }
        return bean; // you can return any other object as well
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanPostProcessorExample) {
            System.out.println("postProcessAfterInitialization(Object bean, String beanName)1 " + beanName);
        }
        return bean; // you can return any other object as well
    }

}
