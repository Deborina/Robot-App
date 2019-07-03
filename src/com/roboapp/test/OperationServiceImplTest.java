package com.roboapp.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.roboapp.bean.Battery;
import com.roboapp.bean.RobotServiceRequest;
import com.roboapp.exceptions.SystemException;
import com.roboapp.main.StartApp;

public class OperationServiceImplTest {

	RobotServiceRequest request= null;
	
	Battery battery= null;
	StartApp sApp = null;

	@Before
	public void setUp() throws Exception {
		 request= new RobotServiceRequest();
		request.setCarryingWeight(true);
		request.setWeightAmount(12);
		
		 battery= new Battery(100,0,100);
		 sApp = new StartApp();	
	}
@Rule
public ExpectedException exception=ExpectedException.none();
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInputExcessWeightOutputOverweight() {
		//fail("Not yet implemented");
		sApp.displayResults(battery, request);
		//exception.expect(SystemException.class);
		exception.expectMessage("OVERWEIGHT");
	}

}
