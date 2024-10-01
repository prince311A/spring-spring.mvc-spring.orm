package in.sb.beans;

public class Address {
	private int houseNo;
	private String landmark;
	private String city;
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", landmark=" + landmark + ", city=" + city + "]";
	}
	

}
