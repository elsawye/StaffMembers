package m;

public abstract class StaffMember {

	String name;
	String address;
	String phone;

	public StaffMember(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String toString() {
		String toReturn = "Name: " + this.name + "/n" + "address:" + this.address + "/n" + "phone" + this.phone + "/n";

		return toReturn;
	}

	public abstract double pay();
}
