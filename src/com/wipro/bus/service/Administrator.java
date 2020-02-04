package com.wipro.bus.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wipro.bus.bean.ScheduleBean;
import com.wipro.bus.dao.ScheduleDAO;
import com.wipro.bus.util.DBUtil;

public class Administrator {
	public String addSchedule(ScheduleBean scheduleBean) {
		ScheduleDAO scheduleDAO=new ScheduleDAO();
		if(scheduleBean.getSource().equals(scheduleBean.getDestination())) {
			return "Source and Destination Same";
		}else {
			String sId=scheduleDAO.generateID(scheduleBean.getSource(), schedule)
					return scheduleDAO.createSchedule(scheduleBean);
		}
	}
	publicArrayList<ScheduleBean> viewSchedule(String source,String destination){
           ScheduleDAO scheduleDAO=new ScheduleDAO();
           return scheduleDAO.viewSchedule(source, destination);
	}

}
