package br.com.toyota.tdbmonitor.web.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.toyota.tdbmonitor.web.vo.FTPTransmissionStatusVO;

@SessionScoped
@ManagedBean(name = "dashboardBean")
public class DashboardBean {
	
	private List<FTPTransmissionStatusVO> ftpTransmissionList;
	
	@PostConstruct
	public void init() {
		loadDashboardData();
	}
	
	private void loadDashboardData() {
		
		ftpTransmissionList = new ArrayList<FTPTransmissionStatusVO>();
		Calendar calendar = Calendar.getInstance();
		
		
		FTPTransmissionStatusVO teste1 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, -29);
		teste1.setDate(calendar.getTime());
		teste1.setNumOfSuccess(150);
		teste1.setNumOfErrors(235);
		teste1.setNumOfNoTransmissions(34);
		
		FTPTransmissionStatusVO teste2 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste2.setDate(calendar.getTime());
		teste2.setNumOfSuccess(183);
		teste2.setNumOfErrors(201);
		teste2.setNumOfNoTransmissions(17);
		
		FTPTransmissionStatusVO teste3 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste3.setDate(calendar.getTime());
		teste3.setNumOfSuccess(194);
		teste3.setNumOfErrors(267);
		teste3.setNumOfNoTransmissions(10);
		
		FTPTransmissionStatusVO teste4 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste4.setDate(calendar.getTime());
		teste4.setNumOfSuccess(102);
		teste4.setNumOfErrors(167);
		teste4.setNumOfNoTransmissions(2);
		
		FTPTransmissionStatusVO teste5 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste5.setDate(calendar.getTime());
		teste5.setNumOfSuccess(250);
		teste5.setNumOfErrors(331);
		teste5.setNumOfNoTransmissions(29);
		
		FTPTransmissionStatusVO teste6 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste6.setDate(calendar.getTime());
		teste6.setNumOfSuccess(143);
		teste6.setNumOfErrors(199);
		teste6.setNumOfNoTransmissions(9);
		
		FTPTransmissionStatusVO teste7 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste7.setDate(calendar.getTime());
		teste7.setNumOfSuccess(201);
		teste7.setNumOfErrors(456);
		teste7.setNumOfNoTransmissions(72);
		
		FTPTransmissionStatusVO teste8 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste8.setDate(calendar.getTime());
		teste8.setNumOfSuccess(150);
		teste8.setNumOfErrors(235);
		teste8.setNumOfNoTransmissions(34);
		
		FTPTransmissionStatusVO teste9 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste9.setDate(calendar.getTime());
		teste9.setNumOfSuccess(183);
		teste9.setNumOfErrors(201);
		teste9.setNumOfNoTransmissions(17);
		
		FTPTransmissionStatusVO teste10 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste10.setDate(calendar.getTime());
		teste10.setNumOfSuccess(194);
		teste10.setNumOfErrors(267);
		teste10.setNumOfNoTransmissions(10);
		
		FTPTransmissionStatusVO teste11 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste11.setDate(calendar.getTime());
		teste11.setNumOfSuccess(102);
		teste11.setNumOfErrors(167);
		teste11.setNumOfNoTransmissions(2);
		
		FTPTransmissionStatusVO teste12 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste12.setDate(calendar.getTime());
		teste12.setNumOfSuccess(250);
		teste12.setNumOfErrors(331);
		teste12.setNumOfNoTransmissions(29);
		
		FTPTransmissionStatusVO teste13 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste13.setDate(calendar.getTime());
		teste13.setNumOfSuccess(143);
		teste13.setNumOfErrors(199);
		teste13.setNumOfNoTransmissions(9);
		
		FTPTransmissionStatusVO teste14 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste14.setDate(calendar.getTime());
		teste14.setNumOfSuccess(201);
		teste14.setNumOfErrors(456);
		teste14.setNumOfNoTransmissions(72);
		
		FTPTransmissionStatusVO teste15 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste15.setDate(calendar.getTime());
		teste15.setNumOfSuccess(150);
		teste15.setNumOfErrors(235);
		teste15.setNumOfNoTransmissions(34);
		
		FTPTransmissionStatusVO teste16 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste16.setDate(calendar.getTime());
		teste16.setNumOfSuccess(183);
		teste16.setNumOfErrors(201);
		teste16.setNumOfNoTransmissions(17);
		
		FTPTransmissionStatusVO teste17 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste17.setDate(calendar.getTime());
		teste17.setNumOfSuccess(194);
		teste17.setNumOfErrors(267);
		teste17.setNumOfNoTransmissions(10);
		
