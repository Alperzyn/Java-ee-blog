package com.ecodation.dersler;

import java.io.Serializable;
import java.util.Objects;


@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class A003_ManagedBean implements Serializable {
	private static final long serialVersionUID = 2229563708060150583L;
	
	private long id;
	private String name;
	private String surname;
	
	
	public A003_ManagedBean ( ) {
		// TODO Auto-generated constructor stub
	}


	public A003_ManagedBean ( long id , String name , String surname ) {
		super ( );
		this.id		= id;
		this.name		= name;
		this.surname	= surname;
	}


	@Override
	public String toString ( ) {
		return "A002_Bean [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}


	@Override
	public int hashCode ( ) {
		return Objects.hash ( id , name , surname );
	}


	@Override
	public boolean equals ( Object obj ) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass ( ) != obj.getClass ( ) )
			return false;
		A003_ManagedBean other = ( A003_ManagedBean ) obj;
		return id == other.id && Objects.equals ( name , other.name ) && Objects.equals ( surname , other.surname );
	}


	
	public long getId ( ) {
		return id;
	}


	
	public void setId ( long id ) {
		this.id = id;
	}


	
	public String getName ( ) {
		return name;
	}


	
	public void setName ( String name ) {
		this.name = name;
	}


	
	public String getSurname ( ) {
		return surname;
	}


	
	public void setSurname ( String surname ) {
		this.surname = surname;
	}
	
	
}
