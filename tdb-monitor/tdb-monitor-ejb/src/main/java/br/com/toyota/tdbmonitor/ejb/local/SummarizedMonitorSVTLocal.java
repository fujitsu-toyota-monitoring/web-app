package br.com.toyota.tdbmonitor.ejb.local;

import javax.ejb.Local;

import br.com.toyota.tdbmonitor.entity.SummarizedMonitorSVT;

//@Local
public interface SummarizedMonitorSVTLocal {
	
	public SummarizedMonitorSVT find(int id);

}
