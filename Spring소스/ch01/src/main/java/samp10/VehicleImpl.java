package samp10;

public class VehicleImpl implements Vehicle{
	private String name;
	private String rider;
	private Output output;

	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}

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
		
		String msg = name+"가 "+rider+"를 탄다";
		output.out(msg);
		System.out.println(msg);
	}
	
}
