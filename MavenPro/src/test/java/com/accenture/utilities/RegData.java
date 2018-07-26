package com.accenture.utilities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="registrationData")
public class RegData {

private List<Data> regdata;
		
	@XmlElement(name="data")
	public void setUserdata(List<Data> d){
		this.regdata=d;
	}
	public List<Data> getUserdata(){
		return regdata;
	}
}
