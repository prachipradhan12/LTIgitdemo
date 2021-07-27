package com.lti.model;

public class DegreeCourse extends Course {
	DegreeLevel degreeLevel;
	boolean isPlacementAvailable;

	public DegreeCourse() {
		super();// calls default constructor of parent class

	}

	public DegreeCourse(int id, String name, int duration, double fees, DegreeLevel degreeLevel,
			boolean isPlacementAvailable) {
		super(id, name, duration, fees);
		this.degreeLevel = degreeLevel;
		this.isPlacementAvailable = isPlacementAvailable;

	}

	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}

	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}

	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public void calculateMonthlyFee() {
		System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());
		super.calculateMonthlyFee();//reused base class method
		if(isPlacementAvailable) {
		System.out.println("Total Fees "+(super.getFees()*1.1));
		System.out.println("in addition to monthly fee you need to pay"+(super.getFees()*0.1)+"as placement fee");
	}
		else {
			System.out.println("Total Fees "+(super.getFees()));
		}

}
}