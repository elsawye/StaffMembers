package m;

public class Hourly extends Employee {

	int hoursworked;

	public Hourly(String name, String address, String phone, String SocialSecurityNumber, double PayRate,
			double bonus) {
		super(name, address, phone, SocialSecurityNumber, PayRate);
		this.hoursworked = 0;
	}

	public String toString() {
		String toReturn = super.toString() + "Hoursworked:" + this.hoursworked;

		return toReturn;
	}

	public double pay() {
		return PayRate + hoursworked;
	}
}