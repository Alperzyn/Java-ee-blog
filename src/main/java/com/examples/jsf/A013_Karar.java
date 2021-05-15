package com.examples.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.java.Log;

@Named(value = "karar")
@ApplicationScoped
@Log
@Data
public class A013_Karar {
	private String name;
	
	public void ayniSayfadaKal() {
	}
	
	public String ayniSayfadaKal2() {
		return null;
	}
	
	public void metotA(String send) {
		log.warning("Veri:" + send);
		System.out.println(send);
		
	}
	
	////////////////////////////////////////////////////////////////////////
	public String farkliSayfayaGit() {
		
		if (this.name.equalsIgnoreCase("admin"))
			return "denemeAdmin?faces-redirect=true";
		else if (this.name.equalsIgnoreCase("user"))
			return "denemeUser?faces-redirect=true";
		else
			return "404?faces-redirect=true";
	}
	
	//////////////////////////////////////////////////////////////////////////
	
}
