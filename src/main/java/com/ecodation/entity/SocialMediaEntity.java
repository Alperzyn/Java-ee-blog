package com.ecodation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "social")
// @GenelAnotasyonlar

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialMediaEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int socialId;
	
	@Column(name = "social_name", length = 50, unique = true)
	private String socialName;
	
}
