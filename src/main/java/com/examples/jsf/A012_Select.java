package com.examples.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.java.Log;

//cdi
@Named(value = "select")
@ApplicationScoped

// lombok
@Log
@Data
@ToString
@AllArgsConstructor
// @NoArgsConstructor
public class A012_Select {
	
	// selectCheckbox
	private boolean checkBool = true;
	
	// selectOneRadio
	private String oneRadio;
	
	// selectOneMenu
	private long secilenId;
	
	public List<ComputerDto> getComputerList() {
		List<ComputerDto> computerDtoList = new ArrayList<>();
		computerDtoList.add(new ComputerDto(100, "1asd", "1dddd"));
		computerDtoList.add(new ComputerDto(200, "2asd", "2dddd"));
		computerDtoList.add(new ComputerDto(300, "3asd", "3dddd"));
		return computerDtoList;
	}
	
	public String selectMethod() {
		log.info("eklendi");
		return "Ders_012_select.xhtml?faces-redirect=true";
	}
	
	////////////////////////////////////////////////////////////////////
	// parametresiz constructor
	public A012_Select() {
		this.secilenId = 300; // defaulta secili gelsin
		selectManyField[0] = "Servlet-1";
		selectManyField[1] = "JSP-1";
	}
	
	///////////////////////////////////////////////////////////////////
	String[] selectManyField = new String[7];
	
	// selectManyCheckBox
	public void selectManyCheckBoxMethod() {
		
	}
	
}
