package AbstractFactory;

public class BRAddressFactory implements AddressFactory {

	@Override
	public Address createAddress() {
		return new BRAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		return new BRPhoneNumber();
	}
}
