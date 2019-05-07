package br.com.toyota.tdbmonitor.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

//@Entity
//@Table(name = "SUMMARIZED_MONITOR_SVT")
public class SummarizedMonitorSVT implements Serializable{
	
/*	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERTION_DATE", nullable = false)
	private Date insertionDate;
	
	@NotNull
	@Column(name = "DEALER_ID", nullable = false)
	private int dealerId;
	
	@NotNull
	@Column(name = "NUM_OF_EVENTS", nullable = false)
	private int numOfEvents;
	
	@NotNull
	@Column(name = "TYPE", nullable = false)
	private String type;

	public Date getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(Date insertionDate) {
		this.insertionDate = insertionDate;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public int getNumOfEvents() {
		return numOfEvents;
	}

	public void setNumOfEvents(int numOfEvents) {
		this.numOfEvents = numOfEvents;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}
*/
}
