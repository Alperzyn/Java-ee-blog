package com.ecodation.dersler.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Named (value = "cdiBean2")
@SessionScoped  // 1 kullanýcýlar içindir.

@Data 
@AllArgsConstructor  
@NoArgsConstructor  
public class A005_CdiBean2 implements Serializable {
	private static final long serialVersionUID = -7035283249283208777L;
	
	private long id;
	private String name="Hamit";
	private String surname="Mýzrak";
}
