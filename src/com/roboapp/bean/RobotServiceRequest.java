package com.roboapp.bean;

public class RobotServiceRequest {

	
	private double distanceWalked;
	private boolean isCarryingWeight;
	private boolean isWalking;
	private double weightAmount;
	public double getDistanceWalked() {
		return distanceWalked;
	}
	public void setDistanceWalked(double distanceWalked) {
		this.distanceWalked = distanceWalked;
	}
	public boolean isCarryingWeight() {
		return isCarryingWeight;
	}
	public void setCarryingWeight(boolean isCarryingWeight) {
		this.isCarryingWeight = isCarryingWeight;
	}
	public double getWeightAmount() {
		return weightAmount;
	}
	public void setWeightAmount(double weightAmount) {
		this.weightAmount = weightAmount;
	}
	public boolean isWalking() {
		return isWalking;
	}
	public void setWalking(boolean isWalking) {
		this.isWalking = isWalking;
	}
	
}
