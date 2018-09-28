package com.petifee.domain;

import java.util.Date;

public class UserVO {
	private String uid;
	private String upw;
	private String uname;
	private int upoint;
	
	@Override
	public String toString(){
		return "[uid=" + uid + ",upw=" + upw + ",uname=" + uname + ",upoint=" + upoint + "]";
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getUpw() {
		return upw;
	}
	
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public int getUpoint() {
		return upoint;
	}
	
	public void setUpoint(int upoint) {
		this.upoint = upoint;
	}
	
	private Date regdate;
	
	public Date getRegdate() {
		return regdate;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}



}
