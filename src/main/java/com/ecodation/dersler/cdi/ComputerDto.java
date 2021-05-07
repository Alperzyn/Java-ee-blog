package com.ecodation.dersler.cdi;

public class ComputerDto {

	private long id;
	private String computerName;
	private String computerTrade;

	public ComputerDto() {
		// TODO Auto-generated constructor stub
	}

	public ComputerDto(long id, String computerName, String computerTrade) {
		super();
		this.id = id;
		this.computerName = computerName;
		this.computerTrade = computerTrade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public String getComputerTrade() {
		return computerTrade;
	}

	public void setComputerTrade(String computerTrade) {
		this.computerTrade = computerTrade;
	}

}
