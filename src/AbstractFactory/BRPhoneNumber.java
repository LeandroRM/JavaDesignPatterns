package AbstractFactory;

public class BRPhoneNumber extends PhoneNumber {

	private static final String COUNTRY_CODE = "BR";
	private static final int NUMBER_LENGTH = 11;
	
	@Override
	public String getCountryCode() {
		return COUNTRY_CODE;
	}
	
	@Override
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() == NUMBER_LENGTH) {
			super.setPhoneNumber(phoneNumber);
		}
	}
}
