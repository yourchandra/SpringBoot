package com.bvr.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("driver")
public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	
	private License license;

	@Autowired
	public void setLicense(License license) {
		this.license = license;
	}
	public License getLicense() {
		return license;
	}
	@Override
	public String toString() {
		return "Driver [license=" + license + "]";
	}

	
	
	

	
	
}
