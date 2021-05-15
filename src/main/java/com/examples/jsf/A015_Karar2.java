package com.examples.jsf;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.java.Log;

@Named(value = "passing")
@ApplicationScoped
@Log
@Data
public class A015_Karar2 {
	
	// Param -1
	public void passing1(String pass1) {
		System.out.println("Gelen değer: " + pass1);
		// Db alanı3
	}
	
	// Param-2
	public void passing2() {
		Map<String, String> gelenParam = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap();
		String veri = gelenParam.get("key");
		log.warning(veri + " ");
	}
}
