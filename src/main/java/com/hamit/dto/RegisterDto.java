
package com.hamit.dto;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Named(value = "registerDto")
@ApplicationScoped
@Data @AllArgsConstructor @NoArgsConstructor

public class RegisterDto implements Serializable {

	private static final long serialVersionUID = -6051380484920087806L;
	private long registerId;
	private String registerName;
	private String registerSurname;
	private String registerEmail;
	private String registerPassword;
	private java.util.Date registerCreationDate;

}
