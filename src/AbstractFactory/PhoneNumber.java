package AbstractFactory;

public abstract class PhoneNumber {

	private String phoneNumber;
	
	public abstract String getCountryCode();
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		phoneNumber = phoneNumber.replace("(", "").replace(")", "")
				.replace("-", "").replace(" ", "").trim();
		this.phoneNumber = phoneNumber;
	}
}
