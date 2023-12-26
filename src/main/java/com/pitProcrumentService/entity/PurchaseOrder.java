package com.pitProcrumentService.entity;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.ManyToAny;
import org.springframework.http.HttpStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name = "purchaseorder")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Integer id;
    @Column(name="po_number")
    private Long po_number;
    @Column(name="po_date")
    private Date po_date;
    @Column(name="validfrom")
    private LocalDate validfrom;
   
	@Column(name="validto")
    private LocalDate validto;
    	
	@Column(name="priceper_unit")
    private Integer priceper_unit;
	
	@Column(name="ship_toaddr")
    private String ship_toaddr;
    @Column(name="net_value")
     private Integer net_value;
    @Column(name="resource_name")
    private String resource_name;
    
    public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	@Column(name="Reporting_Manager")
    private String Reporting_Manager;
    @Column(name="Line_item")
    private String Line_item;
    @Column(name="Order_Quntity")
    private String Order_quntity;
    @Column(name="Used_Quntity")
    private String Used_Quntity;
    @Column(name="Remaining_quntity")
    private String Remaining_quntity;
    @Column(name="Contract_EndDate")
    private String Contract_EndDate;
    @Column(name=" Po_EndDate")
    private String Po_EndDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getPo_number() {
		return po_number;
	}
	public void setPo_number(Long po_number) {
		this.po_number = po_number;
	}
	public Date getPo_date() {
		return po_date;
	}
	public void setPo_date(Date po_date) {
		this.po_date = po_date;
	}
	
	public Integer getPriceper_unit() {
		return priceper_unit;
	}
	public void setPriceper_unit(Integer priceper_unit) {
		this.priceper_unit = priceper_unit;
	}
	
	
	public String getShip_toaddr() {
		return ship_toaddr;
	}
	public void setShip_toaddr(String ship_toaddr) {
		this.ship_toaddr = ship_toaddr;
	}
	public Integer getNet_value() {
		return net_value;
	}
	public void setNet_value(Integer net_value) {
		this.net_value = net_value;
	}
	public String getReporting_Manager() {
		return Reporting_Manager;
	}
	public void setReporting_Manager(String reporting_Manager) {
		Reporting_Manager = reporting_Manager;
	}
	public String getLine_item() {
		return Line_item;
	}
	public void setLine_item(String line_item) {
		Line_item = line_item;
	}
	public String getOrder_quntity() {
		return Order_quntity;
	}
	public void setOrder_quntity(String order_quntity) {
		Order_quntity = order_quntity;
	}
	public String getUsed_Quntity() {
		return Used_Quntity;
	}
	public void setUsed_Quntity(String used_Quntity) {
		Used_Quntity = used_Quntity;
	}
	public String getRemaining_quntity() {
		return Remaining_quntity;
	}
	public void setRemaining_quntity(String remaining_quntity) {
		Remaining_quntity = remaining_quntity;
	}
	public String getContract_EndDate() {
		return Contract_EndDate;
	}
	public void setContract_EndDate(String contract_EndDate) {
		Contract_EndDate = contract_EndDate;
	}
	public String getPo_EndDate() {
		return Po_EndDate;
	}
	public void setPo_EndDate(String po_EndDate) {
		Po_EndDate = po_EndDate;
	}
	public LocalDate getValidfrom() {
		return validfrom;
	}
	public void setValidfrom(LocalDate validfrom) {
		this.validfrom = validfrom;
	}
	public LocalDate getValidto() {
		return validto;
	}
	public void setValidto(LocalDate validto) {
		this.validto = validto;
	}
	
	
}
  
	
