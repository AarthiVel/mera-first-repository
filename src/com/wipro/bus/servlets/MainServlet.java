package com.wipro.bus.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bus.bean.ScheduleBean;
import com.wipro.bus.service.Administrator;


@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	public String addschedule(HttpServletRequest request) {
	ScheduleBean scheduleBean = new ScheduleBean();

	
	String source=request.getParameter("source");
	String dest=request.getParameter("destination");
	String start=request.getParameter("startTime");
	String arrival=request.getParameter("arrivalTime");
	
	scheduleBean.setSource(source);
	scheduleBean.setDestination(dest);
	scheduleBean.setStartTime(start);
	scheduleBean.setArrivalTime(arrival);
	
	Administrator admin=new Administrator();
	return admin.addSchedule(scheduleBean);
	}
	public String addSchedule(HttpServletRequest request) {
		Administrator admin=new Administrator();
		
		
	
	}
	public ArrayList<ScheduleBean> viewSchedule(HttpServletRequest request){

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
