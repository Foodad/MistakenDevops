package com.accenture.utilities;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLUtility {

	public void readXML() throws JAXBException{
		File f = new File("C:\\java demo\\MavenPro\\src\\test\\java\\TestData.xml");
		JAXBContext j = JAXBContext.newInstance(RegData.class);
		Unmarshaller u = j.createUnmarshaller();
		RegData r = (RegData)u.unmarshal(f);
		List<Data> mydata = r.getUserdata();
		for(Data d:mydata){
			System.out.println("First Name " + d.getFirstname());
			System.out.println("Last Name " + d.getLastname());
		}
	}
	
	public static void main(String args[]) throws JAXBException{
		XMLUtility x = new XMLUtility();
		x.readXML();
	}
	
}
