package samp08;

public class VehicleImpl implements Vehicle {
	private String name;
	private String rider;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRider() {
		return rider;
	}

	public void setRider(String rider) {
		this.rider = rider;
	}

	public void ride() {
		System.out.println(name+"가 "+rider+"를 탄다");
	}
	
}
