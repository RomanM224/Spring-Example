package com.maistruk.spring_1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.maistruk.spring_1.beans.BeanAutoWiringByName;
import com.maistruk.spring_1.beans.BeanAutoWiringByType;
import com.maistruk.spring_1.beans.BeanAutoWiringConstructor;
import com.maistruk.spring_1.beans.BeanCollection_1;
import com.maistruk.spring_1.beans.BeanCollection_2;
import com.maistruk.spring_1.beans.BeanExample;
import com.maistruk.spring_1.beans.BeanPostProcessorExample;
import com.maistruk.spring_1.beans.HelloWorld;
import com.maistruk.spring_1.beans.HelloWorldChild;
import com.maistruk.spring_1.beans.HelloWorldParent;
import com.maistruk.spring_1.beans.HelloWorldTemplateChild;
import com.maistruk.spring_1.beans.OuterBean;
import com.maistruk.spring_1.beans.PrototypeBean;
import com.maistruk.spring_1.beans.SingletonBean;
import com.maistruk.spring_1.beans.TextEditor_1;
import com.maistruk.spring_1.beans.TextEditor_2;

public class Main {

    public static void main(String[] args) {

       //  firstExample();

         //singletonExample();

       // protorypeExample();

        // initDestroyMethodExample();

        // beanPostProcessorExample();
         
         //beanInheritanceExample();
         
       //  beanTemplateInheritanceExample();
        
       // beanDependencyInjectionConstructorBased();
        
       // beanDependencyInjectionSetterBased();
        
       // innerBeanExample();
        
       // beanCollectionExample_1();
        
      //  beanCollectionExample_2();
        
       // beanAutoWiringByName();
        
       // beanAutoWiringByType();
        
      //  beanAutoWiringByConstructor();
    }

    public static void firstExample() {
//        Create BeanFactory(deprecated)
//        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("BeansFirstExample.xml")); 
//        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");

//        Create ApplicationContext
//        ApplicationContext context = new FileSystemXmlApplicationContext("C:/workspace/spring_1/src/main/java/BeansFirstExample.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansFirstExample.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.getMessage());
    }

    public static void singletonExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansSingletonPrototype.xml");
        SingletonBean obj1 = (SingletonBean) context.getBean("singletonBean");
        SingletonBean obj2 = (SingletonBean) context.getBean("singletonBean");

        System.out.println("Singleton, obj1 and obj2 are same: " + obj1.equals(obj2));
    }

    public static void protorypeExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansSingletonPrototype.xml");
        PrototypeBean obj1 = (PrototypeBean) context.getBean("prototypeBean");
        PrototypeBean obj2 = (PrototypeBean) context.getBean("prototypeBean");

        System.out.println("Protorype, obj1 and obj2 are same: " + obj1.equals(obj2));
    }

    public static void initDestroyMethodExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansInitDestroy.xml");
        BeanExample obj = (BeanExample) context.getBean("beanExample");
        System.out.println(obj.getMessage());
        context.registerShutdownHook();
    }

    public static void beanPostProcessorExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansPostProcessorExample.xml");
        BeanPostProcessorExample obj = (BeanPostProcessorExample) context.getBean("beanPostProcessorExample");
        System.out.println(obj.getMessage());
        context.registerShutdownHook();
    }
    
    public static void beanInheritanceExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansInheritanceExample.xml");
        HelloWorldParent obj1 = (HelloWorldParent) context.getBean("helloWorldParent");
        System.out.println(obj1.getMessage1());
        System.out.println(obj1.getMessage2());
        
        HelloWorldChild obj2 = (HelloWorldChild) context.getBean("helloWorldChild");
        System.out.println(obj2.getMessage1());
        System.out.println(obj2.getMessage2());
        System.out.println(obj2.getMessage3());

    }
    
    public static void beanTemplateInheritanceExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansInheritanceExample.xml");
        HelloWorldTemplateChild obj2 = (HelloWorldTemplateChild) context.getBean("helloWorldTemplateChild");
        System.out.println(obj2.getMessage1());
        System.out.println(obj2.getMessage2());
        System.out.println(obj2.getMessage3());
    }
    
    public static void beanDependencyInjectionConstructorBased() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansDependencyInjection.xml");
        
        TextEditor_1 textEditor = (TextEditor_1) context.getBean("textEditor_1");
        textEditor.spellCheck();
        System.out.println(textEditor.getYear());
        System.out.println(textEditor.getNumber());
        System.out.println(textEditor.getStr());
    }
    
    public static void beanDependencyInjectionSetterBased() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansDependencyInjection.xml");
        
        TextEditor_2 textEditor = (TextEditor_2) context.getBean("textEditor_2");
        textEditor.spellCheck();

    }
    
    public static void innerBeanExample() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("InnerBeanExample.xml");
        
        OuterBean outerBean = (OuterBean) context.getBean("outerBean");
        System.out.println(outerBean.getMessage());
        System.out.println(outerBean.getInnerBean().getMessage());
    }
    
    public static void beanCollectionExample_1() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansCollections.xml");
        BeanCollection_1 collections = (BeanCollection_1) context.getBean("javaCollection_1");
        
        collections.getAddressList();
        collections.getAddressSet();
        collections.getAddressMap();
        collections.getAddressProp(); 
    }
    
    public static void beanCollectionExample_2() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansCollections.xml");
        BeanCollection_2 collections = (BeanCollection_2) context.getBean("javaCollection_2");
        
        System.out.println(collections.getAddressList());
        System.out.println(collections.getAddressSet());
        System.out.println(collections.getAddressMap()); 
    }
    
    public static void beanAutoWiringByName() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAutoWiring.xml");
        BeanAutoWiringByName autoWiringByName = (BeanAutoWiringByName) context.getBean("beanAutoWiringByName");

        System.out.println(autoWiringByName.getAddress1());
        System.out.println(autoWiringByName.getMessage());
    }
    
    public static void beanAutoWiringByType() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAutoWiring.xml");
        BeanAutoWiringByType autoWiringByName = (BeanAutoWiringByType) context.getBean("beanAutoWiringByType");

        System.out.println(autoWiringByName.getAddress());
        System.out.println(autoWiringByName.getMessage());
    }
    
    public static void beanAutoWiringByConstructor() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansAutoWiring.xml");
        BeanAutoWiringConstructor autoWiringByName = (BeanAutoWiringConstructor) context.getBean("beanAutoWiringByConstructor");

        System.out.println(autoWiringByName.getAddress());
        System.out.println(autoWiringByName.getMessage());
    }

}
