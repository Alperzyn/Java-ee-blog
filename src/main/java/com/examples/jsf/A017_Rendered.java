package com.examples.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.java.Log;

@Named(value = "rendered")
@ApplicationScoped
@Log
@Data
public class A017_Rendered {
	
	private String name;
	
	public void getRendered() {
		
	}
}
