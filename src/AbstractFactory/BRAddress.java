package AbstractFactory;

public class BRAddress extends Address {

	private static final String COUNTRY = "BRASIL";
	private static final String COMMA = ",";
	
	
	@Override
	public String getCountry() {
		return COUNTRY;
	}

	@Override
	public String getFullAddress() {
		return getStreet() + EOL_STRING + getCity() 
				+ COMMA + SPACE + getRegion() 
				+ SPACE + getPostalCode() + EOL_STRING 
				+ getCountry() + EOL_STRING;
	}
}
