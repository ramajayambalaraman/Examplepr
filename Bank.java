package com.bankdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Emp_bank")
public class Bank {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "bid")
	private int bid;
	
	@Column(name = "bname")
	private String bname;
	
	@ManyToOne
	Employee employee;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
