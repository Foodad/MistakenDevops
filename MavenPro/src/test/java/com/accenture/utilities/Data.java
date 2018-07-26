package com.accenture.utilities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data")
public class Data {
	
	private String Firstname;
	private String Lastname;
	
	@XmlElement(name="Firstname")
	public void setFirstname(String fn){
		this.Firstname = fn;
	}
	public String getFirstname(){
		return Firstname;
	}
	
	
	@XmlElement(name="Lastname")
	public void setLastname(String ln){
		this.Lastname = ln;
	}
	public String getLastname(){
		return Lastname;
	}
}
