package com.ecodation.dto;

import java.io.Serializable;

public class SocialMediaDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long socialId;
	private String socialName;
	
	public SocialMediaDto() {
		// TODO Auto-generated constructor stub
	}
	
	public SocialMediaDto(Long socialId, String socialName) {
		super();
		this.socialId = socialId;
		this.socialName = socialName;
	}
	
	public Long getSocialId() {
		return socialId;
	}
	
	public void setSocialId(Long socialId) {
		this.socialId = socialId;
	}
	
	public String getSocialName() {
		return socialName;
	}
	
	public void setSocialName(String socialName) {
		this.socialName = socialName;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
