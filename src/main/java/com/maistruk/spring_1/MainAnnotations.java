package com.maistruk.spring_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maistruk.spring_1.beans.BeanExample;
import com.maistruk.spring_1.beans.HelloWorld;
import com.maistruk.spring_1.beans.annotation.AutowiredOnConstructorAnnotation;
import com.maistruk.spring_1.beans.annotation.AutowiredOnPropertyAnnotation;
import com.maistruk.spring_1.beans.annotation.AutowiredOnSetterAnnotation;
import com.maistruk.spring_1.beans.annotation.BeanFoo;
import com.maistruk.spring_1.beans.annotation.CustomEventPublisher;
import com.maistruk.spring_1.beans.annotation.PostConstructPreDestroyAnnotation;
import com.maistruk.spring_1.beans.annotation.QualifierAnnotation;
import com.maistruk.spring_1.beans.annotation.RequiredAnnotation;
import com.maistruk.spring_1.beans.annotation.ValueAnnotation;
import com.maistruk.spring_1.beans.annotation.config.EventHandlingConfig;
import com.maistruk.spring_1.beans.annotation.config.MyConfig;

public class MainAnnotations {

    public static void main(String[] args) {
    //    requiredAnnotationExample();
        
     //   autowiredOnSetterAnnotation();
        
        //autowiredOnPropertyAnnotation();
        
        //autowiredOnConstructorAnnotation();
        
      //  qualifierAnnotaionExample();
        
      //  postConstructPreDestroyAnnotation();
        
      //  valueAnnotationExample();
        
      //  importAnnotationExample();
        
       // injectingBeanExample1();
        
      //  injectingBeanExample2();
        
     //   initDestroyMethodExample();
        
      //  eventHandlingExample();
        
        customEventHandlingExample();
    }
    
    public static void requiredAnnotationExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        RequiredAnnotation requiredAnnotation = (RequiredAnnotation) context.getBean("requiredAnnotation");
        
        System.out.println("Age: " + requiredAnnotation.getAge());
        System.out.println("Name: " + requiredAnnotation.getName());
    }
    
    public static void autowiredOnSetterAnnotation() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        AutowiredOnSetterAnnotation autowired = (AutowiredOnSetterAnnotation) context.getBean("autowiredOnSetterAnnotation");
        autowired.spellCheck();
    }
    
    public static void autowiredOnPropertyAnnotation() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        AutowiredOnPropertyAnnotation autowired = (AutowiredOnPropertyAnnotation) context.getBean("autowiredOnPropertyAnnotation");
        autowired.say();
        autowired.getSpellChecker().checkSpelling();
    }
    
    public static void autowiredOnConstructorAnnotation() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        AutowiredOnConstructorAnnotation autowired = (AutowiredOnConstructorAnnotation) context.getBean("autowiredOnConstructorAnnotation");
        autowired.spellCheck();
    }
    
    public static void qualifierAnnotaionExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        QualifierAnnotation qualifierAnnotation = (QualifierAnnotation) context.getBean("qualifierAnnotation");
        
        System.out.println(qualifierAnnotation.getAddress1());
        System.out.println(qualifierAnnotation.getAddress2());
    }
    
    public static void postConstructPreDestroyAnnotation() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        PostConstructPreDestroyAnnotation postConstructPreDestroyAnnotation = (PostConstructPreDestroyAnnotation) context.getBean("postConstructPreDestroyAnnotation");
        
        System.out.println(postConstructPreDestroyAnnotation.getMessage());
        context.registerShutdownHook();
    }
    
    public static void valueAnnotationExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAnnotations.xml");
        ValueAnnotation valueAnnotation = (ValueAnnotation) context.getBean("valueAnnotation");
        
        System.out.println("Name: " + valueAnnotation.getName());
        System.out.println("Age: " + valueAnnotation.getAge());
    }
    
    public static void importAnnotationExample() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
        helloWorld.setMessage("HelloWorld");
        System.out.println(helloWorld.getMessage());
    }
    
    public static void injectingBeanExample1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        BeanFoo foo = (BeanFoo) context.getBean(BeanFoo.class);
        System.out.println(foo.getMessage());
        System.out.println(foo.getBar().getMessage());
    }
    
    public static void injectingBeanExample2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        AutowiredOnPropertyAnnotation autowired = (AutowiredOnPropertyAnnotation) context.getBean(AutowiredOnPropertyAnnotation.class);
        autowired.say();
        autowired.getSpellChecker().checkSpelling();
    }
    
    public static void initDestroyMethodExample() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        BeanExample beanExample = (BeanExample) context.getBean(BeanExample.class);
        beanExample.setMessage("Hello");
        System.out.println(beanExample.getMessage());
        context.registerShutdownHook();
    }
    
    public static void eventHandlingExample() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(EventHandlingConfig.class);
        
     // Let us raise a start event.
        context.start();
        
        HelloWorld obj = (HelloWorld) context.getBean(HelloWorld.class);
        obj.setMessage("Hello");
        System.out.println(obj.getMessage());

        // Let us raise a stop event.
        context.stop();
    }
    
    public static void customEventHandlingExample() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(EventHandlingConfig.class);
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean(CustomEventPublisher.class);
        
        customEventPublisher.publish1();
    }

}
