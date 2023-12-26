package com.pitProcrumentService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
 private Integer id;
 public void setId(Integer id) {
	this.id = id;
}
public long getId() {
	return id;
}

@Column(name="First_name")
private String  First_name;
 @Column(name="Last_name")
private String  Last_name_name;
 @Column(name="Email")
private String  Email;
 @Column(name="Password")
private String  Password;
 @Column(name="Login")
 private String  Login;
 @ManyToOne
 @JoinColumn(name = "pid", referencedColumnName = "id")
 
 private PurchaseOrder PurchaseOrder;

 
public String getFirst_name() {
	return First_name;
}
public void setFirst_name(String first_name) {
	First_name = first_name;
}
public String getLast_name_name() {
	return Last_name_name;
}
public void setLast_name_name(String last_name_name) {
	Last_name_name = last_name_name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getLogin() {
	return Login;
}
public void setLogin(String login) {
	Login = login;
}


public PurchaseOrder getPurchaseOrder() {
	return PurchaseOrder;
}
public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
	PurchaseOrder = purchaseOrder;
}
}
