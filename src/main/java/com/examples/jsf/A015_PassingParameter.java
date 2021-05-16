package com.examples.jsf;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.java.Log;

@Named(value = "passing")
@ApplicationScoped
@Log
@Data
public class A015_PassingParameter {
	
	// Param -1 action Methodd ile
	public void passing1(String pass1) {
		System.out.println("Gelen değer: " + pass1);
		log.warning(pass1 + " ");
		// Db alanı3
	}
	
	// Param-2 action /servlet ile
	public void passing2() {
		Map<String, String> gelenParam = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap();
		String veri = gelenParam.get("key2");
		log.warning(veri + " ");
	}
	
	// Param-3 actionListener
	public void passing3(ActionEvent actionEvent) {
		System.out.println(actionEvent.getComponent().getAttributes().get("key3"));
		log.warning(actionEvent.getComponent().getAttributes().get("key3") + " ");
		
	}
}
