package com.spring.noXml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
 
@Configuration
 
public class ApplicationBeans {
//    @Bean(name="address")
//    public Address getAddress()
//    {
//	Address ad = new Address("vns","up",120);
//	return ad;
//    }
    @Bean(name="person")
    public Person getPerson(){
    	Address ad = new Address("vns","up",120);
        Person p = new Person("Anil", 25, ad );
        return p;
    }
 
}