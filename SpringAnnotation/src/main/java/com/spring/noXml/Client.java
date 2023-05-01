package com.spring.noXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationBeans.class);
        Person p =  context.getBean("person",Person.class);
        //Address b =  context.getBean("address",Address.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.show();
    }
 
}
