package com.examples.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import lombok.Data;
import lombok.extern.java.Log;

@Named(value = "session")
@ApplicationScoped
@Log
@Data
public class A016_Session {
	
	public void getSessionSet44() {
		HttpSession setSession = HttpMethod.getSession();
		setSession.setAttribute("key", "HamitMizrak44");
		// session.invalidate(); //oturumu sonlandırmak için
		
		String gelenVeri = setSession.getAttribute("key").toString();
		System.out.println("Sesion bilgisi: " + gelenVeri);
		
	}
	
}
