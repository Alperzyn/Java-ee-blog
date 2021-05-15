
package com.examples.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "register")
@Data @AllArgsConstructor @NoArgsConstructor
public class RegisterEntity implements Serializable {

	private static final long serialVersionUID = -6051380484920087806L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long registerId;

	@Column(name = "registerName", length = 80)
	private String registerName;

	@Column(length = 80)
	private String registerSurname;

	@Column(length = 80, unique = true)
	private String registerEmail;

	@Column(length = 10)
	private String registerPassword;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date registerCreationDate;
	//Date date=new Date(System.currentTimeMillis())

}
