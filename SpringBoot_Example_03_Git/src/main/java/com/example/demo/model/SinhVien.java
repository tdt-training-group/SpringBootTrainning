package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "student")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class SinhVien implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer sid;
	private String sname;
	private String sage;
	private float smark;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSage() {
		return sage;
	}

	public void setSage(String sage) {
		this.sage = sage;
	}

	public float getSmark() {
		return smark;
	}

	public void setSmark(float smark) {
		this.smark = smark;
	}

	public SinhVien(Integer sid, String sname, String sage, float smark) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.smark = smark;
	}

	public SinhVien() {
		super();
	}

}
