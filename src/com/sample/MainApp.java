package com.sample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        context.refresh();
Bar bar=(Bar) context.getBean("bar");
Foo foo=(Foo) context.getBean("foo");
bar.setFoo(foo);
bar.processFooName();
System.out.println(bar);
	}

}
