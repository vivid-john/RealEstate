import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.HashMap;


public class XmlImport {
	
	public static void main(String ars[]){
		
		//execution triggered from main
		new XmlImport().loadAndParse("sample-reaxml.xml");
		
	}

	private  void loadAndParse(String file) {
		//using Hashmap instead of associative array
		HashMap data ;
		
	
		try{
				File fXmlFile = new File(file);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
				Document doc = dBuilder.parse(fXmlFile);
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				// 	TODO Auto-generated method stub
				
				if(doc.hasChildNodes()){
					NodeList nodList = doc.getChildNodes();
					childNode(nodList.item(0).getChildNodes());
					
				}
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
	private  HashMap childNode(NodeList nodList){
		
		HashMap data = new HashMap();
		
			//iterating through the list
			for(int i=1;i<nodList.getLength();i=i+2){
				System.out.println("node name  " + nodList.getLength()+nodList.item(i).getNodeName());
				Element element = (Element) nodList.item(i).getChildNodes();
				System.out.println(element.getElementsByTagName("uniqueID").item(0).getTextContent());
				//if(nodList.item(i).hasChildNodes()) childNode(nodList.item(i).getChildNodes());
				
				data.put(element.getElementsByTagName("uniqueID").item(0).getTextContent(), nodList.item(i).getNodeName());
			}
		return data;
	}

}
