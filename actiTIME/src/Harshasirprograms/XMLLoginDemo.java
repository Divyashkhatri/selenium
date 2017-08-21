package Harshasirprograms;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLLoginDemo 
{
	public static void main(String[] args) throws Exception
	{
		File fXmlFile = new File("./XMLFiles/login.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		//optional, but recommended

		doc.getDocumentElement().normalize();
		
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("user");

		for (int i = 0; i < nList.getLength(); i++) 
		{
			Node nNode = nList.item(i);

			System.out.println("\nCurrent Element :" + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{

				if(nNode.hasChildNodes())
				{
					NodeList childNodes=  nNode.getChildNodes();

					for(int j=0;j<childNodes.getLength();j++)
					{ 
						Node childNode=childNodes.item(j);

						if(childNode.getNodeType()==Node.ELEMENT_NODE)
						{	  
							Element child=(Element)childNode;
							System.out.println(child.getTagName());
							System.out.println(child.getElementsByTagName("locatortype").item(0).getTextContent());
							System.out.println(child.getElementsByTagName("locatorvalue").item(0).getTextContent());
							System.out.println(child.getElementsByTagName("data").item(0).getTextContent());
						}
					}
				}
			}
		}
	}
}