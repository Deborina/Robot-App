package com.roboapp.services;

import com.roboapp.bean.Battery;
import com.roboapp.bean.RobotServiceRequest;
import com.roboapp.bean.RobotServiceResponse;

public interface RobotService {
public RobotServiceResponse execute(Battery battery,RobotServiceRequest request);
}
