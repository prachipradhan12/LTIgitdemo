package com.lti.model;

public class DiplomaCourse extends Course {
	private Type type;
	

	public DiplomaCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DiplomaCourse(int id, String name, int duration, double fees,Type type) {
		super(id, name, duration, fees);
		this.type=type;
		
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	public void calculateMonthlyFees() {
				super.calculateMonthlyFee();
				System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());

		if(type.name().equals("Professional")) {
			System.out.println("Total Fees: "+(super.getFees()*1.1));
		}
		else {
			System.out.println("Total Fees: "+(super.getFees()*1.05));
		}
		
	}

}
