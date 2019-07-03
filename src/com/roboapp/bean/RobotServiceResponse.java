package com.roboapp.bean;

import com.roboapp.exceptions.SystemException;

public class RobotServiceResponse {

	private Battery batteryStatus;
   private SystemException systemError;
	public SystemException getSystemError() {
	return systemError;
}

public void setSystemError(SystemException systemError) {
	this.systemError = systemError;
}

	public Battery getBatteryStatus() {
		return batteryStatus;
	}

	public void setBatteryStatus(Battery batteryStatus) {
		this.batteryStatus = batteryStatus;
	}
	
	
	
}
