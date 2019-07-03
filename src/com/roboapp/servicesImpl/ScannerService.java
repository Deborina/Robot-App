package com.roboapp.servicesImpl;

import com.roboapp.bean.Battery;
import com.roboapp.bean.RobotServiceRequest;
import com.roboapp.bean.RobotServiceResponse;
import com.roboapp.services.RobotService;

public class ScannerService implements RobotService {
private Battery battery;

	public ScannerService(Battery battery) {
	super();
	this.battery = battery;
}

	@Override
	public RobotServiceResponse execute(Battery battery,
			RobotServiceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
