package com.ecodation.dersler.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Named (value = "computer") //cdi bean 
@ApplicationScoped  //kapsam
@Data @AllArgsConstructor @NoArgsConstructor  //bean constructor+ getter +setter+toString+equals
public class A00_ComputerCdi  implements Serializable{
	private static final long serialVersionUID = -4988925368416592924L;
	
	private long computerId=0;
	private String computerName="Msi Gl75";
	private String computerSerial="Glx87585";
	
	private String ui1="ui1";
	private String ui2="ui2";
	private String ui3="ui3";
	
	
	

}
