package com.bankdetails;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="emplo")
public class Employee {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "eid")
	private int eid;
	
	@Column(name="ename")
	private String ename;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	List<Bank> listbank;
	@JoinColumn(name = "eid")
	
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

	public List<Bank> getListbank() {
		return listbank;
	}

	public void setListbank(List<Bank> listbank) {
		this.listbank = listbank;
	}

	
	


	
}
