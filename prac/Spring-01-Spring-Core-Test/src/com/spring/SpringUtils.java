package com.spring;

import java.io.File;
import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Spring工具类，用来读取给定id名字的配置文件
 * @author SiVan
 *
 */
public class SpringUtils {
	
	public static Object read(String id) throws MalformedURLException, DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException  {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("src/beans.xml"));
		Element element = (Element) document.selectSingleNode("beans/bean[@id='" + id + "']");
		String name = element.attributeValue("name");
		
		Class c = Class.forName(name);
		return c.newInstance();
		
	}
	
	

}
