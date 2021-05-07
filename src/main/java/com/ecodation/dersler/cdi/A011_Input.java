package com.ecodation.dersler.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

//cdi
@Named(value = "input")
@ApplicationScoped

// lombok
@Log
@Data
@AllArgsConstructor
@NoArgsConstructor
public class A011_Input {

	private long id;
	private String name = "";
	private String surname = "";
	private String password;
	private String form;

	public String adiSoyadiMethod() {
		System.out.println(this.id + " " + this.name + " " + this.surname + " " + this.password);
		log.info(this.id + " " + this.name + " " + this.surname + " " + this.password);
		log.warning(this.id + " " + this.name + " " + this.surname + " " + this.password);
		return "Ders_008_Input.xhtml?faces-redirect=true";
	}

	// ayný sayfada kalmak icin
	public String adiSoyadiMethod2() {
		return null;
	}

	// ayný sayfada kalmak icin
	public void adiSoyadiMethod3() {
	}

}
