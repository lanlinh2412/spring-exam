package vn.com.vti.springexam.form;


import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class InfraForm {
	@NotNull
	private Integer id;
	
	@NotBlank
	private String name;
	
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date date;
	

	public Integer getId() {
	return id;
	}
	public void setId(Integer id) {
	this.id = id;
	}
	

	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	
	public Date getDate() {
	return date;
	}
	public void setDate(Date date) {
	this.date = date;
	}

}
