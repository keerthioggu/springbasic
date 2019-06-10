package com.springframeworrk;

public class Passport {

	private Integer pid;
	private String issuedCity;
	private String name;
	private Address add;
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Passport() {
		System.out.println("test password");
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getIssuedCity() {
		return issuedCity;
	}
	public void setIssuedCity(String issuedCity) {
		this.issuedCity = issuedCity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
