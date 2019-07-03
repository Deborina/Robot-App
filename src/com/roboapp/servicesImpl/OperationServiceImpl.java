/**
 * 
 */
package com.roboapp.servicesImpl;

import com.roboapp.bean.Battery;
import com.roboapp.bean.RobotServiceRequest;
import com.roboapp.bean.RobotServiceResponse;
import com.roboapp.exceptions.SystemException;
import com.roboapp.main.RobotSystemErrors;
import com.roboapp.services.RobotService;

/**
 * @author Debo
 *
 */
public class OperationServiceImpl implements RobotService {
private RobotServiceRequest request;
	/* (non-Javadoc)
	 * @see com.roboapp.services.RobotService#displaySystemError()
	 */
	
	

	public OperationServiceImpl(RobotServiceRequest request) {
		super();
		this.request = request;
	}

	@Override
	public RobotServiceResponse execute(Battery battery,RobotServiceRequest request) {
		// TODO Auto-generated method stub
		 double distanceWalked=0.0;
		 double weightAmount=0.0;
	RobotServiceResponse response= new RobotServiceResponse();
	if(null!=request){
	  distanceWalked=request.getDistanceWalked();
	  weightAmount=request.getWeightAmount();
	}
	 long chargeConsumed=0;
		while(battery.getRemainingCharge()>0){
			if(battery.getRemainingCharge()<15)
			{
				response.setSystemError(new SystemException(RobotSystemErrors.LOWBATTERY.toString()));
				break;
			}
			
			if(request.isCarryingWeight()&&(request.getWeightAmount()>10)){
			
				response.setSystemError(new SystemException(RobotSystemErrors.OVERWEIGHT.toString()));
			break;
			}
			else if((request.isCarryingWeight())&&(!request.isWalking())){
				chargeConsumed=Math.round((weightAmount*2));
				battery.setUsedCharge(chargeConsumed);
				battery.setRemainingCharge(battery.getInitialCharge()-battery.getUsedCharge());
				break;
			}
			else if((!request.isCarryingWeight())&&(request.isWalking())){
				chargeConsumed=Math.round((5/distanceWalked));
				battery.setUsedCharge(chargeConsumed);
				battery.setRemainingCharge(battery.getInitialCharge()-battery.getUsedCharge());
				break;
			}
			else{
				chargeConsumed=Math.round(((weightAmount*2)+((5/distanceWalked))));
				battery.setUsedCharge(chargeConsumed);
				battery.setRemainingCharge(battery.getInitialCharge()-battery.getUsedCharge());
				break;
			}
			//battery.setRemainingCharge(battery.getRemainingCharge());
		}
		response.setBatteryStatus(battery);
		//response.setSystemError(systemError);
		return response;
		
	}

}
