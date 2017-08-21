package Harshasirprograms;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder build = fac.newDocumentBuilder();
		Document doc = build.parse(new File("./XMLFiles/xmlDemo.xml"));
		doc.getDocumentElement().normalize();
		System.out.println(doc.getDocumentElement().getNodeName());
		
		NodeList lst = doc.getElementsByTagName("D");
		for(int i=0;i<lst.getLength();i++)
		{
			System.out.print(lst.item(i).getTextContent()+" ");
		}	
	}
}
