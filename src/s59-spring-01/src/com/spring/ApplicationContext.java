package com.spring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ApplicationContext {

	public static Object getInstance(String id) throws FileNotFoundException,
			DocumentException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {

		SAXReader reader = new SAXReader();
		Document document = reader.read(new FileInputStream("src/bean.xml"));

		Element element = (Element) document.selectSingleNode("beans/bean[@id='"
				+ id + "']");

		
		String name = element.attributeValue("name");

		Class c = Class.forName(name);

		return c.newInstance();

	}

}
