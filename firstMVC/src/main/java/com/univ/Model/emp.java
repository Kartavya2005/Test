package com.univ.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class emp {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	int eid;
	String ename,ecity,emob,unm,pw;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int eid, String ename, String ecity, String emob, String unm, String pw) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
		this.emob = emob;
		this.unm = unm;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + ", emob=" + emob + ", unm=" + unm + ", pw="
				+ pw + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public String getEmob() {
		return emob;
	}
	public void setEmob(String emob) {
		this.emob = emob;
	}
	public String getUnm() {
		return unm;
	}
	public void setUnm(String unm) {
		this.unm = unm;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	} 
	
	
}
