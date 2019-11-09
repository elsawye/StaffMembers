package m;

public class Executive extends Employee {

	double bonus;

	public Executive(String name, String address, String phone, String SocialSecurityNumber, int PayRate,
			double bonus) {
		super(name, address, phone, SocialSecurityNumber, PayRate);
		this.bonus = 0;
	}

	public void awardbonus(double bonus) {
		this.bonus = bonus;

	}

	public String toString() {
		String toReturn = super.toString() + "Bonus:" + this.bonus;

		return toReturn;
	}

	public double pay() {
		double pay = this.PayRate + this.bonus;
		this.bonus = 0;
		return pay;
	}
}
