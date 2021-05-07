package com.ecodation.dersler.cdi;

import javax.inject.Inject;

public class A008_Inject {

	@Inject
	A007_Student student;

	public A007_Student getStudent() {
		return student;
	}

	// public A008_Inject ( ) {
	// A007_Student student=new A007_Student ( );
	// }

}
