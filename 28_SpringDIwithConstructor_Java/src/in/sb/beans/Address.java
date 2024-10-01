package in.sb.beans;

public class Address {
	private int houseNo;
	private String landmark;
	private String city;
	
	public Address(int houseNo, String landmark, String city) {
		super();
		this.houseNo = houseNo;
		this.landmark = landmark;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", landmark=" + landmark + ", city=" + city + "]";
	}
	

}
