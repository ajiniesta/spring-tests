package com.iniesta.brains.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Triangle triangle = new Triangle();
//    	String file = App.class.getResource("spring.xml").getFile();
//    	System.out.println("File to load " + file);
    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
    	Triangle triangle = factory.getBean("triangle", Triangle.class);
    	triangle.draw();
    }
}
