package com.springframeworrk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "emp1")
public class Test1 {
	@Column(name="nam")
	private String nam;
	@Column(name="usrnam")
	private String usrnam;
	@Column(name="mbl")
	private String mbl;
	@Id
	@Column(name="mail")
	private String mail;
	@Column(name="pwd")
	private String pwd;
	@Version
	@Column(name="version")
	private long versionnum;
	
	@Column(name="roles")
	private String role="ROLE_USER";
	
	public long getVersionnum() {
		return versionnum;
	}
	public void setVersionnum(long versionnum) {
		this.versionnum = versionnum;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public String getUsrnam() {
		return usrnam;
	}
	public void setUsrnam(String usrnam) {
		this.usrnam = usrnam;
	}
	public String getMbl() {
		return mbl;
	}
	public void setMbl(String mbl) {
		this.mbl = mbl;
	}
	public String getMail() {
		return mail;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	

}