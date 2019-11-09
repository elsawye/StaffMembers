package m;

public class Employee extends StaffMember {

	String SocialSecurityNumber;
	double PayRate;

	public Employee(String name, String address, String phone, String SocialSecurityNumber, double PayRate) {
		super(name, address, phone);
		this.SocialSecurityNumber = SocialSecurityNumber;
		this.PayRate = PayRate;
	}

	public String toString() {
		String toReturn = super.toString() + "SocialSecurityNumber" + this.SocialSecurityNumber + "/n" + "PayRate"
				+ this.PayRate;

		return toReturn;
	}

	public double pay() {
		return PayRate;
	}

}
