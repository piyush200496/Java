package org.parser;

import java.io.IOException;

import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class test {
public static void main(String[] args) throws ParserConfigurationException{
	try{DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=factory.newDocumentBuilder();
	Document document=builder.parse("D://sample.xml");
    org.w3c.dom.Element element=document.getDocumentElement();
		NodeList list=((Node) element).getChildNodes();
		for(int i=0;i<list.getLength();i++){
			Node node=list.item(i);
			System.out.println(node.getNodeName()+" ");
		}
	}catch(ParserConfigurationException| SAXException | IOException e){
	e.printStackTrace();
	
}
	
}
}
