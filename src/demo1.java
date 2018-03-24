import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class demo1 {
	public static void main(String[] args) throws Exception  {
	
		demo1 d = new demo1();
		d.read();
	}
	
	
	private void read() throws Exception{
		
		HashMap<String,String> map = new HashMap<String,String>();
		List list = new ArrayList();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		org.w3c.dom.Document document = builder.parse("src/CATALOG.xml");
		
		Node root = document.getElementsByTagName("CATALOG").item(0);
		//System.out.println(root.getNodeName());
		list(root);
	}
	
	public  void list(Node node){
		if(node instanceof org.w3c.dom.Element)
			System.out.println(node.getNodeName());
		
		NodeList list = node.getChildNodes();
		for(int i = 0;i<list.getLength();i++){
			Node child = list.item(i);
			list(child);
		}
	}
}
