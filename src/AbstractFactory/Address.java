package AbstractFactory;

public abstract class Address {
	
	public static final String EOL_STRING = System.getProperty("line.separator");
	public static final String SPACE = " ";
	
	private String street;
	private String city;
	private String region;
	private String postalCode;
	
	public abstract String getCountry();
	
	public String getFullAddress() {
		String fullAddress = street + EOL_STRING
							+ city + SPACE 
							+ postalCode + EOL_STRING;
		return fullAddress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