		FTPTransmissionStatusVO teste18 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste18.setDate(calendar.getTime());
		teste18.setNumOfSuccess(102);
		teste18.setNumOfErrors(167);
		teste18.setNumOfNoTransmissions(2);
		
		FTPTransmissionStatusVO teste19 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste19.setDate(calendar.getTime());
		teste19.setNumOfSuccess(250);
		teste19.setNumOfErrors(331);
		teste19.setNumOfNoTransmissions(29);
		
		FTPTransmissionStatusVO teste20 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste20.setDate(calendar.getTime());
		teste20.setNumOfSuccess(143);
		teste20.setNumOfErrors(199);
		teste20.setNumOfNoTransmissions(9);
		
		FTPTransmissionStatusVO teste21= new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste21.setDate(calendar.getTime());
		teste21.setNumOfSuccess(201);
		teste21.setNumOfErrors(456);
		teste21.setNumOfNoTransmissions(72);
		
		FTPTransmissionStatusVO teste22 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste22.setDate(calendar.getTime());
		teste22.setNumOfSuccess(150);
		teste22.setNumOfErrors(235);
		teste22.setNumOfNoTransmissions(34);
		
		FTPTransmissionStatusVO teste23 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste23.setDate(calendar.getTime());
		teste23.setNumOfSuccess(183);
		teste23.setNumOfErrors(201);
		teste23.setNumOfNoTransmissions(17);
		
		FTPTransmissionStatusVO teste24 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste24.setDate(calendar.getTime());
		teste24.setNumOfSuccess(194);
		teste24.setNumOfErrors(267);
		teste24.setNumOfNoTransmissions(10);
		
		FTPTransmissionStatusVO teste25 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste25.setDate(calendar.getTime());
		teste25.setNumOfSuccess(102);
		teste25.setNumOfErrors(167);
		teste25.setNumOfNoTransmissions(2);
		
		FTPTransmissionStatusVO teste26 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste26.setDate(calendar.getTime());
		teste26.setNumOfSuccess(250);
		teste26.setNumOfErrors(331);
		teste26.setNumOfNoTransmissions(29);
		
		FTPTransmissionStatusVO teste27 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste27.setDate(calendar.getTime());
		teste27.setNumOfSuccess(143);
		teste27.setNumOfErrors(199);
		teste27.setNumOfNoTransmissions(9);
		
		FTPTransmissionStatusVO teste28 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste28.setDate(calendar.getTime());
		teste28.setNumOfSuccess(201);
		teste28.setNumOfErrors(456);
		teste28.setNumOfNoTransmissions(72);
		
		FTPTransmissionStatusVO teste29 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste29.setDate(calendar.getTime());
		teste29.setNumOfSuccess(150);
		teste29.setNumOfErrors(235);
		teste29.setNumOfNoTransmissions(34);
		
		FTPTransmissionStatusVO teste30 = new FTPTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste30.setDate(calendar.getTime());
		teste30.setNumOfSuccess(183);
		teste30.setNumOfErrors(201);
		teste30.setNumOfNoTransmissions(17);
		
		ftpTransmissionList.add(teste1);
		ftpTransmissionList.add(teste2);
		ftpTransmissionList.add(teste3);
		ftpTransmissionList.add(teste4);
		ftpTransmissionList.add(teste5);
		ftpTransmissionList.add(teste6);
		ftpTransmissionList.add(teste7);
		ftpTransmissionList.add(teste8);
		ftpTransmissionList.add(teste9);
		ftpTransmissionList.add(teste10);
		ftpTransmissionList.add(teste11);
		ftpTransmissionList.add(teste12);
		ftpTransmissionList.add(teste13);
		ftpTransmissionList.add(teste14);
		ftpTransmissionList.add(teste15);
		ftpTransmissionList.add(teste16);
		ftpTransmissionList.add(teste17);
		ftpTransmissionList.add(teste18);
		ftpTransmissionList.add(teste19);
		ftpTransmissionList.add(teste20);
		ftpTransmissionList.add(teste21);
		ftpTransmissionList.add(teste22);
		ftpTransmissionList.add(teste23);
		ftpTransmissionList.add(teste24);
		ftpTransmissionList.add(teste25);
		ftpTransmissionList.add(teste26);
		ftpTransmissionList.add(teste27);
		ftpTransmissionList.add(teste28);
		ftpTransmissionList.add(teste29);
		ftpTransmissionList.add(teste30);
	}

	public List<FTPTransmissionStatusVO> getFtpTransmissionList() {
		return ftpTransmissionList;
	}

	public void setFtpTransmissionList(List<FTPTransmissionStatusVO> ftpTransmissionList) {
		this.ftpTransmissionList = ftpTransmissionList;
	}
}
