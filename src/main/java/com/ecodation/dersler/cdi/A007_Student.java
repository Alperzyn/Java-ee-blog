package com.ecodation.dersler.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Named(value = "studentCdi")
@ApplicationScoped
@Data  @AllArgsConstructor @NoArgsConstructor //DAN
public class A007_Student implements Serializable {
	private static final long serialVersionUID = 5130396173721010614L;
	
	private long studentId;
	private String name;
	private String surname;
	
	
}
