package com.example.Student.Management.System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
  @Id
  int id;
  String name;
  int mobileno;
  String branch;
  int yop;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}
  
}

