package com.java.practice.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Bean.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("Bean.xml");
    	
    	Alien obj1= (Alien) factory.getBean("alien");
    	
    	System.out.println(obj1.getAge());
    	obj1.code();
    	
    
    	
    }
}
