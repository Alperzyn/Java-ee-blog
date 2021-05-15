package com.examples.jsf;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Named (value = "cdiBean3")
@RequestScoped  // istek oldukça çalýþýr.

@Data 
@AllArgsConstructor  
@NoArgsConstructor  
public class A006_CdiBean3 implements Serializable {
	private static final long serialVersionUID = -7035283249283208777L;
	
	private long id;
	private String name="Hamit";
	private String surname="Mýzrak";
}
