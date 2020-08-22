package com.maistruk.spring_1.beans.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.maistruk.spring_1.beans.BeanExample;
import com.maistruk.spring_1.beans.SpellChecker;
import com.maistruk.spring_1.beans.annotation.AutowiredOnPropertyAnnotation;
import com.maistruk.spring_1.beans.annotation.BeanBar;
import com.maistruk.spring_1.beans.annotation.BeanFoo;

@Configuration
@Import(AnotherConfig.class)
public class MyConfig {
    
    @Bean
    public BeanFoo beanFoo() {
        return new BeanFoo(beanBar());
    }
    
    @Bean
    public BeanBar beanBar() {
        return new BeanBar();
    }
    
    @Bean
    @Scope("prototype")
    public AutowiredOnPropertyAnnotation autowiredOnPropertyAnnotation() {
        return new AutowiredOnPropertyAnnotation();
    }
    
    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
    
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanExample beanExample() {
        return new BeanExample();
    }
    
    
    
}
