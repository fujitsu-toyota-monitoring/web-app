package br.com.toyota.tdbmonitor.web.vo;

import java.util.Date;

public class SVTTransmissionStatusVO {
	
	private Date date;
	private int numOfPending;
	private int numOfErrors;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNumOfPending() {
		return numOfPending;
	}
	
	public void setNumOfPending(int numOfPending) {
		this.numOfPending = numOfPending;
	}
	
	public int getNumOfErrors() {
		return numOfErrors;
	}
	
	public void setNumOfErrors(int numOfErrors) {
		this.numOfErrors = numOfErrors;
	}
}
