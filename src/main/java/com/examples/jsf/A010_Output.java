package com.examples.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//cdi
@Named(value = "outputEcodation")
@ApplicationScoped

// lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class A010_Output {

	private long id;
	private String name = "Hamit";
	private String surname = "Mizrak";

}
