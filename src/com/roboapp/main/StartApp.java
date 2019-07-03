package com.roboapp.main;

import java.util.Scanner;

import com.roboapp.bean.Battery;
import com.roboapp.bean.RobotServiceRequest;
import com.roboapp.bean.RobotServiceResponse;
import com.roboapp.services.RobotService;
import com.roboapp.servicesImpl.OperationServiceImpl;

public class StartApp {

	public void displayResults(Battery batteryStatus,RobotServiceRequest request){
		RobotServiceResponse response=null;
		RobotService service= new OperationServiceImpl(request);
		response=service.execute(batteryStatus, request);
		if(null!=response){
			if(null!=response.getSystemError()){
				System.out.println(response.getSystemError().getMessage());
			}
			else{
			System.out.println("Battery initial Charge :"+response.getBatteryStatus().getInitialCharge()+"%");
			System.out.println("Battery Remaining Charge :"+response.getBatteryStatus().getRemainingCharge()+"%");
			System.out.println("Battery charge consumed :"+response.getBatteryStatus().getUsedCharge()+"%");
			System.out.println();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		double distance=0.0;
		double weight=0.0;
		do{
		System.out.println(" Please Enter how much distance Robot walks");
		String distanceEntered=scanner.next();
		System.out.println(" Please Enter how much weight the Robot carries");
		String weightEntered=scanner.next();
		 distance=Double.parseDouble(distanceEntered);
		 weight=Double.parseDouble(weightEntered);
		 if((distance<0.0)||(weight<0.0))
		 {System.out.println("Please enter positive numbers for both");
			 
		 }
		}
		while((distance<0.0)||(weight<0.0));
		RobotServiceRequest req= new RobotServiceRequest();
		if((distance>0.0) &&(weight>0.0))	{
			req.setCarryingWeight(true);
			req.setWeightAmount(weight);
			req.setWalking(true);
			req.setDistanceWalked(distance);
		}
		else if((distance>0.0) &&(weight<=0.0))
		{
			req.setCarryingWeight(false);
			req.setWeightAmount(weight);
			req.setWalking(true);
			req.setDistanceWalked(distance);
		}
		else{
			req.setCarryingWeight(true);
			req.setWeightAmount(weight);
			req.setWalking(false);
			req.setDistanceWalked(distance);
		}
		Battery battery= new Battery(100,0,100);
		StartApp sApp = new StartApp();
		sApp.displayResults(battery, req);

	}

}
