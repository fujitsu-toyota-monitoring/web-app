package br.com.toyota.tdbmonitor.web.vo;

import java.util.Date;

public class FTPTransmissionStatusVO {
	
	private Date date;
	private int numOfSuccess;
	private int numOfErrors;
	private int numOfNoTransmissions;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getNumOfSuccess() {
		return numOfSuccess;
	}
	
	public void setNumOfSuccess(int numOfSuccess) {
		this.numOfSuccess = numOfSuccess;
	}
	
	public int getNumOfErrors() {
		return numOfErrors;
	}
	
	public void setNumOfErrors(int numOfErrors) {
		this.numOfErrors = numOfErrors;
	}
	
	public int getNumOfNoTransmissions() {
		return numOfNoTransmissions;
	}
	
	public void setNumOfNoTransmissions(int numOfNoTransmissions) {
		this.numOfNoTransmissions = numOfNoTransmissions;
	}
}
