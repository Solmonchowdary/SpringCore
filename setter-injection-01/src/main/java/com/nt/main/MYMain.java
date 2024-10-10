package com.nt.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.cont.WishMessageGenerator;

public class MYMain {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
	    WishMessageGenerator wmg=(WishMessageGenerator)factory.getBean("wmg");
	    wmg.generateWishMessage("solomon");

	}

}
