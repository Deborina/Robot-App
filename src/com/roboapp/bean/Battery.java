package com.roboapp.bean;

public class Battery {

	private long initialCharge;
	private long usedCharge;
	private long remainingCharge;
	
	public Battery() {
		// TODO Auto-generated constructor stub
	}

	

	public Battery(long initialCharge, long usedCharge, long remainingCharge) {
		super();
		this.initialCharge = initialCharge;
		this.usedCharge = usedCharge;
		this.remainingCharge = remainingCharge;
	}



	public long getInitialCharge() {
		return initialCharge;
	}

	public void setInitialCharge(long initialCharge) {
		this.initialCharge = initialCharge;
	}

	public long getUsedCharge() {
		return usedCharge;
	}

	public void setUsedCharge(long usedCharge) {
		this.usedCharge = usedCharge;
	}

	public long getRemainingCharge() {
		return remainingCharge;
	}

	public void setRemainingCharge(long remainingCharge) {
		this.remainingCharge = remainingCharge;
	}

	
}
