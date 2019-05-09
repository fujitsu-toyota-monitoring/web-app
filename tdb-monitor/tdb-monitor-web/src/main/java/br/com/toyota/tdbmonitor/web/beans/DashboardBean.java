package br.com.toyota.tdbmonitor.web.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.toyota.tdbmonitor.web.vo.FTPTransmissionStatusVO;
import br.com.toyota.tdbmonitor.web.vo.SVTTransmissionStatusVO;

@SessionScoped
@ManagedBean(name = "dashboardBean")
public class DashboardBean {
	
	private List<FTPTransmissionStatusVO> ftpTransmissionList;
	
	private List<SVTTransmissionStatusVO> svtTransmissionList;
	
	@PostConstruct
	public void init() {
		loadDashboardData();
	}
	
	private void loadDashboardData() {
		populateFTPTransmissionStatus();
		populateSVTTransmissionStatus();
	}
	
	private void populateFTPTransmissionStatus() {
		
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
	
	private void populateSVTTransmissionStatus() {
		
		svtTransmissionList = new ArrayList<SVTTransmissionStatusVO>();
		Calendar calendar = Calendar.getInstance();
		
		SVTTransmissionStatusVO teste1 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, -19);
		teste1.setDate(calendar.getTime());
		teste1.setNumOfPending(32548);
		teste1.setNumOfErrors(5255);
		
		SVTTransmissionStatusVO teste2 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste2.setDate(calendar.getTime());
		teste2.setNumOfPending(57895);
		teste2.setNumOfErrors(1256);
		
		SVTTransmissionStatusVO teste3 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste3.setDate(calendar.getTime());
		teste3.setNumOfPending(44963);
		teste3.setNumOfErrors(8423);
		
		SVTTransmissionStatusVO teste4 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste4.setDate(calendar.getTime());
		teste4.setNumOfPending(85348);
		teste4.setNumOfErrors(3624);
		
		SVTTransmissionStatusVO teste5 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste5.setDate(calendar.getTime());
		teste5.setNumOfPending(75348);
		teste5.setNumOfErrors(5478);
		
		SVTTransmissionStatusVO teste6 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste6.setDate(calendar.getTime());
		teste6.setNumOfPending(45648);
		teste6.setNumOfErrors(2301);
		
		SVTTransmissionStatusVO teste7 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste7.setDate(calendar.getTime());
		teste7.setNumOfPending(36858);
		teste7.setNumOfErrors(7541);
		
		SVTTransmissionStatusVO teste8 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste8.setDate(calendar.getTime());
		teste8.setNumOfPending(15748);
		teste8.setNumOfErrors(1235);
		
		SVTTransmissionStatusVO teste9 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste9.setDate(calendar.getTime());
		teste9.setNumOfPending(87418);
		teste9.setNumOfErrors(4255);
		
		SVTTransmissionStatusVO teste10 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste10.setDate(calendar.getTime());
		teste10.setNumOfPending(42148);
		teste10.setNumOfErrors(3694);
		
		SVTTransmissionStatusVO teste11 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste11.setDate(calendar.getTime());
		teste11.setNumOfPending(20148);
		teste11.setNumOfErrors(988);
		
		SVTTransmissionStatusVO teste12 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste12.setDate(calendar.getTime());
		teste12.setNumOfPending(17548);
		teste12.setNumOfErrors(635);
		
		SVTTransmissionStatusVO teste13 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste13.setDate(calendar.getTime());
		teste13.setNumOfPending(26548);
		teste13.setNumOfErrors(3255);
		
		SVTTransmissionStatusVO teste14 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste14.setDate(calendar.getTime());
		teste14.setNumOfPending(63418);
		teste14.setNumOfErrors(9521);
		
		SVTTransmissionStatusVO teste15 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste15.setDate(calendar.getTime());
		teste15.setNumOfPending(19848);
		teste15.setNumOfErrors(2355);
		
		SVTTransmissionStatusVO teste16 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste16.setDate(calendar.getTime());
		teste16.setNumOfPending(36748);
		teste16.setNumOfErrors(4210);
		
		SVTTransmissionStatusVO teste17 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste17.setDate(calendar.getTime());
		teste17.setNumOfPending(47148);
		teste17.setNumOfErrors(6325);
		
		SVTTransmissionStatusVO teste18 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste18.setDate(calendar.getTime());
		teste18.setNumOfPending(30214);
		teste18.setNumOfErrors(4857);
		
		SVTTransmissionStatusVO teste19 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste19.setDate(calendar.getTime());
		teste19.setNumOfPending(35214);
		teste19.setNumOfErrors(9652);
		
		SVTTransmissionStatusVO teste20 = new SVTTransmissionStatusVO();
		calendar.add(Calendar.DATE, 1);
		teste20.setDate(calendar.getTime());
		teste20.setNumOfPending(39548);
		teste20.setNumOfErrors(4125);
		
		svtTransmissionList.add(teste1);
		svtTransmissionList.add(teste2);
		svtTransmissionList.add(teste3);
		svtTransmissionList.add(teste4);
		svtTransmissionList.add(teste5);
		svtTransmissionList.add(teste6);
		svtTransmissionList.add(teste7);
		svtTransmissionList.add(teste8);
		svtTransmissionList.add(teste9);
		svtTransmissionList.add(teste10);
		svtTransmissionList.add(teste11);
		svtTransmissionList.add(teste12);
		svtTransmissionList.add(teste13);
		svtTransmissionList.add(teste14);
		svtTransmissionList.add(teste15);
		svtTransmissionList.add(teste16);
		svtTransmissionList.add(teste17);
		svtTransmissionList.add(teste18);
		svtTransmissionList.add(teste19);
		svtTransmissionList.add(teste20);
		
	}

	public List<FTPTransmissionStatusVO> getFtpTransmissionList() {
		return ftpTransmissionList;
	}

	public void setFtpTransmissionList(List<FTPTransmissionStatusVO> ftpTransmissionList) {
		this.ftpTransmissionList = ftpTransmissionList;
	}

	public List<SVTTransmissionStatusVO> getSvtTransmissionList() {
		return svtTransmissionList;
	}

	public void setSvtTransmissionList(List<SVTTransmissionStatusVO> svtTransmissionList) {
		this.svtTransmissionList = svtTransmissionList;
	}
}
