package com.ecodation.dersler.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//cdi
@Named(value = "input")
@ApplicationScoped

// lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class A011_Input {

	private long id;
	private String name = "";
	private String surname = "";

	public String adiSoyadiMethod() {
		return "Ders_008_Input.xhtml?faces-redirect=true";
	}

}
