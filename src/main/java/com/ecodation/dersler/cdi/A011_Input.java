package com.ecodation.dersler.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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

		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "body alan�", "header alan�");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Body", "Ba�l�k"));

		return "Ders_008_Input.xhtml?faces-redirect=true";
	}

	// ayn� sayfada kalmak icin
	public String adiSoyadiMethod2() {
		return null;
	}

	// ayn� sayfada kalmak icin
	public void adiSoyadiMethod3() {
	}

}
